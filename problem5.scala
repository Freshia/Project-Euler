/*
Question:
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/
//this uses bruteforce :(
//not the best idea. To be refined
import scala.util.control.Breaks._
object problem5{
    def main(args: Array[String]){
        var num:Int = 20;
        var found:Boolean = false;
        while(!found){
            num += 20;
            breakable{
            for(i<-1 to 20){
                if(num%i !=0){
                    println(i)
                    println(num)
                    break;
                }
                if(i==10){
                    found = true;
                }
            }

            }
            
        }
        print(num);
        
    }
}