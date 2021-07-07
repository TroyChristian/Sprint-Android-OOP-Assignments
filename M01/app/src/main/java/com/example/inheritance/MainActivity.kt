package com.example.inheritance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.inheritance.Model.ClothingItem
import com.example.inheritance.Model.ExcerciseItem
import com.example.inheritance.Model.GroceryItem
import com.example.inheritance.Model.ShoppingItem
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import java.util.Collections.list

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recycler_view.apply{
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = ShoppingItemAdapter(shoppingList())
        }





        }

    }


fun shoppingList() : List<ShoppingItem>{

    var tShirt = ClothingItem("T-Shirt", 6)
    var socks = ClothingItem("socks",9)
    var shorts = ClothingItem("shorts", 3)

    var taco = GroceryItem("taco", false)

    var gum = GroceryItem("gum", true)
    var iceCream = GroceryItem("icecream", false)

    var yogaMat = ExcerciseItem("Yoga Mat", "konami")
    var bar = ExcerciseItem("barBell",  "Arnold Iron")
    var treadmill = ExcerciseItem("TreadMill","RunForest INC")

    return listOf(tShirt,socks, shorts, taco, gum, iceCream, yogaMat, bar, treadmill)}






