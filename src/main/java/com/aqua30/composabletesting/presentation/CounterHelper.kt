package com.aqua30.composabletesting.presentation

import java.lang.NumberFormatException

/**
 * Created by Saurabh
 */
object CounterHelper {

    fun processInput(editedText: String): String {
        return try {
            val counterValue = editedText.toInt()
            "Counter = $counterValue"
        } catch (e: NumberFormatException) {
            "Invalid entry"
        }
    }
}