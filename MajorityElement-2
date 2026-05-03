//majority element-2
import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        int[] arr={1,1,1,4,2,2,2,4};
        ArrayList<Integer>array=new ArrayList<>();
        for(int i=0;i<=arr.length-1;i++){
            if(array.contains(arr[i])){
                continue;
            }
            if(array.size()>2){
                break;
            }
            int cnt=0;
            for(int j=0;j<=arr.length-1;j++){
                if(arr[i]==arr[j]){
                    cnt++;
                }
            }
            if(cnt>(arr.length)/3){
                array.add(arr[i]);
            }
        }
        System.out.println(array);
        
    }
}
