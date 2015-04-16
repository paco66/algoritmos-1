object Randomize{

  def main(args: Array[String]){
    val A= Array(5,4,8,9,6,2,10)
    ran(A)
  }
  
  def ran(array: Array[Int]){
    var n= array.length
    println("Arreglo")
    imp(array)
    var aux=0
    val r = scala.util.Random
    for (i<-0 to n-1){
      var x=(r.nextInt(n-1))
      aux=array(i)
      array(i)= array(x)
      array(x)=aux
      }
   println("Reordenado")
   imp(array)
  }

  def imp(a:Array [Int]){
    for(i<-0 to a.length-1){
      println(a(i))
    } 
  }

}