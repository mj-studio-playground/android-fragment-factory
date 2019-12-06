package happy.mjstudio.fragmentfactorydagger.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import happy.mjstudio.fragmentfactorydagger.MainFragment

/**
 * Created by mj on 04, December, 2019
 */
@Module
abstract class MainActivityModule {

    @FragmentScope
    @ContributesAndroidInjector
    abstract fun contributeMainFragment() : MainFragment

}