package com.example.openfoodfactesgi

import android.util.Log
import androidx.lifecycle.*
import androidx.navigation.NavDirections
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.openfoodfactesgi.models.ProductDTO
import com.example.openfoodfactesgi.models.ProductMapper
import com.example.openfoodfactesgi.services.NetworkProviderOppAPI
import com.example.openfoodfactesgi.services.OppAPI
import com.example.openfoodfactesgi.services.getProduct
import com.example.openfoodfactesgi.services.getProductResult
import com.google.gson.JsonObject
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ScanBarcodeViewModel : ViewModel() {

    val progressState: LiveData<Boolean> get() = _progressState
    private val _progressState = MutableLiveData<Boolean>()

    val navigation: LiveData<NavDirections?> get() = _navigation
    private val _navigation = MutableLiveData<NavDirections?>()

    init {
        _progressState.value = false
    }

    fun searchBarcode(barcode: String) {
        _progressState.value = true
        viewModelScope.launch {
            delay(1000)
            _navigation.value =
                ScanBarcodeFragmentDirections.scanDestinationToSuccessDestination(barcode)
            _progressState.value = false
            Log.d("testCodeBar", barcode)
            val product = NetworkProviderOppAPI.buildService(OppAPI::class.java)
            val call = product.getProduct(barcode)

            call.enqueue(object : Callback<getProductResult> {
                override fun onResponse(
                    call: Call<getProductResult>,
                    response: Response<getProductResult>
                ) {

                    Log.d("apiResponse", response.body().toString())
                    //val product = ProductMapper.map(response.body())
                    Log.d("apiResponse", product.toString())
                    Log.d("testCodeBar", barcode)

                }

                override fun onFailure(call: Call<getProductResult>, t: Throwable) {
                    Log.d("LOGIN", "onFailure: $t")
                }
            }
            )
        }
    }
    fun doneNavigating() {
        _navigation.value = null
    }
}