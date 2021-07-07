package com.example.openfoodfactesgi

import android.R.attr
import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.dynamiclinks.FirebaseDynamicLinks
import com.google.mlkit.vision.barcode.BarcodeScannerOptions
import com.google.mlkit.vision.common.InputImage


//import com.google.zxing.integration.android.IntentIntegrator



class MainActivity : AppCompatActivity() {
    lateinit var scanButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*scanButton = findViewById(R.id.btn_scan)
        scanButton.setOnClickListener{
            val scanner = IntentIntegrator(this)
            scanner.setDesiredBarcodeFormats(IntentIntegrator.CODE_128)
            scanner.setBeepEnabled(false)
            scanner.initiateScan()
        }*/
        handleIntent()
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        setIntent(intent)
        handleIntent();
    }

    private fun handleIntent() {
        FirebaseDynamicLinks.getInstance()
            .getDynamicLink(intent)
            .addOnSuccessListener(this) { pendingDynamicLinkData ->
                // Get deep link from result (may be null if no link is found)
                var deepLink: Uri? = null
                if (pendingDynamicLinkData != null) {
                    deepLink = pendingDynamicLinkData.link
                }
                if (deepLink != null) {
                    Log.w("MainActivity", "Here's the deep link URL: \n" + deepLink.toString())
                    val currentPage: String? = deepLink.getQueryParameter("curPage")

                }
            }
            .addOnFailureListener(this) { e -> Log.w("MainActivity", "getDynamicLink:onFailure", e) }
    }

    /*override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (resultCode == Activity.RESULT_OK) {
            val result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data)
            if (result != null) {
                if (result.contents == null) {
                    Toast.makeText(this, "Cancelled", Toast.LENGTH_LONG).show()
                } else {
                    Toast.makeText(this, "Scanned: " + result.originalIntent, Toast.LENGTH_LONG)
                        .show()
                }
            } else {
                    super.onActivityResult(requestCode, resultCode, data)
                }
            }
    }*/
}