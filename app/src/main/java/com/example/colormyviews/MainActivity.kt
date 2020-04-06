package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListners()
    }

    private fun setListners() {
        val clickables: List<View> = listOf(box_one_text,box_two_text,box_three_text,box_four_text,box_five_text, constraint_layout,red_btn,yellow_btn,green_btn)
        for (item in clickables)
        {
            item.setOnClickListener(View.OnClickListener {
                markColor(it)
            })
        }
    }

    private fun markColor(view: View?) {

        when(view?.id)
        {
            //using color class
            R.id.box_one_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.BLUE)

            // using Android color resources

            R.id.box_three_text -> view.setBackgroundResource(android.R.color.darker_gray)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_purple)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_orange_light)

            //using Custom color resources

            R.id.red_btn -> box_three_text.setBackgroundResource(R.color.my_red)
            R.id.yellow_btn -> box_four_text.setBackgroundResource(R.color.my_yellow)
            R.id.green_btn -> box_five_text.setBackgroundResource(R.color.my_green)

            else -> view?.setBackgroundColor(Color.CYAN)


        }

    }
}
