package com.example.inheritance.Model

import android.util.Log

open class ShoppingItem(open var name: String, val colorId: String){


   open fun getDisplayName(): String{
        return this.name
    }
}

class GroceryItem(name: String, colorId: String, var isExpired:Boolean ): ShoppingItem(name, colorId){
    override fun getDisplayName(): String{

        return " $name is expired $isExpired"

    }


}

class ClothingItem(name: String, colorId: String, var size: Int): ShoppingItem(name, colorId){
    override fun getDisplayName():String{
        return "this $name is size $size"


    }

}

class ExcerciseItem(name:String, colorId: String, var brand: String): ShoppingItem(name, colorId){
    override fun getDisplayName():String{
        return "this $name is part of the brand $brand"

    }
}





