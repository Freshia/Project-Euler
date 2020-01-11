object problem1{
    def main(Args: Array[String]){
        var sum = 0;
        for(i<-0.until(1000);if(i%3==0 || i%5==0)){
            sum = sum +i;
        }
        print(sum);
    }
}