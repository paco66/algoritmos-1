object cutrod {
  def cutRod(array:Array[Int], n:Int): Int ={
    if (n==0){ 
      return 0
      }  
    var q = -999
    for (i<-0 to n-1){
       q = Math.max( q, array(i)+cutRod(array,n-(i+1)))
       }
    return q
   
  }

  
  def main (args: Array[String]){
    var A=Array(1, 5, 8, 9)
      println(cutRod(A, A. length))
  }
}
