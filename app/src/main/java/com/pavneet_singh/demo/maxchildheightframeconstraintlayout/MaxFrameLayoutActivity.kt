package com.pavneet_singh.demo.maxchildheightframeconstraintlayout

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.pavneet_singh.demo.maxchildheightframeconstraintlayout.fragments.BlueFragment
import com.pavneet_singh.demo.maxchildheightframeconstraintlayout.fragments.YellowFragment
import com.pavneet_singh.demo.maxchildheightframeconstraintlayout.fragments.GreenFragment

/**
 * Created by Pavneet_Singh on 2020-02-19.
 */

class MaxFrameLayoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maxframelayout)

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