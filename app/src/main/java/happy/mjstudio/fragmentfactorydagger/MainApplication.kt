package happy.mjstudio.fragmentfactorydagger

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import happy.mjstudio.fragmentfactorydagger.di.DaggerAppComponent
import timber.log.Timber

/**
 * Created by mj on 03, December, 2019
 */
class MainApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.factory().create(this)
    }

    override fun onCreate() {
        super.onCreate()

        Timber.plant(Timber.DebugTree())
    }
}