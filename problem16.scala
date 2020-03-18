import scala.math._
import java.math.BigDecimal;
import collection.immutable.IndexedSeq
object problem16{
    def main(Args: Array[String]){
        val power:Double = pow(2,1000);
        println(power);
        var powerString="%.0f".format(power);
        
        var sum:Int = 0;
        for(i<-0 until powerString.length){
            var c = powerString.charAt(i).asDigit;
            if(c!=0){
                println(c);
                sum = sum + c;
            }
            
        }
        print(sum);

    }
}