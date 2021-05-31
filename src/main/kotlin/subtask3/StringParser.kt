package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {

        var result: MutableList<String> = mutableListOf()

        var openBracketList: List<Char> = listOf('<','[','(')
        var closeBracketList: List<Char> = listOf('>',']',')')

        var count = 0
        var length = inputString.length

        for (i in 0 until length) {
            if (inputString[i] in openBracketList) {
                var openChar = inputString[i]
                var closeChar = closeBracketList[openBracketList.indexOf(openChar)]
                var kk = -1;
                for (k in i + 1 until length) {
                    if ((inputString[k] == closeChar) && (count == 0)) {
                        kk = k;
                        break;
                    }
                    if (inputString[k] == openChar) count++
                    if (inputString[k] == closeChar) count--

                }
                result.add( inputString.substring(i + 1, kk));

            }
        }

        return result.toTypedArray()

    }
}
