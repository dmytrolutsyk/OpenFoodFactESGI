package com.example.openfoodfactesgi

import android.util.Log
import androidx.lifecycle.*
import androidx.navigation.NavDirections
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.openfoodfactesgi.models.ProductMapper
import com.example.openfoodfactesgi.models.ProductResponseDTO
import com.example.openfoodfactesgi.services.NetworkProviderOppAPI
import com.example.openfoodfactesgi.services.OppAPI
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
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

            call.enqueue(object : Callback<ProductResponseDTO?> {
                override fun onResponse(call: Call<ProductResponseDTO?>, response: Response<ProductResponseDTO?>) {
                    Log.d("apiResponse", response.body().toString())
                    var resDTO = response.body()
                    var productRes = ProductMapper.mapProductFromResponse(resDTO)
                    Log.d("apiResponse", productRes.toString())
                }

                override fun onFailure(call: Call<ProductResponseDTO?>, t: Throwable) {
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