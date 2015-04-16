object HireRandomize{

  def main(args: Array[String]){
    val A= Array(1,2,3,4,5,6,7,8,9,10)
    ran(A)
    hire(A)
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
      print(a(i)+" ")
    } 
   println("")
  }

  def hire(A:Array[Int]){
    var best =0
    println("Contratado")
    for (i<-0 to A.length-1){
      if (A(i)>best){
        best=A(i)
        print(A(i)+" ")
      }
    }
   println("")
  }

}