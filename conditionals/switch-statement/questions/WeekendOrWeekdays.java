import java.util.Scanner;
public class WeekendOrWeekdays{
    public static void main(String[] args){
        System.out.println("enter a nuber between 1 to 7");

        int num = 3;

        switch(num){
            case 1 : 
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                System.out.println("Weekdays");
                break;
            case 6 :
            case 7 :
                System.out.println("Weekend");
                break;
        }


    }
}
