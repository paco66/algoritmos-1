object mergesort2 {

  def sort(array:Array[Int]) {
    if (array.length > 1 ){
      var y = (array.length/2)
      var primero:Array[Int] = array.slice(0, y)
      var segundo:Array[Int] = array.slice(y, array.length)
      sort(primero)
      sort(segundo)
      merge(array, primero, segundo)
    }
  }

  def merge(resultado:Array[Int], primero:Array[Int], segundo:Array[Int]) {
    var i:Int = 0
    var j:Int = 0
    for (k <- 0 until resultado.length) {
      if(i<primero.length && j<segundo.length){
        if (primero(i) < segundo(j)){
          resultado(k) = primero(i)
          i=i+1
        } else {
          resultado(k) = segundo(j)
          j=j+1
        }
      }else if(i>=primero.length && j<segundo.length){
        resultado(k) = segundo(j)
        j=j+1
      } else {
        resultado(k) = primero(i)
        i=i+1
      }
    }
  }



  def main(args: Array[String]) {
    val A:Array[Int] = List(120, 13, 4, 99, 18, 6, 4, 200, 2).toArray
   sort(A)
    for(i<-0 to A.length-1)
      println( A(i) )
  }

}