 open class vehicle{
var speed:Int=123
   fun printspeed(){
       println("tezligi:$speed")
   }
}
 class wheeledvehicle: vehicle(),vehicleHandlers {
    var wheeledcount:Int=4
     fun printMe(){
         println("gildirak soni:$wheeledcount")
         printspeed()
     }

     override fun start() {
         
         TODO("Not yet implemented")
     }

     override fun drive() {
         TODO("Not yet implemented")
     }

     override fun park() {
         TODO("Not yet implemented")
     }
 }
 interface vehicleHandlers{
     fun start()
     fun drive()
     fun park()
 }
fun main() {
    var obj=wheeledvehicle()
    obj.printMe()
}