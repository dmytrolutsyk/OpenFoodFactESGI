package com.example.openfoodfactesgi.success

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.openfoodfactesgi.R
import com.example.openfoodfactesgi.models.SuccessModel


class SuccessListFragment : Fragment() {

    private var recyclerViewSuccess: RecyclerView? = null
    private var recyclerSuccessAdapter: SuccessAdapter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var root: View = inflater.inflate(R.layout.fragment_success_list, container, false)
        recyclerViewSuccess?.layoutManager = LinearLayoutManager(activity);

        recyclerViewSuccess = root.findViewById(R.id.success_list_fragment_recycler_view)
        recyclerViewSuccess?.layoutManager = LinearLayoutManager(activity);
        initRecyclerView();

        var d =  SuccessModel("0", "succes 1", "description de ouf", "")
        var de =  SuccessModel("0", "succes 1", "description de ouf", "")
        var r =  SuccessModel("0", "succes 1", "description de ouf", "")
        var e =  SuccessModel("0", "succes 1", "description de ouf", "")
        var allSucess: MutableList<SuccessModel> = ArrayList<SuccessModel>()
        allSucess.add(d)
        allSucess.add(de)
        allSucess.add(r)
        allSucess.add(e)
        recyclerSuccessAdapter?.setSuccess(allSucess)
        recyclerSuccessAdapter?.notifyDataSetChanged();
        // Inflate the layout for this fragment
        return root
    }

    private fun initRecyclerView()
    {
        recyclerViewSuccess?.layoutManager = LinearLayoutManager (context);
        recyclerSuccessAdapter = SuccessAdapter();
        recyclerViewSuccess?.adapter = recyclerSuccessAdapter;
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SuccessListFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}