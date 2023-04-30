package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.navigation.databinding.FragmentBBinding
import com.example.navigation.databinding.FragmentDBinding

class DFragment : Fragment() {
    lateinit var binding : FragmentDBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentDBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.ButtonBack.setOnClickListener { v->
            v.findNavController().popBackStack()
//            Navigation.findNavController(v).popBackStack()
        }

    }

}