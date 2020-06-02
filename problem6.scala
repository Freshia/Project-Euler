/*
Question:
The sum of the squares of the first ten natural numbers is,
1^2+2^2+...+10^2=385
The square of the sum of the first ten natural numbers is,
(1+2+...+10)^2=552=3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025−385=2640.
Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/

//done by brute force. Better method to be implemented

object problem6{
    def main(Args: Array[String]){
        var sumofsquares = 0
        var sum = 0
        for(i<-1 to 100){
            sum += i;
            sumofsquares+=i*i;
        }
        val difference = (sum*sum)-sumofsquares
        print(difference)
    }
}