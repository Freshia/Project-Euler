import scala.math._
import collection.immutable.IndexedSeq
object problem16{
    def main(Args: Array[String]){
        val power = pow(2,1000);
        var powerString= power.toString;
        println(powerString)
        var sum:Int = 0;
        //sum = powerString.map(_.toInt+sum);
        for(i<-0 until powerString.length){
            var c = powerString.charAt(i);
            println(c)
            sum = sum + c.toInt;
        }
        print(sum);

    }
}