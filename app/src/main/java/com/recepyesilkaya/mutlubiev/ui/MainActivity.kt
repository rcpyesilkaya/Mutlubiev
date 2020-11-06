package com.recepyesilkaya.mutlubiev.ui

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomappbar.BottomAppBar
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.recepyesilkaya.mutlubiev.R

class MainActivity : AppCompatActivity() {
    @SuppressLint("RestrictedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val navController = findNavController(R.id.fragment)

        val bottomAppBar = findViewById<BottomAppBar>(R.id.bottomAppBar)
        val floatingActionButton = findViewById<FloatingActionButton>(R.id.fab)
        val llPrice = findViewById<LinearLayout>(R.id.llPrice)

        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.splashFragment -> {
                    bottomNavigationView.visibility = View.GONE
                    bottomAppBar.visibility = View.GONE
                    floatingActionButton.visibility = View.GONE
                    llPrice.visibility = View.GONE

                }
                R.id.servicesFragment -> {
                    bottomNavigationView.visibility = View.GONE
                    bottomAppBar.visibility = View.GONE
                    floatingActionButton.visibility = View.GONE

                    llPrice.visibility = View.VISIBLE


                }
                else -> {
                    bottomNavigationView.visibility = View.VISIBLE
                    bottomAppBar.visibility = View.VISIBLE
                    floatingActionButton.visibility = View.VISIBLE

                    llPrice.visibility = View.GONE
                }
            }
        }
        bottomNavigationView.background = null
        bottomNavigationView.menu.getItem(2).isEnabled = false

        bottomNavigationView.setupWithNavController(navController)
    }
}