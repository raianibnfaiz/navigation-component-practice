package com.raian.navigationcomponentsession

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_home.*


class Home : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button_profile_home.setOnClickListener {
            val action = HomeDirections.actionHome2ToProfile(8793)
            findNavController().navigate(action)
        }
        button_about_home.setOnClickListener {
            val action = HomeDirections.actionHome2ToAbout("")
            findNavController().navigate(action)
        }

//        button_about_home.setOnClickListener {
//
//            findNavController().navigate(R.id.action_homeFragment_to_aboutFragment)
//        }
    }




}