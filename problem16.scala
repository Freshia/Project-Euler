/*
Question:
2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
What is the sum of the digits of the number 2^1000?
*/
import scala.math._
import java.math.BigDecimal;
import collection.immutable.IndexedSeq
object problem16{
    def main(Args: Array[String]){
        val power:Double = pow(2,1000);
        println(power);
        //var powerString="%.0f".format(power);
        var powerString = new BigDecimal(power).toPlainString();
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