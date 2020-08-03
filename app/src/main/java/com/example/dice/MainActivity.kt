package com.example.dice

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

/***
 * Activity to roll the dice and update the screen with result
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Reference to the button
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {

            // Reference to image
            val image: ImageView = findViewById(R.id.imageView)
            image.setImageResource(resourceId(roll()))

            // Toast confirming the dice rolled
            val toast = Toast.makeText(this," Dice Rolled! ", Toast.LENGTH_SHORT)
            toast.show()

        }
    }

    /**
     * Functions to roll the dice and update the image
     */
    private fun roll(): Int = (1..6).random()

    private fun resourceId (ID: Int) = when(ID) {
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
    }
}