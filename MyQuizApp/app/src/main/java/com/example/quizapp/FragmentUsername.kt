package com.example.quizapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.quizapp.databinding.FragmentUsernameBinding

class FragmentUsername : Fragment() {
    private var _binding : FragmentUsernameBinding? =null
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
        _binding= FragmentUsernameBinding.inflate(inflater,container,false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        binding.buttonStart.setOnClickListener{

            val action=FragmentUsernameDirections.actionFragmentUsernameToFragmentQuiz3(name=binding.userName.text.toString())
            Navigation.findNavController(it).navigate(action)

        }

    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

