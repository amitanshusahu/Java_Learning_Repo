import java.util.Scanner;
class CountNoOf{
    public static void main(String[] args){
        int num = 12343354;
        System.out.println("to find the nuber of 3 in " + num);
        int count = 0;
        while ( num > 0 ){
            int rem = num % 10;
            if (rem == 3) count++;
            num  /= 10;
        }
        System.out.println("\n number of 3 is" + count);
    }
}
