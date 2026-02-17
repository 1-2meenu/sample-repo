import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int[][] c=new int[4][4];
        for(int i=0;i<=c.length-1;i++){
            for(int j=0;j<=c[i].length-1;j++){
                c[i][j]=scan.nextInt();
            }
        }
        //logic to sum
        int sum=0;
        for(int i=0;i<=c.length-1;i++){
            for(int j=0;j<=c[i].length-1;j++){
                if(i==0 || i==c.length-1){
                    sum=sum+c[i][j];
                }
                else if(i!=0 && i!=c.length-1){
                    if(j==0 || j==c[i].length-1){
                        sum=sum+c[i][j];
                    }
                }
            }
        }
        System.out.println();
        //output
        System.out.println(sum);
    }
}
