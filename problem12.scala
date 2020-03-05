import scala.math.sqrt;
object problem12{
    def main(Args: Array[String]){
        var number:Int =0;
        var i:Int=1;
        while(numberofdivisors(number)<500){
            number +=i;
            i+=1;
            println(number)

        }
        print(number)
    }
    def numberofdivisors(number:Int):Int={
        var divisors = 0;
        var sqrt:Int = math.sqrt(number).toInt;
        for(i<-1 to sqrt){
            if(number%i == 0){
                divisors += 2;
            }
        }
        if(sqrt*sqrt==number){
            divisors-=1;
        }
        return divisors;
    }
}