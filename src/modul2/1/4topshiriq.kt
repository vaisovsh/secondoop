package modul2.`1`

import kotlin.math.max

class price{
    var nomi="hljl"
    var dukonnomi="jhvnd"
    var narx1=6768
    var narx2=1564
    var narx3=1515
    var narx4=1565
    fun qimmat(){
        println(max(max(narx1, narx2), max(narx3, narx4)))
    }
}
fun main() {

 val dukon=price()
    dukon.qimmat()
    dukon.dukonnomi="nokia"
    dukon.nomi="noveyx100"
}