package com.example.quizapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.quizapp.databinding.FragmentMainScreenBinding


class FragmentMainScreen : Fragment() {

    private var _binding : FragmentMainScreenBinding? =null
    private val binding get()=_binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding= FragmentMainScreenBinding.inflate(inflater,container,false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnPlay.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_fragmentMainScreen3_to_fragmentUsername)

        }

    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}