class ReverseOfANumberii{
    public static void main(String[] args){
        int num = 113443;
        int revNum = 0;
        while(num > 0){
            int rem = num % 10;
            num /= 10;
            revNum = revNum*10 + rem;

        }

        System.out.println(revNum);

}
