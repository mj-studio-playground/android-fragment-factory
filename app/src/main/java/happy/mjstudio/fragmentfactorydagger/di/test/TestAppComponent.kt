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

    @Component.Builder
    interface TestBuilder {
        @BindsInstance
        fun app(app: Application): TestBuilder
        fun build(): TestComponent
    }

    fun fragmentFactory() : FragmentFactory

}


