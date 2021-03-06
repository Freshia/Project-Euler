/*
Question:
n! means n × (n − 1) × ... × 3 × 2 × 1
For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
Find the sum of the digits in the number 100!
*/
import scala.math._
import java.math.BigDecimal;
import collection.immutable.IndexedSeq
object problem20{
    def main(Args: Array[String]){
        val result = factorial(100);
    
        var resultString = new BigDecimal(result).toPlainString();
        var sum:Int = 0;
        for(i<-0 until resultString.length){
            var c = resultString.charAt(i).asDigit;
            if(c!=0){
                println(c);
                sum = sum + c;
            }
            
        }
        print(sum);

    }
    def factorial(number:Int):Double = {
        var fact:Double = 1;
        for(i<-1 to number){
            fact = fact*i;
            println(fact);
        }
        println(fact)
        return fact;
    }
}