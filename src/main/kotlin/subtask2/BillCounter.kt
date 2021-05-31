package subtask2

import kotlin.math.abs

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {

        var sum: Int = 0

        var skip: Int = bill[k]

        for (i in 0 until bill.size) {
            if (i != k) {
                sum += bill[i]
            }
        }

        var annas = sum / 2

        if (b == annas) {
            return "Bon Appetit"
        }
        else {
            var res =  abs(b-annas)
            return res.toString()
        }

    }
}
