
class geo{
    var lat=-32.987
    var ing=832.1541
    class company{
        var name="cajcbhacea"
        var catchphrasa="wiuhodqdq"
        var bs="uhiujk;osd"
    }
}
class adress{
    var street:String?=null
    var suite:String?=null
    var city:String?=null
    var zipcode:String?=null
    fun printadress(){
        println("$street " +
                "$suite" +
                "$city " +
                "$zipcode")
    }
}
fun main() {
    var phone="45-65-45461 x1684965"
    var website="birnarsala.org"
    val address=adress()
    val kompany=geo.company()
    println("${kompany.catchphrasa} " +
            "${kompany.bs} " +
            "${kompany.name}")//shordaki {}qvs niwatadi bolmasaham ishlidiqu babi+
    address.street="Kulas Lihght"
    address.suite="Apt.556"
    address.city="Gwenborough"
    address.zipcode="16546-45112"
    address.printadress()

}