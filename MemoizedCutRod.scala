object MemoizedCutRod {
  
  def CutAux(array: Array[Int], n: Int, r: Array[Int]): Int = {
    if (r(n-1) >= 0)
      return r(n-1)

    var q = -1
    if (n == 0)
      q = 0
    else {
      for (i <- 0 to n-1) {
	var snd = 0
	if ((n - (i+1)) > 0)
	  snd = CutAux(array, n-(i + 1), r)
	q = math.max(q, array(i) + snd)
      }
    }

    r(n - 1)= q
    return q
  }


  def run(array: Array[Int], n: Int): Int = {
    var r = new Array[Int](n)
    for(i<-0 to n-1){
       r(i) = -999}
    CutAux(array, n, r)
  }
  
  def main(args: Array[String]){
    val A = Array(1, 5, 8, 9)
    
    println(run(A, A.length))
    
  }
}