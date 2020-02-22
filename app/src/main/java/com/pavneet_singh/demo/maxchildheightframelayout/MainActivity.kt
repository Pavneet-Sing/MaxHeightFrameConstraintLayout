package com.pavneet_singh.demo.maxchildheightframelayout

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.pavneet_singh.temp.BlueFragment
import com.example.pavneet_singh.temp.YellowFragment
import com.pavneet_singh.demo.maxchildheightframelayout.fragments.GreenFragment

/**
 * Created by Pavneet_Singh on 2020-02-19.
 */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // onClick handlers
        findViewById<Button>(R.id.btn_show_blue).setOnClickListener {
            insertBlueFragment()
        }

        findViewById<Button>(R.id.btn_show_yellow).setOnClickListener {
            insertYellowFragment()
        }

        findViewById<Button>(R.id.btn_show_green).setOnClickListener {
            insertGreenFragment()
        }

        // by default show the blue fragment
        insertBlueFragment()
    }


    private fun insertGreenFragment() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, GreenFragment())
        transaction.commit()
    }


    private fun insertYellowFragment() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, YellowFragment())
        transaction.commit()
    }


    private fun insertBlueFragment() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, BlueFragment())
        transaction.commit()
    }
}