package happy.mjstudio.fragmentfactorydagger.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import happy.mjstudio.fragmentfactorydagger.MainActivity

/**
 * Created by mj on 04, December, 2019
 */
@Module
abstract class ActivityModule {

    @ActivityScoppe
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun contributeMainActivity() : MainActivity

}