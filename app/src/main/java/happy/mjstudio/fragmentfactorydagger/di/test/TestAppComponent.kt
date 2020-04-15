package happy.mjstudio.fragmentfactorydagger.di.test

import android.app.Application
import androidx.fragment.app.FragmentFactory
import dagger.BindsInstance
import dagger.Component
import happy.mjstudio.fragmentfactorydagger.di.AppScope
import happy.mjstudio.fragmentfactorydagger.di.DependencyModule
import happy.mjstudio.fragmentfactorydagger.di.FragmentFactoryModule

/**
 * Created by mj on 05, December, 2019
 */
@Component(
    modules = [
        DependencyModule::class,
        FragmentFactoryModule::class
    ]
)
@AppScope
interface TestComponent {

    @Component.Factory
    interface TestFactory {
        fun create(@BindsInstance app: Application): TestComponent
    }

    fun fragmentFactory() : FragmentFactory

}


