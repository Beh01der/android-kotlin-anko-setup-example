package com.example.kotlin.androdikotlinexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.*

/**
 * User: Andrey Chausenko
 * Date: 9/06/2016
 * Time: 7:19 PM
 */

class MainActivityKotlin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        verticalLayout {
            padding = dip(20)
            val name = editText()

            button("Say Hello") {
                onClick { toast("G'day, ${name.text}!") }
            }
        }
    }
}
