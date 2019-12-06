package happy.mjstudio.fragmentfactorydagger.di

import androidx.fragment.app.FragmentFactory
import dagger.Binds
import dagger.Module
import happy.mjstudio.fragmentfactorydagger.MyFragmentFactory

/**
 * Created by mj on 06, December, 2019
 */
@Module
abstract class FragmentFactoryModule {

    @Binds
    abstract fun bindFragmentFactroy(factory : MyFragmentFactory) : FragmentFactory
}