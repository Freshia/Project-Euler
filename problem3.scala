/*
Question:
The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?
*/

object problem3{
    def main(Args: Array[String]){
        var n: Long = 600851475143L;
        var x:Int = 2;
        while(n>=(x*x)){
            if(n%x == 0){
                n = n/x;
            }
            else{
                x=x+1;
            }
        }
         print(n);
       
    }
}