object UpCutRod { 
  val DEFAULT_REVENUE = -1

  def run(array: Array[Int], n: Int): Int = {
    var r = new Array[Int](n + 1)
    r(0)=0

    for (j <- 1 to n) {
      var q = -1
      for (i <- 1 to j) {
	q = math.max(q, array(i-1) + r(j-i))
      }
      r(j) = q
    }

    return r(n)
  }

  def main(args: Array[String]){
    val A = Array(1, 5, 8, 9)
    
    println(run(A, A.length))
    
  }
} 