package com.example.openfoodfactesgi.rank

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.openfoodfactesgi.R
import com.example.openfoodfactesgi.model.RankModel
import com.example.openfoodfactesgi.model.SuccessModel

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class RankFragment : Fragment() {

    private var recyclerViewRank: RecyclerView? = null
    private var recyclerRankAdapter: RankAdapter? = null

    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var root: View = inflater.inflate(R.layout.fragment_list_rank, container, false)
        recyclerViewRank?.layoutManager = LinearLayoutManager(activity);

        recyclerViewRank = root.findViewById(R.id.rank_list_fragment_recycler_view)
        recyclerViewRank?.layoutManager = LinearLayoutManager(activity);
        initRecyclerView();

        var d =  RankModel("0", "succes 1", "description de ouf", "2","")
        var de =  RankModel("0", "succes 1", "description de ouf", "4","")
        var r =  RankModel("0", "succes 1", "description de ouf", "6","")
        var e =  RankModel("0", "succes 1", "description de ouf", "7","")
        var allSucess: MutableList<RankModel> = ArrayList<RankModel>()
        allSucess.add(d)
        allSucess.add(de)
        allSucess.add(r)
        allSucess.add(e)
        recyclerRankAdapter?.setRanks(allSucess)
        recyclerRankAdapter?.notifyDataSetChanged();

        // Inflate the layout for this fragment
        return root
    }

    private fun initRecyclerView()
    {
        recyclerViewRank?.layoutManager = LinearLayoutManager (context);
        recyclerRankAdapter = RankAdapter();
        recyclerViewRank?.adapter = recyclerRankAdapter;
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment RankFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            RankFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}