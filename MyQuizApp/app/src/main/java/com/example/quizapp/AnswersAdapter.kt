package com.example.quizapp

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AnswersAdapter(
       private val question_list:ArrayList<String>,
      private  val answer_list:ArrayList<String>
):RecyclerView.Adapter<AnswersAdapter.AnswersViewHolder>() {
//    var data = Obj_list().send_obj().toList()
//    var filter_data = data.shuffled().take(5)

    class AnswersViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val question: TextView = view.findViewById(R.id.textView5)
        val answer: Button = view.findViewById(R.id.answer)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnswersViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.answers_display, parent, false)
        return AnswersViewHolder(layout)

    }

    override fun onBindViewHolder(holder: AnswersViewHolder, position: Int) {
        val ques = question_list[position]
        val ans = answer_list[position]
        holder.question.text = "${position + 1}" + "${ques}"
        Log.e("Position","pos=${position}")
        Log.e("question","q=${question_list}")
        Log.e("answer","a=${answer_list}")
        holder.answer.text = ans
    }

    override fun getItemCount(): Int {
        return question_list.size
    }
}


