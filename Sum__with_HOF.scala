

object Sum__with_HOF {
 def sum_of_int(intList:List[Int],length:Int):Int={if(length<=0)0 else sum_of_int(intList,length-1)+intList(length-1) }
 def squareList(intList: List[Int],f:(List[Int])=>List[Int]): List[Int]=f(intList)
 def sum_of_square(square:List[Int],length:Int):Int={if(length<=0)0 else sum_of_square(square,length-1)+square(length-1) }
 def cubeList(intList: List[Int],f:(List[Int])=>List[Int]): List[Int]=f(intList)
 def sum_of_cube(cube:List[Int],length:Int):Int={if(length<=0)0 else sum_of_cube(cube,length-1)+cube(length-1) }
 def main(args:Array[String]){
   val length=args.length
   val intList:List[Int]=args.map(_.toInt).toList
   println(sum_of_int(intList,length))
   val square:List[Int]=squareList(intList,intList => intList map (x => x * x))
   println(sum_of_square(square,length))
   val cube:List[Int]=cubeList(intList,intList => intList map (x => x * x *x))
   println(sum_of_cube(cube,length))
 }
}
