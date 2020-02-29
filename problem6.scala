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