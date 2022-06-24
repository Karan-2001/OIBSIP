package com.example.quizapp

import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class QuizAdapter(private val int:Click):RecyclerView.Adapter<QuizAdapter.QuizViewHolder>() {
    var data = Obj_list().send_obj().toList()
    var filter_data = data.shuffled().take(5)
    var state :ArrayList<Int> = arrayListOf(-1,-1,-1,-1,-1)


    class QuizViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

        val question: TextView = view.findViewById(R.id.textView)
        val option1: Button = view.findViewById(R.id.button1)
        val option2: Button = view.findViewById(R.id.button2)
        val option3: Button = view.findViewById(R.id.button3)
        val option4: Button = view.findViewById(R.id.button4)

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuizAdapter.QuizViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.quiz_display, parent, false)
        return QuizViewHolder(layout)
    }

    override fun onBindViewHolder(holder: QuizAdapter.QuizViewHolder, position: Int) {
        val item = filter_data[position]
       holder.question.text = "${position + 1}" + "${item.question}"
        holder.option1.text = "A)"+"${item.options_list[0]}"
        holder.option2.text = "B)"+"${item.options_list[1]}"
      holder.option3.text = "C)"+"${item.options_list[2]}"
       holder.option4.text = "D)"+"${item.options_list[3]}"
    //    val ch: Int = item.opt
    //    val ansId = when (ch) {
     //       1-> R.id.button1
       //     2 -> R.id.button2
        //    3 -> R.id.button3
        //    else -> R.id.button4
    //   }
        holder.option1.setOnClickListener{
          holder.option1.setBackgroundColor(Color.parseColor("#FFC107"))
            holder.option3.setBackgroundColor(Color.parseColor("#00BCD4"))
            holder.option4.setBackgroundColor(Color.parseColor("#00BCD4"))
            holder.option2.setBackgroundColor(Color.parseColor("#00BCD4"))

            state[position]=0

             Log.e("onnclick","option1")
         }
        holder.option2.setOnClickListener{
            holder.option2.setBackgroundColor(Color.parseColor("#FFC107"))
            holder.option1.setBackgroundColor(Color.parseColor("#00BCD4"))
            holder.option3.setBackgroundColor(Color.parseColor("#00BCD4"))
            holder.option4.setBackgroundColor(Color.parseColor("#00BCD4"))
               state[position]=1

            Log.e("onnclick","option2")
        }
        holder.option3.setOnClickListener{
            holder.option3.setBackgroundColor(Color.parseColor("#FFC107"))
            holder.option4.setBackgroundColor(Color.parseColor("#00BCD4"))
            holder.option2.setBackgroundColor(Color.parseColor("#00BCD4"))
            holder.option1.setBackgroundColor(Color.parseColor("#00BCD4"))

                state[position]=2

            Log.e("onnclick","option3")
        }
        holder.option4.setOnClickListener{
            holder.option4.setBackgroundColor(Color.parseColor("#FFC107"))
            holder.option3.setBackgroundColor(Color.parseColor("#00BCD4"))
            holder.option2.setBackgroundColor(Color.parseColor("#00BCD4"))
            holder.option1.setBackgroundColor(Color.parseColor("#00BCD4"))

                state[position]=3


        }
      Log.e("on","array:${state}")
        int.go_to_main(state,filter_data)
    }
    override fun getItemCount(): Int {
        return filter_data.size
    }
    interface Click{
        fun go_to_main(R_id:ArrayList<Int>,filter_data:List<data_class>)

    }

}