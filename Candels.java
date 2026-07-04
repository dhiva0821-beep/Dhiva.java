import java.util.Arrays;
public class Candels{
    public static void main(String[]args){
        int a=0;
        int [] arr={3,2,1,3};
        Arrays.sort(arr);
        int c=1;
        for (int i=arr.length-1;i>=0;i--){
            if (arr[i]==arr[i-1]){
                c=c+1;
            }else{
                break;
            }
        }
        System.out.println(c);
        }
}