package happy.mjstudio.fragmentfactorydagger

import android.widget.Toast
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import kotlinx.coroutines.runBlocking
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @Test
    fun showToast() = runBlocking<Unit> {
        val scenario = ActivityScenario.launch(MainActivity::class.java)
        lateinit var toast : Toast

        scenario.onActivity {
            Toast.makeText(it,"Hello, World!",Toast.LENGTH_LONG).also { toast = it }.show()
        }

        repeat(100) {
            onView(withText("hi")).perform(click())
        }
    }
}
