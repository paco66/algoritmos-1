object ActivitySelector{
  type Set = Int => Boolean
  def selector(s:Array[Int], f:Array[Int], k:Int, n:Int): Int ={
  //  var A= new Array[Int](5)(5)
    var m=k+1
    while (m<=n && s(m)<f(k)){
     m=m+1
    }
    if (m<=n){
       var x=0
       return x=union(x,selector (s,f,m,n))
    } else{ 
      return 0}
   
  }

  def main(args:Array[String]){
    val s = Array(1,3,0,5,3,5,6,8,8,2,12)
    val f = Array(4,5,6,7,9,9,10,11,12,14,16)
    println(selector(s,f,0,s.length))

  }

  def union(a: Set, b: Set): Set = {  
    def theUnion(i: Int): Boolean = {
      a(i) || b(i)
    }
    theUnion
  }    

}