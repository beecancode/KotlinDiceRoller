package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

/**
 * This activity allows the user to roll a dice and
 * view the result on the screen
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }

    }

    /**
     * Roll the dice and update the screen with the result
     */
    private fun rollDice() {
        // Create new Dice object with 6 sides and roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val diceImage: ImageView = findViewById(R.id.imageView)


        when (diceRoll) {
            //If the user rolls a 1, then display the dice_1 image.
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            //If the user rolls a 2, then display the dice_2 image.
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            //If the user rolls a 3, then display the dice_3 image.
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            //If the user rolls a 4, then display the dice_4 image.
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            //If the user rolls a 5, then display the dice_5 image.
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            //If the user rolls a 6, then display the dice_6 image.
            6 -> diceImage.setImageResource(R.drawable.dice_6)
        }
    }
}

class Dice(val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}