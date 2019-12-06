package happy.mjstudio.fragmentfactorydagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentFactory
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject
import kotlin.random.Random


class MainActivity : AppCompatActivity(), HasAndroidInjector {

    @Inject
    lateinit var androidInjector : DispatchingAndroidInjector<Any>

    override fun androidInjector(): AndroidInjector<Any> {
        return androidInjector
    }

    @Inject
    lateinit var fragmentFactory : FragmentFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        supportFragmentManager.fragmentFactory = fragmentFactory
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        if(savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .setCustomAnimations(
                    R.anim.fragment_enter,
                    R.anim.fragment_exit,
                    R.anim.fragment_pop_enter,
                    R.anim.fragment_pop_exit)
                .add(fragmentContainerViewEmbed.id,MainFragment::class.java,null)
                .addToBackStack(null)
                .commit()
        }

        replace.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .setCustomAnimations(
                    R.anim.fragment_enter,
                    R.anim.fragment_exit,
                    R.anim.fragment_pop_enter,
                    R.anim.fragment_pop_exit)
                .replace(
                    fragmentContainerViewEmbed.id,
                    MainFragment::class.java,
                    MainFragment.newArgBundle("Hello, FragmentFactoy ${Random.nextInt(0,100)}"))
                .addToBackStack(null)
                .commit()
        }
    }

}
