package com.example.openfoodfactesgi

import android.Manifest
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.SparseArray
import android.view.SurfaceHolder
import android.widget.Toast

import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.util.isEmpty
import com.google.android.gms.vision.CameraSource
import com.google.android.gms.vision.Detector
import com.google.android.gms.vision.barcode.BarcodeDetector

import com.google.mlkit.vision.barcode.Barcode
import com.google.mlkit.vision.barcode.BarcodeScannerOptions
import com.google.mlkit.vision.common.InputImage
import kotlinx.android.synthetic.main.activity_code_bar_scanning.*

class CodeBarScanningActivity : AppCompatActivity() {

    private val requestCodeCameraPermission = 1001
    private lateinit var cameraSource: CameraSource
    private lateinit var detector: BarcodeDetector
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_code_bar_scanning)
        if(ContextCompat.checkSelfPermission(this@CodeBarScanningActivity, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED){
            askFotCameraPermission()
        } else {
            setupControls()
        }
    }

    private fun setupControls(){
        detector = BarcodeDetector.Builder(this@CodeBarScanningActivity).build()
        cameraSource = CameraSource.Builder(this@CodeBarScanningActivity, detector).setAutoFocusEnabled(true).build()
        cameraSurfaceView.holder.addCallback(surfaceCallBack)
        detector.setProcessor(processor)
    }
    private fun askFotCameraPermission() {
        ActivityCompat.requestPermissions(this@CodeBarScanningActivity, arrayOf(Manifest.permission.CAMERA), requestCodeCameraPermission)
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if(requestCode == requestCodeCameraPermission && grantResults.isNotEmpty()){
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                setupControls()
            } else {
                Toast.makeText(applicationContext, "Permission Denied", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private val surfaceCallBack = object : SurfaceHolder.Callback {

        override fun surfaceCreated(p0: SurfaceHolder) {
            try {
                if (ActivityCompat.checkSelfPermission(
                        this@CodeBarScanningActivity,
                        Manifest.permission.CAMERA
                    ) != PackageManager.PERMISSION_GRANTED
                ) {
                    return
                }
                cameraSource.start(p0)
            } catch (exception: Exception){
                Toast.makeText(applicationContext, "Something went wrong", Toast.LENGTH_SHORT)
                    .show()
            }
        }

        override fun surfaceChanged(p0: SurfaceHolder?, p1: Int, p2: Int, p3: Int) {

        }

        override fun surfaceDestroyed(p0: SurfaceHolder?) {
            cameraSource.stop()
        }
    }

    private val processor = object : Detector.Processor<Barcode> {
        override fun release() {

        }

        override fun receiveDetections(detections: Detector.Detections<Barcode>?) {
            if(detections != null && detections.detectedItems.isEmpty()){
                val qrCodes: SparseArray<Barcode> = detections.detectedItems
                val code = qrCodes.valueAt(0)
                TextScanResult.text = code.displayValue
            } else {
                TextScanResult.text = ""
            }
        }
    }
}

private fun <T> Detector<T>.setProcessor(processor: Detector.Processor<Barcode>) {

}
