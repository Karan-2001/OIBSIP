   package com.example.quizapp
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.quizapp.databinding.FragmentScoreBoardBinding


   class FragmentScoreBoard : Fragment() {
      private var _binding: FragmentScoreBoardBinding? = null
      private val binding get() = _binding!!
     private var scoreid:Int=0
      var question_list:ArrayList<String> = ArrayList()
       var answer_list: ArrayList<String> = ArrayList()
       var name1:String=""





      override fun onCreate(savedInstanceState: Bundle?) {
          super.onCreate(savedInstanceState)
          setHasOptionsMenu(true)
          arguments?.let{

              val args=FragmentScoreBoardArgs.fromBundle(it)
              question_list.addAll(args.questionArrayList)
              answer_list.addAll(args.answerArrayList)
              scoreid=args.score
              name1=args.nameid




          }

      }




      override fun onCreateView(
              inflater: LayoutInflater, container: ViewGroup?,
              savedInstanceState: Bundle?
      ): View? {
          _binding = FragmentScoreBoardBinding.inflate(inflater,container,false)

          val view = binding.root
          return view

      }

     override fun onViewCreated(view:View,savedInstancesState:Bundle?){

         binding.txtScore.text=scoreid.toString()
         binding.yourName.text=name1.toString()
         binding.mainmenu.setOnClickListener{
             Navigation.findNavController(it).navigate(R.id.action_fragmentScoreBoard3_to_fragmentMainScreen3)
         }
         binding.answers.setOnClickListener{
             val action=FragmentScoreBoardDirections.actionFragmentScoreBoard3ToFragmentAnswers3(questionsArray =question_list.toTypedArray(),
                                                    answersArray =answer_list.toTypedArray() )
             findNavController().navigate(action)

         }
         val share: ImageView =view.findViewById(R.id.score_share)
         share.setOnClickListener {
             val intent= Intent()
             intent.action=Intent.ACTION_SEND
             intent.putExtra(Intent.EXTRA_TEXT,"Hey my score is:${scoreid}")
             intent.type="text/plain"
             startActivity(Intent.createChooser(intent,"Share To:"))
         }


      }
      override fun onDestroyView(){
          super.onDestroyView()
          _binding = null
      }
   }





