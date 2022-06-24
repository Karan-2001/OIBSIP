package com.example.quizapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.quizapp.databinding.FragmentAnswersBinding


class FragmentAnswers : Fragment() {
    private var _binding: FragmentAnswersBinding? = null
    private val binding get() = _binding!!
    private lateinit var recyclerView: RecyclerView
    var questions:ArrayList<String> = ArrayList()
           var answers: ArrayList<String> = ArrayList()




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
       arguments?.let{
           val args = FragmentAnswersArgs.fromBundle(it)
           questions.addAll(args.questionsArray)
           answers.addAll(args.answersArray)


      }

    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAnswersBinding.inflate(inflater, container, false)
        val view = binding.root
        return view

    }

    override fun onViewCreated(view: View, savedInstancesState: Bundle?) {
        recyclerView = binding.recyclerView2
        recyclerView.adapter =AnswersAdapter(questions,answers)
                binding.mainmenu.setOnClickListener {
//                    Navigation.findNavController(it).navigate(R.id.action_fragmentScoreBoard3_to_fragmentMainScreen3)
                        findNavController().navigate(R.id.action_fragmentAnswers3_to_fragmentMainScreen3)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

