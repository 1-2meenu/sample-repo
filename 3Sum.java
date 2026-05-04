//3 sum problem-two pointer approach
import java.util.*;
public class Main{
    public static void main(String[] args){
        int[] arr={-2,-2,-2,-1,-1,-1,0,0,0,1,1,1,2,2,2};
        Arrays.sort(arr);
        List<List<Integer>>list=new ArrayList<>();
        for(int i=0;i<=arr.length-3;i++){
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            int j=i+1,k=arr.length-1;
            while(j<k){
                if(j!=(i+1) && arr[j]==arr[j-1]){
                    j++;
                }
                else if(k>arr.length-1 && arr[k]==arr[k+1]){
                    k--;
                }
                else if(arr[i]+arr[j]+arr[k]==0){
                    List<Integer>temp=new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(arr[k]);
                    list.add(temp);
                    j++;
                    k--;
                }
                else if(arr[i]+arr[j]+arr[k]<0){
                    j++;
                }
                else{
                    k--;
                }
                
            }
            
            
        }
        System.out.println(list);
    }
}
