//Algorithm - Make palindromes. Try to find three digit multiples of the palindrome
import scala.util.control.Breaks._
object problem4{
   def main(Args: Array[String]){
       
       var found:Boolean = false;
       var firstHalf:Int = 998;
       var palindrome:Int = 0;
       var factor1 = 0;
       var factor2 = 0;
      
       while(!found){
           firstHalf-=1;
           palindrome = make_palindrome(firstHalf);
            breakable{
           for(i <- 999 to 99 by -1){
               println(i)
               if ((palindrome/i >999) || (i*i < palindrome)){
                    break;
               }
               if(palindrome%i==0){
                   found = true;
                   factor1 = palindrome/i;
                   factor2 = i;
                   break;

               }
           }
       }
       }
       println("The first factor is "+ factor1 + " The second factor is "+factor2 + " The palindrome is "+ palindrome)
   }
   def make_palindrome(firstHalf : Int): Int = {
       val reversedhalf = firstHalf.toString.reverse;
       val palindrome = (firstHalf.toString + reversedhalf).toInt;
       return palindrome

   }
}