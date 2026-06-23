import java.util.Scanner;
public class Electric {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

         int a=input.nextInt();
        if (a<100 ) {
            int b=a*2;
            int e= b;
            System.out.println("bill is :"+e);   
        }
        else if (100<a && a<200){ 
             int c=(a-100)*3+200;
             int e=c;
             System.out.println("bill is :"+e);
        }
        else {
            int d=(a-200)*5+500;
            int e=d;
            System.out.println("bill is:"+e);
        }
    }
    
}
