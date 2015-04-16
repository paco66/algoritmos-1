object HirePermute{
  def main(args: Array [String]){
    val A = Array (1,2,3,4,5,6,7)
    per(A)
    hire(A)
  }

  def per(array: Array[Int]){
    var n = array.length
    var p = new Array[Int](n)
    val r = scala.util.Random
    var x= n*n*n
    for (i <- 0 to n-1)
      p(i) = r.nextInt(x)
    println("num  prioridad")
    imp(array, p)
    ord(array, p)
    println("Ordenados")
    imp(array, p)
  } 
  
  def imp(a:Array [Int], b:Array[Int]){
    for(i<-0 to a.length-1){
      println(a(i)+"    "+b(i))
    } 
  }

  def ord(A:Array [Int], B:Array[Int]){
      var aux = 0
      var aux2=  0
      var x=0
  //    var y=0
      for(i <- 0 to B.length - 2) {
	 aux = B(i)
 //        x= A(i)
	 for(j <- i+1 to B.length - 1) {
	  if(aux > B(j)) {
	    aux2 = j
	    aux = B(j)
	    }
         }
	 if(B(aux2) < B(i)) {
	   aux = B(i)
           x=A(i)
	   B(i) = B(aux2)
           A(i) = A(aux2)
	   B(aux2) = aux
           A(aux2) = x
	 }
      }
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