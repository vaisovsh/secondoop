import java.util.Scanner
fun main() {
    println(fact(9))

}
fun fact(n:Int): Long {
   return if (n<=1) 1L
    else   n + fact(n-1)
}