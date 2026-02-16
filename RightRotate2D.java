import java.util.Scanner;
public class RightRotate2D{
    static void rightrotate(int[] arr,int row){
        int[] temp=new int[row];
        int index=0;
        for(int i=arr.length-row;i<=arr.length-1;i++){
            temp[index]=arr[i];
            index++;
        }
        
        for(int i=arr.length-1-row;i>=0;i--){
            arr[i+row]=arr[i];
        }
        for(int i=0;i<=temp.length-1;i++){
            arr[i]=temp[i]; 
        } 
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int[][] c=new int[3][3];
        for(int i=0;i<=c.length-1;i++){
            for(int j=0;j<=c[i].length-1;j++){
                c[i][j]=scan.nextInt();
            }
        }
        System.out.println();
        for(int i=0;i<=c.length-1;i++){
            rightrotate(c[i],i);
        }
        for(int i=0;i<=c.length-1;i++){
            for(int j=0;j<=c[i].length-1;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
