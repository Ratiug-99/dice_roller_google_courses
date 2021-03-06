package com.example.ratiug.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private val TAG : String = "DBG | Main Activity"
    lateinit var diceImageView: ImageView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton:Button = findViewById(R.id.butRoll)
        rollButton.setOnClickListener {
            Log.d(TAG, "Button pressed")
            rollDice()
        }
    }

    private fun rollDice() {
        val randomInt : Int = Random.nextInt(6) + 1
        diceImageView = findViewById(R.id.ivDice)
        val drawableResource = when (randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
                        }
        diceImageView.setImageResource(drawableResource)
    }
}