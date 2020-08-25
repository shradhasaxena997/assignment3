

object Higher_Order_Function {
 def math(x:Double,y:Double,f:(Double,Double)=>Double):Double=f(x,y)
 def main(args:Array[String]){
   val length=scala.io.StdIn.readInt()
   val breadth=scala.io.StdIn.readInt()
   val height=scala.io.StdIn.readInt()
   val area_of=scala.io.StdIn.readInt()
   val area_of_rectangle=math(length,breadth,(x,y)=>x*y)
   val area_of_rhombus=math(length,breadth,(x,y)=>(x*y)/2)
   val area_of_parallelogram=math(length,height,(x,y)=>x*y)
   area_of match{
     case 1=>println(s"Area of reactangle is $area_of_rectangle")
     case 2=>println(s"Area of rhombus is $area_of_rhombus")
     case 3=>println(s"Area of parallelogram is $area_of_parallelogram")
     case _=>println("wrong")
  }
 }
}
 