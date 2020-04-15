package com.pavneet_singh.demo.maxchildheightframeconstraintlayout

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.pavneet_singh.demo.maxchildheightframeconstraintlayout.fragments.BlueFragment
import com.pavneet_singh.demo.maxchildheightframeconstraintlayout.fragments.GreenFragment
import com.pavneet_singh.demo.maxchildheightframeconstraintlayout.fragments.YellowFragment

/**
 * Created by Pavneet_Singh on 2020-02-19.
 */

class MaxConstraintLayoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maxconstraintlayout)

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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menu?.add(0, 0, 0, "Show FrameActivity")
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        startActivity(Intent(this, MaxFrameLayoutActivity::class.java))
        return super.onOptionsItemSelected(item)
    }
}