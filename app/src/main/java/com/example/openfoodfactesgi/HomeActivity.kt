package com.example.openfoodfactesgi

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.openfoodfactesgi.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_home_activity_home)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.


        //    FragmentManager manager = getSupportFragmentManager();
        //    manager.beginTransaction().replace(R.id.your_fragment_layout_name, new Fragment1()).commit();

        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.activity_scan_barcode_fragment, R.id.navigation_success_list
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }
}