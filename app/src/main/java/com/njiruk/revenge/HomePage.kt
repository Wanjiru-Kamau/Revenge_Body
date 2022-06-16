package com.njiruk.revenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainer
import androidx.fragment.app.FragmentContainerView
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomePage : AppCompatActivity() {
    lateinit var btvHome: BottomNavigationView
    lateinit var fcvHome: FragmentContainerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
        castViews()
        setupBottomNav()
    }
    fun castViews(){
        btvHome = findViewById(R.id.bottom_navigation)
        fcvHome = findViewById(R.id.fcvhome)

    }
    fun setupBottomNav(){
        btvHome.setOnItemSelectedListener { item ->
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