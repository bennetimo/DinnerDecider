package io.coderunner.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Burger King", "Pizza", "McDonalds", "Wagamumma", "Fish & Chips", "Burrito", "Gousto")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnDecide.setOnClickListener {
            val index = (0..foodList.size-1).random()
            txtSelectedFood.text = foodList[index]
        }

        btnAddFood.setOnClickListener {
            foodList.add(txtAddFood.text.toString())
            txtAddFood.text.clear()
        }

    }
}
