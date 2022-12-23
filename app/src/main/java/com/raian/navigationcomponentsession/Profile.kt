package com.raian.navigationcomponentsession

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_profile.*


class Profile : Fragment() {

    val args: ProfileArgs by navArgs()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val number_text = args.number
        textView.text = number_text.toString()

        button_home_profile.setOnClickListener {
            val action = ProfileDirections.actionProfileToHome2()
            findNavController().navigate(action)
        }
        displayButton.setOnClickListener {
            val action =ProfileDirections.actionProfileToAbout(name = inputName.text.toString())
            findNavController().navigate(action)
        }
    }

}