package cockatoo.enjizen.motorcycleinfo.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import cockatoo.enjizen.motorcycleinfo.R
import cockatoo.enjizen.motorcycleinfo.fragment.MainFragment
import cockatoo.enjizen.motorcycleinfo.fragment.MotorcycleTypeFragment
import kotlinx.android.synthetic.main.toolbar.*

class MainActivity : AppCompatActivity(),MainFragment.FragmentListener
                                        ,MotorcycleTypeFragment.FragmentListener {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState == null){
            supportFragmentManager.beginTransaction()
                    .add(R.id.contentContainer,MainFragment.newInstance())
                    .commit()
        }
    }


    override fun onBrandClick(brand: String) {
        supportFragmentManager.beginTransaction()
                .addToBackStack(null)
                .replace(R.id.contentContainer,MotorcycleTypeFragment.newInstance(brand))
                .commit()
    }


    override fun onSetTitleToolbar( title: String) {
        titleToolbar.text = title
    }

}
