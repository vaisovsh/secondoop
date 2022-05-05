package translatormaps

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val impliment = Impliment()
//    impliment.creatWord()
////    impliment.readWord()
////    impliment.updateWord()
//    impliment.deleteWord()
//    impliment.readWord()
    while (true) {
        println("1)create 2)read 3)update 4)delete 5)search")
        var number = sc.nextInt()
        when (number) {
            1 -> {
                impliment.creatWord()
            }
            2 -> {
                impliment.readWord()
            }
            3 -> {
                impliment.updateWord()
            }
            4 -> {
                impliment.deleteWord()
            }
            5 -> {
                impliment.searchWord()
            }
        }
    }
}