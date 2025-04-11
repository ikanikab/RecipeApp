package com.example.recipeapp
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName= "recipe")
class recipe (var img:String,  var title:String, var des:String, var ing:String, var category:String){
    @JvmField
    @PrimaryKey(autoGenerate = true)
    var Vid=0

}