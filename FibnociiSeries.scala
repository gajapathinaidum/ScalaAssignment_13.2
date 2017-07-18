package acadgildclassesobjects

object FibnociiSeries {

  def fibnociiStdForloop(limit:Int){
    var first=0;
    var second=1;
    var next=1;
    var fibSeries=""
    for(i<-1 to 100){
      next=first+second
      first=second
      second=next
      fibSeries+=first;
    }
    println(s"fibnocii series of 1 to $limit is"+fibSeries)
  }
var fibSeries=""
var index=0;  
 def fibnociiRecusrsion(prevPrev: Int, prev: Int) {
        val next = prevPrev + prev
        fibSeries+=next
        if (index > 100) {
        println(s"fibnocii series of 1 to 100 is"+fibSeries) 
        System.exit(0)}
        index+=1;
        fibnociiRecusrsion(prev, next)
    }
  
   def main(args:Array[String]){
     fibnociiStdForloop(100)
     fibnociiRecusrsion(0,1)
    
   }
}