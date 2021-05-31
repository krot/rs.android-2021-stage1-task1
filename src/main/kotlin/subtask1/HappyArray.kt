package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {

        var result: List<Int> = sadArray.asList()

        var index: Int = 1

        while (index < result.size - 1) {
            if (result.size <= 2) {
                break
            }

            if (index < 1) {
                index = 1
            }

            if (result[index] > (result[index - 1] + result[index + 1])) {
                var mutable = result.toMutableList()
                mutable.removeAt(index)
                result = mutable as List<Int>
                index--
            } else {
                index++
            }
        }

        return result.toIntArray()
    }
}
