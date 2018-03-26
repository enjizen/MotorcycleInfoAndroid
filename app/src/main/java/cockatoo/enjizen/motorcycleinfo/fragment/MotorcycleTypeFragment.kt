package cockatoo.enjizen.motorcycleinfo.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import cockatoo.enjizen.motorcycleinfo.R


/**
 * A simple [Fragment] subclass.
 */
class MotorcycleTypeFragment : Fragment() {

    private var listener: MainFragment.FragmentListener? = null

    companion object {
        fun newInstance(brand: String): MotorcycleTypeFragment {
            val bundle = Bundle()
            bundle.putString("brand", brand)
            val fragment = MotorcycleTypeFragment()
            fragment.arguments = bundle
            return fragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        listener = activity as MainFragment.FragmentListener?
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? =
            inflater.inflate(R.layout.fragment_motorcycle_type, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        listener!!.onSetTitleToolbar(getString(R.string.title_select_type))
    }


    interface FragmentListener {
        fun onSetTitleToolbar(title: String)
    }

}
