package com.example.openfoodfactesgi.products

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.openfoodfactesgi.R
import com.example.openfoodfactesgi.models.Product

class ProductsAdapter : RecyclerView.Adapter<ProductsAdapter.SucessViewHolder>() {

    var allProducts: MutableList<Product> = ArrayList<Product>()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProductsAdapter.SucessViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.row_product_recycler_view, parent, false)
        return SucessViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductsAdapter.SucessViewHolder, position: Int) {
        holder.successTitle.text = allProducts[position].productName
        holder.successDescription.text = allProducts[position].nutriscoreGrade

        ////Glide.with(weaponViewHolder.itemView).load(weapon.getPictureUrl()).into(weaponViewHolder.pictureImv);
    }

    override fun getItemCount(): Int {
        return allProducts.size
    }


    inner class SucessViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var successTitle: TextView
        var successDescription: TextView
        var successImage: ImageView


        init {
            this.itemView.findViewById<View>(itemView.id)
            successTitle = itemView.findViewById(R.id.row_success_title)
            successDescription = itemView.findViewById(R.id.row_success_description)
            successImage = itemView.findViewById(R.id.row_success_image)

        }
    }
    fun setProducts(productsList: MutableList<Product>?) {
        if (productsList != null) {
            this.allProducts = productsList
            notifyDataSetChanged()
        }
    }
}