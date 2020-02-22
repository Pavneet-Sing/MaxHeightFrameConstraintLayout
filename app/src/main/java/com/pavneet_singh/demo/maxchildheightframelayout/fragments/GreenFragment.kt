package com.pavneet_singh.demo.maxchildheightframelayout.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.pavneet_singh.demo.maxchildheightframelayout.R

/**
 * Created by Pavneet_Singh on 2020-02-17.
 */

class GreenFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.green, container, false)
    }
}