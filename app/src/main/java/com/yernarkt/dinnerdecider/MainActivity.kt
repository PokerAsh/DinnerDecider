package com.yernarkt.dinnerdecider

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    private val foodList = arrayListOf("Бешпармак", "KFC", "Burger King", "Pizza", "Sushi")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAddFood.setOnClickListener {
            val newFood = tvAddFood.text.toString()
            if(newFood != "") {
                foodList.add(newFood)
                tvAddFood.text.clear()
            }
        }

        btnDecide.setOnClickListener {
            val random = Random()
            val randomFoodIndex = random.nextInt(foodList.count())
            tvDinnerDeciderTitle.text = foodList[randomFoodIndex]
        }
    }
}