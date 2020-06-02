/*
Question:
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.
There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.

*/
import scala.util.control.Breaks._
object problem9{
    def main(Args: Array[String]){
        var a:Int = 0;
        var b:Int = 0;
        var c:Int = 0;
        var sum:Int =1000;
        var found:Boolean = false;
        breakable{
        for(i<-1 to sum/3;j<-a to sum/2){
            c= sum-i-j;
            a=i;
            b=j;
            if(a*a+b*b == c*c){
                found=true;
                break;
            }
            if(found){
                break;
            }
        }
        
        }
        println("The value of a is"+a+" and b is"+b+" and c is "+c);
    }
}