package cockatoo.enjizen.motorcycleinfo.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import cockatoo.enjizen.motorcycleinfo.R
import cockatoo.enjizen.motorcycleinfo.constant.MotorBrand
import kotlinx.android.synthetic.main.fragment_main.*


/**
 * A simple [Fragment] subclass.
 */
class MainFragment : Fragment() {

    private var listener: FragmentListener? = null

    companion object {
        fun newInstance(): MainFragment{
            return  MainFragment()
        }
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

         listener = activity as FragmentListener?
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
            inflater.inflate(R.layout.fragment_main, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        listener!!.onSetTitleToolbar(getString(R.string.title_main))

        setListener()
    }

    private fun setListener() {

        yamaha.setOnClickListener {
            listener!!.onBrandClick(MotorBrand.YAMAHA)
        }

        honda.setOnClickListener {
            listener!!.onBrandClick(MotorBrand.HONDA)
        }

        suzuki.setOnClickListener {
            listener!!.onBrandClick(MotorBrand.SUZUKI)
        }

        kawasaki.setOnClickListener {
            listener!!.onBrandClick(MotorBrand.KAWASAKI)
        }

    }


    interface FragmentListener {
        fun onSetTitleToolbar(title: String)
        fun onBrandClick(brand:String)
    }

}