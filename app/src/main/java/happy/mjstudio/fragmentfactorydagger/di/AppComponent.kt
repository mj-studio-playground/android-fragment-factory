package happy.mjstudio.fragmentfactorydagger.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import happy.mjstudio.fragmentfactorydagger.MainApplication

/**
 * Created by mj on 04, December, 2019
 */
@Component(modules = [
AndroidSupportInjectionModule::class,
ActivityModule::class,
DependencyModule::class,
FragmentFactoryModule::class
        ])
@AppScope
interface AppComponent : AndroidInjector<MainApplication> {

    override fun inject(instance: MainApplication)

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance app: Application): AppComponent
    }

}