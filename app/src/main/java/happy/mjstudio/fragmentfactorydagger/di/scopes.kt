package happy.mjstudio.fragmentfactorydagger.di

import javax.inject.Scope

/**
 * Created by mj on 04, December, 2019
 */

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class AppScope

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class ActivityScoppe

@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class FragmentScope