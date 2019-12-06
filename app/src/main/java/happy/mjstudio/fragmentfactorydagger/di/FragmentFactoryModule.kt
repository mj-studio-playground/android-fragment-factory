package happy.mjstudio.fragmentfactorydagger.di

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import dagger.Binds
import dagger.MapKey
import dagger.Module
import dagger.multibindings.IntoMap
import happy.mjstudio.fragmentfactorydagger.MainFragment
import happy.mjstudio.fragmentfactorydagger.MyFragmentFactory
import kotlin.reflect.KClass

/**
 * Created by mj on 06, December, 2019
 */
@Module
abstract class FragmentFactoryModule {

    @Binds
    abstract fun bindFragmentFactroy(factory : MyFragmentFactory) : FragmentFactory

    @Binds
    @IntoMap
    @FragmentKey(MainFragment::class)
    abstract fun bindMainFragment(fragment : MainFragment) : Fragment
}

@MapKey
annotation class FragmentKey(val clazz : KClass<out Fragment>)