package com.example.tasklaunchpad
import android.Manifest
import android.app.Activity
import android.content.pm.PackageManager
import android.os.Bundle
import android.widget.Button
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class FifthActivity : AppCompatActivity() {
    private lateinit var permissionLauncher:ActivityResultLauncher<Array<String>>
//    private var isStoragePermissionGranted = false
    private var isLocationPermissionGranted = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fifth_activity)
        permissionLauncher = registerForActivityResult(ActivityResultContracts.RequestMultiplePermissions()){
            permissions ->
//isStoragePermissionGranted = permissions[Manifest.permission.WRITE_EXTERNAL_STORAGE]?:isStoragePermissionGranted
            isLocationPermissionGranted = permissions[Manifest.permission.ACCESS_COARSE_LOCATION]?:isLocationPermissionGranted
        }
        val btnRequestPermission = findViewById<Button>(R.id.btn6)
        btnRequestPermission.setOnClickListener {
            requestPermission()
        }
    }


    private fun hasWriteExternalStoragePermission() =
        ContextCompat.checkSelfPermission(this,Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED

    private fun hasLocationForeGroundPermission() =
        ContextCompat.checkSelfPermission(this,Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED

    private fun hasLocationBackgroundPermission() =
        ContextCompat.checkSelfPermission(this,Manifest.permission.ACCESS_BACKGROUND_LOCATION) == PackageManager.PERMISSION_GRANTED

    private fun requestPermission(){
        val permissionTorequest = mutableListOf<String>()
//        if (!hasLocationBackgroundPermission()){
//            permissionTorequest.add(Manifest.permission.ACCESS_BACKGROUND_LOCATION)
//        }
        if (!isLocationPermissionGranted){
            permissionTorequest.add(Manifest.permission.ACCESS_COARSE_LOCATION)
        }
//        if (!isStoragePermissionGranted){
//            permissionTorequest.add(Manifest.permission.WRITE_EXTERNAL_STORAGE)
//        }
        if (permissionTorequest.isNotEmpty()){
            permissionLauncher.launch(permissionTorequest.toTypedArray())
//            ActivityCompat.requestPermissions(this,permissionTorequest.toTypedArray(),0)
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == 0 && grantResults.isNotEmpty()){
            for (i in grantResults.indices){
                if (grantResults[i] == PackageManager.PERMISSION_GRANTED){
                    println("PermissionRequest: ${permissions[i]} granted")
                }
            }
        }
    }


}
