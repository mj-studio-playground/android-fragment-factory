package happy.mjstudio.fragmentfactorydagger

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import happy.mjstudio.fragmentfactorydagger.dep.Dependency
import kotlinx.android.synthetic.main.fragment_main.*
import javax.inject.Inject

/**
 * Created by mj on 03, December, 2019
 */
class MainFragment @Inject constructor(private val myDependency: Dependency) : Fragment() {

    companion object {

        private const val ARG_STRING = "ARG_STRING"

        fun newArgBundle(arg : String) = Bundle().apply {
            putString(ARG_STRING,arg)
        }
    }

    private val arg : String by lazy { arguments?.getString(ARG_STRING) ?: "No Arg" }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_main, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        dep_tv.text = arg
    }

}