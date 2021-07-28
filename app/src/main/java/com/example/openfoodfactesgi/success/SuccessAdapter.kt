package com.example.openfoodfactesgi.success

import android.graphics.BitmapFactory
import android.util.Base64
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.openfoodfactesgi.R
import com.example.openfoodfactesgi.models.SuccessModel

class SuccessAdapter : RecyclerView.Adapter<SuccessAdapter.SucessViewHolder>(){
    var allSucess: MutableList<SuccessModel> = ArrayList<SuccessModel>()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SuccessAdapter.SucessViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.row_success_recycler_view, parent, false)
        return SucessViewHolder(view)
    }

    override fun onBindViewHolder(holder: SuccessAdapter.SucessViewHolder, position: Int) {
        holder.successTitle.text = allSucess[position].name
        holder.successDescription.text = allSucess[position].description
        Log.d("SUCCESS", "onBindViewHolder: "+ allSucess )

        val avatar = allSucess[position].image
        if (avatar != null) {
            val imageBytes = Base64.decode(avatar, 0)
            val userAvatar = BitmapFactory.decodeByteArray(imageBytes, 0, imageBytes.size)

            Glide.with(holder.successImage)
                .load(userAvatar)
                .circleCrop()
                .into(holder.successImage)
        }

    }

    override fun getItemCount(): Int {
        return allSucess.size
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
    fun setSuccess(successList: MutableList<SuccessModel>?) {
        if (successList != null) {
            this.allSucess = successList
            notifyDataSetChanged()
        }
    }
}
