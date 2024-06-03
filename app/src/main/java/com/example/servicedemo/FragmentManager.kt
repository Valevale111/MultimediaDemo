package com.example.servicedemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FragmentManager : Fragment(){
    private var fragNum = MainActivity.fragNum
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return when(fragNum){
            0 -> inflater.inflate(R.layout.default_layout,container,false)

            else -> {}
        }
    }
}