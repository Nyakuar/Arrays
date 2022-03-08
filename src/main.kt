fun main(){
    namesOfboys(arrayOf("Chuol", "Jonny", "willam", "Rambo"))
    cities(arrayOf("harara", "numbai", "dodoma", "jackarta"))
    sum(arrayOf(32, 4, 213, 78, 43, 3, 73, 3, 73, 11, 158, 62,))
    girls(arrayOf("marth", "julet", "nakuar", "Lura"))
}


fun namesOfboys(name: Array<String>){
    println(name.contentToString())

}



fun cities(name: Array<String>){
    name.forEach { names ->
        println(names.capitalize())

    }


}


fun sum(number: Array<Int>){
    var answer= number [2] + number[5]
    println(answer)
    var sell= number.indexOf(158)
    println(sell)
    var sum= number.sortedArray()
    println(sum.contentToString())
}


fun girls(names: Array<String>): Array< String>{
    var names= names
    println(names.contentToString())
    return names
}






