package com.example.openfoodfactesgi.success

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.openfoodfactesgi.R
import com.example.openfoodfactesgi.dto.DTOSuccess
import com.example.openfoodfactesgi.mapper.SuccessMapper
import com.example.openfoodfactesgi.models.SuccessModel
import com.example.openfoodfactesgi.services.NetworkProviderAPI
import com.example.openfoodfactesgi.services.SuccessApiService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlin.math.log


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
        initRecyclerView()
        getUserSuccess()


        // Inflate the layout for this fragment
        return root
    }

    private fun initRecyclerView()
    {
        recyclerViewSuccess?.layoutManager = LinearLayoutManager (context);
        recyclerSuccessAdapter = SuccessAdapter();
        recyclerViewSuccess?.adapter = recyclerSuccessAdapter;
    }

    private fun getUserSuccess() {
        val successService = NetworkProviderAPI.buildService(SuccessApiService::class.java)
        val call = successService.getSuccess()

        call.enqueue(object : Callback<List<DTOSuccess?>> {


            override fun onResponse(call: Call<List<DTOSuccess?>>, response: Response<List<DTOSuccess?>>
            ) {
                val successListDTO : List<DTOSuccess?>? = response.body()
                var successListModel: MutableList<SuccessModel> = SuccessMapper.mapsuccessModelList(successListDTO) as MutableList<SuccessModel>
                Log.d("GETSUCCESS", "onResponse: " + successListModel)

                //var allSucess: MutableList<SuccessModel> = ArrayList<SuccessModel>()

                recyclerSuccessAdapter?.setSuccess(successListModel)
                recyclerSuccessAdapter?.notifyDataSetChanged();

                //  val userAvatarBase64 = user?.picturePerso

                //val succesAvatar = successAvatarBase64?.replace("data:image/png;base64,", "")



                // val intent = Intent(this@LoginActivity, FirstConnexion::class.java)
                //startActivity(intent)
            }


            override fun onFailure(call: Call<List<DTOSuccess?>>, t: Throwable) {
                Log.d("GETSUCCESS", "onFailure: $t")
            }

        })
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