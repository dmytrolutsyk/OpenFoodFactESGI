package com.example.openfoodfactesgi

import android.media.Image
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.openfoodfactesgi.models.Nutriscore
import com.example.openfoodfactesgi.models.Product
import kotlinx.android.synthetic.main.fragment_product.*
import kotlinx.android.synthetic.main.fragment_product.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ProductFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ProductFragment : Fragment() {
    //private var productName: String? = null
    private var productName: String? = Singleton.productObject?.productName
    //private var quantity: String? = null
    private var quantity: Long? = Singleton.productObject?.productQuantity
    lateinit var productNameText: TextView
    lateinit var productQuantity: TextView
    lateinit var productStores: TextView
    lateinit var productIMG: ImageView
    lateinit var productGradeIMG: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.d("testpro", Singleton.productObject?.productName.toString())

        var product: Product? = Singleton.productObject
        var productN: String? = Singleton.productObject?.productName
        val productView = inflater!!.inflate(R.layout.fragment_product, container, false)

        (activity as? AppCompatActivity)?.supportActionBar?.title = product?.productName.toString()

        //productNameText = productView.findViewById(R.id.NameProductTV)
        productQuantity = productView.findViewById(R.id.quantityTV)
        productIMG = productView.findViewById(R.id.productIM)
        productGradeIMG = productView.findViewById(R.id.productGradeIMG)
        productStores = productView.findViewById(R.id.StoresTV)
        if (product?.imageThumbURL != null) {
            Glide.with(this).load(product.imageThumbURL.toString()).circleCrop().into(productIMG);
        }
        //productNameText?.setText(productN)
        productQuantity?.setText( "Quantité : " + product?.productQuantity.toString() + "mL")
        productStores?.setText( "Magasins : " + product?.stores.toString() )
        productGradeIMG.setImageResource(getNutriscore(product?.nutriscoreGrade.toString().toUpperCase()))


        return productView
    }

    fun getNutriscore(productGrade: String) : Int {

        when (productGrade) {
            Nutriscore.A.name -> return R.drawable.gradea
            Nutriscore.B.name -> return R.drawable.gradeb
            Nutriscore.C.name -> return R.drawable.gradec
            Nutriscore.D.name -> return R.drawable.graded
            Nutriscore.E.name -> return R.drawable.gradee
            else -> { // Note the block
                print("Not Possible")
                return 0
            }
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ProductFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ProductFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}