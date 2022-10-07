import java.util.Scanner;

class Fibanachi{
    public static void main(String[] args) {
        // ? print n fibbanachi numbers
        int n;
        int next;
        int pre;
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        pre = 0;
        next = 0;

        for(int i =0; i<=n; i++){
            System.out.println(i+pre);
        }
    }
}