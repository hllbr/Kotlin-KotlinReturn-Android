package com.hllbr.kotlinreturn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Return = Döndürmek -Döndüren fonksiyon işlemin sonucunda bir veri tipi döndürmesini beklediğimiz fonksiyon olarak ifade edebiliriz.
        val result = myMultiply(10,20)
        textView.text = "Result : ${result}"//Int

        val result2 = mySum(10,20)
        println(result)//Unit-bize sonuç olarak 30 değerini değil kotlin.Unit ifadesi gösterilecektir.İşte aradaki fark
    }
    fun myMultiply(x:Int,y:Int) : Int{
        //Çarpma fonksiyonum
        //parametre parantezinin dışına yazdığım Int bana bir Int ifade döndürülmesini beklediğimi ifade ediyor.
        return x * y
    }
    //burdaki değeri başka bir yere atamak isteyebilirim.
    fun mySum(a:Int,b:Int){
        println("Result : "+a+b)
        textView.text = "Result : ${a+b}"
    }
}