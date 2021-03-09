package com.android.fibonacci_series

import kotlinx.coroutines.*
import kotlin.math.pow

object FibonacciListCalculation {

    fun getFibonacciNumber(index: Int): String {
         /*using Binet’s Formula.
            Fn=[ϕ^n−(1/ϕ^n)]/√5 */

         var number = ""
         val phi = 1.6180339887498948
         runBlocking {
             if (index.toLong() <= Long.MAX_VALUE) {
                 number = String.format("%.0f", (phi.pow(index.toDouble()) - (1 / (-phi).pow(index.toDouble()))) / Math.sqrt(5.0))
             }
         }
         return number
     }
}
