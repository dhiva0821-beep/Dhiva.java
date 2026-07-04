import java.util.*;
class Arraydimension{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int [][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=in.nextInt();
               
            }
        }
        int d1=0;
        for(int i=0;i<n;i++){
            d1=d1+arr[i][i];
        }
        int l=n-1;
        int d2=0;
        for (int i=0;i<n;i++){
            d2=d2+arr[l][i];
            l=l-1;
        }
        System.out.print(Math.abs(d1-d2));
        }  
    }
