object problem2{
    def main(Args: Array[String]){
        var a:Int=0;
        var b: Int =1;
        var sum:Int = 0;
        while(sum<=4000000){
            var c = a+b;
            if(c%2==0){
                sum = sum+c;
            }
            a=b;
            b=c;
        }
        print(sum);
    }
}