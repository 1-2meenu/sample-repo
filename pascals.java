//print pascals traingle
import java.util.List;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        int row=5;
        ArrayList<ArrayList<Integer>>array=new ArrayList<>();
        for(int i=1;i<=row;i++){
            ArrayList<Integer>arr1=new ArrayList<>();
            for(int j=1;j<=i;j++){
                if(j==1 || j==i){
                    arr1.add(1);
                }
                else{
                    ArrayList<Integer>arr2=array.get(i-2);
                    arr1.add(arr2.get(j-1)+arr2.get(j-2));
                }
            }
            array.add(arr1);
            
        }
        System.out.println(array);
        int r=5;
        int col=2;
        List<Integer>result=array.get(r-1);
        int answer=result.get(col-1);
        System.out.println(answer);
        System.out.println(result);
    }
}
