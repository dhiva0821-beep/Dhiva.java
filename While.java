import java.util.Scanner;
public class While {
    public static void main(Stringex[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int a=0;
        while(n>0){
            int b=n%10;
            a+=b;
            n/=10;
        }
        System.out.println(a);
    }
}
