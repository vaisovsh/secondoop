package modul2.`1`

import java.util.Scanner

class worker{
    val sc=Scanner(System.`in`)
    var ismi="toshmat"
    var familiya="do'schanov"
    var yoshi = sc.nextInt()
    var ishgakirganvaxti=2017
    fun printme(){
    if (yoshi>=18)
        println("ishlasa boladi")
        else{
            println("yoshsan hali ")
    }
    }
}
fun main() {
    val ishlivarsinmi=worker()
    ishlivarsinmi.printme()

}