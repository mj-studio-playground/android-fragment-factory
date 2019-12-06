package happy.mjstudio.fragmentfactorydagger

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import happy.mjstudio.fragmentfactorydagger.dep.Dependency
import kotlinx.android.synthetic.main.fragment_main.*
import timber.log.Timber
import javax.inject.Inject

/**
 * Created by mj on 03, December, 2019
 */
class MainFragment @Inject constructor(private val myDependency: Dependency) : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_main, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Timber.e("Hi $this")
        dep_tv.text = myDependency.sayMyName()
    }

}