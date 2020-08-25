

object Fibonacci {
  def fib(num:Int,result:Int):Int={if(num==1)result else fib(num-1,result+num)}
  def main(args:Array[String]){ 
    val fiboncci_of=scala.io.StdIn.readInt()
    val integer=scala.io.StdIn.readInt()
    print(fib(fiboncci_of,integer))
    }
  }
   