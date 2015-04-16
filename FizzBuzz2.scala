object FizzBuzz2 {
    def main(args: Array[String]) {
       for (i <- 1 to 100) {
           if (i % 3 != 0 && i % 5 != 0) {
               print (i)
           } 
	   if (i % 3 == 0) {
               print ("Fizz")
           } 
	   if (i % 5 == 0) {
               print ("Buzz")
           }  
           println("")
       }
    }
}
