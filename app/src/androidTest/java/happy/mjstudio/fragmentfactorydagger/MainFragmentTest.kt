package happy.mjstudio.fragmentfactorydagger

import android.widget.Toast
import androidx.fragment.app.FragmentFactory
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import happy.mjstudio.fragmentfactorydagger.di.test.DaggerTestComponent
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainFragmentTest {

    private lateinit var fragmentFactory : FragmentFactory

    @Before
    fun setup() {
        val appComponent = DaggerTestComponent.builder().app(ApplicationProvider.getApplicationContext()).build()
        this.fragmentFactory = appComponent.fragmentFactory()
    }

    @Test
    fun testWithDaggerFragmentFieldInjection() {
        val scenario = launchFragmentInContainer<MainFragment>(factory = fragmentFactory)

        scenario.onFragment {
            Toast.makeText(it.requireContext(),"Hello FragmentFactory",Toast.LENGTH_LONG).show()
        }
    }

}

