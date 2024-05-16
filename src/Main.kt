import kotlin.random.Random

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//1
    val random = Random
    val array: Array<Int> = Array(10) { random.nextInt(-10,10) }
    for (i in array){
        print("$i ")
    }
    println()
    println("Колличество локальных минимумов равно ${localMin(array)}")
    println()
//2
    simpleFunc(array)
    for (i in array){
        print("$i ")
    }
    println("\n")
//3
    val matrix: Array<Array<Int>> = Array(5) { Array(5) { random.nextInt(0,10) } }
    for (i in matrix.indices) {
        for (j in matrix[i].indices) {
            print("${matrix[i][j]}\t")
        }
        println()
    }
    println()
    println("Введите число")
    val element = readln().toInt()
    printLine(element, matrix)
}

fun localMin(array: Array<Int>):Int{
    var counter = 0
    for (i in array.indices){
        if(i > array.size - 3) break
        else if (array[i+1] < array[i] && array[i+1] < array[i+2])counter++
    }
    return counter
}

fun simpleFunc(array: Array<Int>):Array<Int>{
    for (i in array.indices){
        if(array[i] < 0)array[i]++
    }
    return array
}

fun printLine(num: Int, array: Array<Array<Int>>){
    for (i in array[num]){
        print("$i\t")
    }
}