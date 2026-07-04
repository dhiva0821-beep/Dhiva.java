import java.util.Scanner;

public class Whilereverse {
    public static void main(Stringex[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int b=0;
        while(n>0){
            int digit=n%10;
            b=b*10+digit;
            n=n/10;
        }
        System.out.println(b);
    }
}
