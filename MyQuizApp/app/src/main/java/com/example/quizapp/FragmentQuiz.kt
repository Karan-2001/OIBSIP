package com.example.quizapp

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast.LENGTH_SHORT
import android.widget.Toast.makeText
import androidx.annotation.RequiresApi
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.quizapp.databinding.FragmentQuizBinding


class FragmentQuiz : Fragment(),QuizAdapter.Click {

    private var _binding: FragmentQuizBinding? = null
    private val binding get() = _binding!!
    private lateinit var recyclerView: RecyclerView
    lateinit var states:ArrayList<Int>
    lateinit var data:List<data_class>
    private var nameentered:String=""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
        arguments?.let{
            val args=FragmentQuizArgs.fromBundle(it)
            nameentered=args.name
        }

        }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentQuizBinding.inflate(inflater, container, false)
        val view = binding.root
        return view


    }

   @RequiresApi(Build.VERSION_CODES.N)
   override fun onViewCreated(view: View, savedInstancesState: Bundle?) {
       recyclerView = binding.recyclerView
       recyclerView.adapter = QuizAdapter(this)
       val timer = object : CountDownTimer(60000, 1000) {
           override fun onTick(millisUntilFinished: Long) {
               if (millisUntilFinished > 10000) {
                   binding.viewTimer.text = "0:" + millisUntilFinished / 1000
               } else {
                   if (millisUntilFinished <= 1000) {
                       makeText(context, "AUTO-SUBMITTING", LENGTH_SHORT).show()
                   }
                   binding.viewTimer.setTextColor(Color.RED)
                   binding.clock.setColorFilter(Color.RED)
                   binding.viewTimer.text = "00:0" + millisUntilFinished / 1000
               }
               binding.viewTimer.setBackgroundColor(Color.WHITE)
           }
           override fun onFinish() {
               submit()
           }
       }.start()
       binding.btnSubmit.setOnClickListener {
           timer.cancel()
           submit()
       }
   }
       private fun submit(){
           var score:Int =0;
           var j=0
           for(i in states)
           {
               if(i==data[j].opt)
                   score+=10
               j+=1
           }
            makeText(context, "${score}", LENGTH_SHORT).show()
           val question_list:ArrayList<String> = arrayListOf(data[0].question, data[1].question, data[2].question, data[3].question, data[4].question)
           val answer_list:ArrayList<String> = arrayListOf(data[0].answerkey, data[1].answerkey, data[2].answerkey, data[3].answerkey, data[4].answerkey)
//           val action=FragmentQuizDirections.actionFragmentQuizToFragmentScoreBoard(score=score,questionArrayList=question_list,answerArraylist=answer_list)
//           Navigation.findNavController(it).navigate(action)
         val action= FragmentQuizDirections.actionFragmentQuiz3ToFragmentScoreBoard3(score = score,
                 questionArrayList = question_list.toTypedArray(), answerArrayList = answer_list.toTypedArray(),nameid=nameentered)
          findNavController().navigate(action)
       
       }

    override fun onDestroyView(){
        super.onDestroyView()
        _binding = null
    }

    override fun go_to_main(R_id: ArrayList<Int>, filter_data: List<data_class>) {
        data=filter_data
        states=R_id
        Log.e("AA", "array${R_id}")

    }


}







