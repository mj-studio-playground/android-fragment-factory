package happy.mjstudio.fragmentfactorydagger

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import happy.mjstudio.fragmentfactorydagger.dep.Dependency
import javax.inject.Inject

/**
 * Created by mj on 05, December, 2019
 */
class MyFragmentFactory @Inject constructor(private val myDependency: Dependency) : FragmentFactory() {
    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
        return when(loadFragmentClass(classLoader,className)) {
            MainFragment::class.java -> MainFragment(myDependency)
            else -> super.instantiate(classLoader, className)
        }
    }
}