package com.example.poon6.intent

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.home_page.*

class HomeActivity : AppCompatActivity() {

    var click = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_page)

        btn_start.setOnClickListener {
            startGame()
            click++
        }
    }

    private fun startGame() {
        if (click%9 == 1)
            image_start.setImageResource(R.drawable.timg1)
        else if (click%9 == 2)
            image_start.setImageResource(R.drawable.timg2)
        else if (click%9 == 3)
            image_start.setImageResource(R.drawable.timg3)
        else if (click%9 == 4)
            image_start.setImageResource(R.drawable.timg4)
        else if (click%9 == 5)
            image_start.setImageResource(R.drawable.timg5)
        else if (click%9 == 6)
            image_start.setImageResource(R.drawable.timg6)
        else if (click%9 == 7)
            image_start.setImageResource(R.drawable.timg7)
        else if (click%9 == 8)
            image_start.setImageResource(R.drawable.timg8)
        else
            image_start.setImageResource(R.drawable.timg9)

        click_number.setText(click.toString())

        Toast.makeText(getApplicationContext(), click.toString(),Toast.LENGTH_SHORT).show();
    }
}
