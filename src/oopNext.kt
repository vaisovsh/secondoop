class Car(p1:String,p2:String,p3:Int){
    var model:String?=null
    var color:String?=null
    var year :Int?=null
    init {
        model=p1
        color=p2
        year=p3
        println("$model $color $year")
    }
    fun start(){
        println("moshina yoqildi")
    }
    fun drive(){
        println("moshina haydaldi")
    }
    fun park(){
        println("moshina to'xtadi")
    }
}
fun main() {
    var merc = Car("E220","white",1960)
   /* merc.color="yellow"
    merc.year=1990
    merc.model="E690"*/



}