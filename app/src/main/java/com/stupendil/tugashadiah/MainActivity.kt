package com.stupendil.tugashadiah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.stupendil.tugashadiah.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private val onNavigationItemSelectedListener =
        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
                    replaceFragment(HomeFragment())
                    return@OnNavigationItemSelectedListener true
                }
                R.id.navigation_history -> {
                    replaceFragment(HistoryFragment())
                    return@OnNavigationItemSelectedListener true
                }
                R.id.navigation_profile -> {
                    replaceFragment(ProfileFragment())
                    return@OnNavigationItemSelectedListener true
                }
            }
            false
        }

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = findViewById(R.id.nav_view)
        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)

        replaceFragment(HomeFragment())


        val objectItemList = listOf<ObjectItem>(
            ObjectItem(
                R.drawable.poster1,
                nameObject = "Sri Asih",
                desctItem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus mollis odio ut nisi auctor, eget hendrerit velit ornare. Vestibulum eu dui ac sem fringilla porta. Nullam dictum, elit vitae volutpat pretium, ex turpis maximus lorem, in ultrices dolor metus non dolor."
            ),
            ObjectItem(
                R.drawable.poster2,
                nameObject = "Iron Man 2",
                desctItem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus mollis odio ut nisi auctor"
            ),
            ObjectItem(
                R.drawable.poster3,
                nameObject = "Shang-Chi",
                desctItem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus mollis odio ut nisi auctor, eget hendrerit velit ornare. Vestibulum eu dui ac sem fringilla porta. Nullam dictum, elit vitae volutpat pretium, ex turpis maximus lorem, in ultrices dolor metus non dolor."
            ),
            ObjectItem(
                R.drawable.poster4,
                nameObject = "Warkop DKI Reborn",
                desctItem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus mollis odio ut nisi auctor"
            ),
            ObjectItem(
                R.drawable.poster5,
                nameObject = "Warcraft",
                desctItem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus mollis odio ut nisi auctor, eget hendrerit velit ornare. Vestibulum eu dui ac sem fringilla porta. Nullam dictum, elit vitae volutpat pretium, ex turpis maximus lorem, in ultrices dolor metus non dolor."
            ),
            ObjectItem(
                R.drawable.poster6,
                nameObject = "Jendela Seribu Sungai",
                desctItem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus mollis odio ut nisi auctor"
            ),
            ObjectItem(
                R.drawable.poster7,
                nameObject = "Gatotkaca",
                desctItem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus mollis odio ut nisi auctor, eget hendrerit velit ornare. Vestibulum eu dui ac sem fringilla porta. Nullam dictum, elit vitae volutpat pretium, ex turpis maximus lorem, in ultrices dolor metus non dolor."
            ),
            ObjectItem(
                R.drawable.poster8,
                nameObject = "Bulan Terbelah di Langit Amerika",
                desctItem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus mollis odio ut nisi auctor"
            ),
            ObjectItem(
                R.drawable.poster9,
                nameObject = "Ant-man & The Wasp",
                desctItem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus mollis odio ut nisi auctor"
            ),
            ObjectItem(
                R.drawable.poster10,
                nameObject = "Mencuri Raden Saleh",
                desctItem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus mollis odio ut nisi auctor, eget hendrerit velit ornare. Vestibulum eu dui ac sem fringilla porta. Nullam dictum, elit vitae volutpat pretium, ex turpis maximus lorem, in ultrices dolor metus non dolor."
            ),
            ObjectItem(
                R.drawable.poster11,
                nameObject = "Harry Potter and The Order of The Phoenix",
                desctItem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus mollis odio ut nisi auctor"
            ),
            ObjectItem(
                R.drawable.poster12,
                nameObject = "Openheimer",
                desctItem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus mollis odio ut nisi auctor, eget hendrerit velit ornare. Vestibulum eu dui ac sem fringilla porta. Nullam dictum, elit vitae volutpat pretium, ex turpis maximus lorem, in ultrices dolor metus non dolor."
            ),
            ObjectItem(
                R.drawable.poster13,
                nameObject = "Keluarga Cemara",
                desctItem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus mollis odio ut nisi auctor"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_object)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ObjectAdapter(this, objectItemList){

        }

    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()

    }

}