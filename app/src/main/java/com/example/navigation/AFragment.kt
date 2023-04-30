package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigation.databinding.FragmentABinding

class AFragment : Fragment() {
    lateinit var binding : FragmentABinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentABinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonGoB.setOnClickListener {v->
            Navigation.findNavController(v).navigate(R.id.action_AFragment_to_BFragment)
        }
        binding.buttonGoC.setOnClickListener {v->
            Navigation.findNavController(v).navigate(R.id.action_AFragment_to_CFragment)
        }
    }

}