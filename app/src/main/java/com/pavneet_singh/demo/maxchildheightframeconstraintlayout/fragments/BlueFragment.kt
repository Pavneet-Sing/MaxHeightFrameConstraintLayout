package com.example.pavneet_singh.temp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.pavneet_singh.demo.maxchildheightframeconstraintlayout.R

/**
 * Created by Pavneet_Singh on 2020-02-17.
 */

class BlueFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.blue, container, false)
    }
}