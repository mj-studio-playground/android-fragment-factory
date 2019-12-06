package happy.mjstudio.fragmentfactorydagger.dep

import android.app.Application
import javax.inject.Inject

/**
 * Created by mj on 03, December, 2019
 */
class Dependency @Inject constructor(
    private val app: Application
) : IDependency {
    override fun sayMyName(): String {
        return "My name is ${app.packageName}"
    }
}