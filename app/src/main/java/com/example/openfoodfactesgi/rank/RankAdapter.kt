package com.example.openfoodfactesgi.rank

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.openfoodfactesgi.R
import com.example.openfoodfactesgi.model.RankModel
import com.example.openfoodfactesgi.model.SuccessModel

class RankAdapter : RecyclerView.Adapter<RankAdapter.SucessViewHolder>() {

    var allRanks: MutableList<RankModel> = ArrayList<RankModel>()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RankAdapter.SucessViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.row_success_recycler_view, parent, false)
        return SucessViewHolder(view)
    }

    override fun onBindViewHolder(holder: RankAdapter.SucessViewHolder, position: Int) {
        holder.successTitle.text = allRanks[position].name
        holder.successDescription.text = allRanks[position].numero

        ////Glide.with(weaponViewHolder.itemView).load(weapon.getPictureUrl()).into(weaponViewHolder.pictureImv);
    }

    override fun getItemCount(): Int {
        return allRanks.size
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
    fun setRanks(rankList: MutableList<RankModel>?) {
        if (rankList != null) {
            this.allRanks = rankList
            notifyDataSetChanged()
        }
    }
}