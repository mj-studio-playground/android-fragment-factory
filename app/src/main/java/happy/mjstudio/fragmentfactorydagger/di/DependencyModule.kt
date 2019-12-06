package happy.mjstudio.fragmentfactorydagger.di

import dagger.Binds
import dagger.Module
import happy.mjstudio.fragmentfactorydagger.dep.Dependency
import happy.mjstudio.fragmentfactorydagger.dep.IDependency

/**
 * Created by mj on 04, December, 2019
 */
@Module
abstract class DependencyModule {
    @AppScope
    @Binds
    abstract fun bindDependency(dependency: Dependency): IDependency
}