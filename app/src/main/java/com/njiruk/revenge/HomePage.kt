package com.njiruk.revenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainer
import androidx.fragment.app.FragmentContainerView
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.njiruk.revenge.databinding.ActivityHomePageBinding

class HomePage : AppCompatActivity() {
   lateinit var binding: ActivityHomePageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        castViews()
        setupBottomNav()
    }
    fun castViews(){
        binding.fcvhome.setOnClickListener{

        }


    }
    fun setupBottomNav(){
        binding.bottomNavigation.setOnItemSelectedListener { item ->
            when(item.itemId){
                R.id.plan ->{
                    supportFragmentManager.beginTransaction().replace(R.id.fcvhome,PlanFragment()).commit()
                    true
                }
                R.id.track->{
                    supportFragmentManager.beginTransaction().replace(R.id.fcvhome,TrackFragment()).commit()
                    true
                }
                R.id.profile->{
                    supportFragmentManager.beginTransaction().replace(R.id.fcvhome,ProfileFragment()).commit()
                    true
                }
                else->false
            }
        }
    }
}