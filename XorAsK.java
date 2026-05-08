//count subarrays with xor as k
import java.util.*;
public class Main{
    public static void main(String[] args){
        int[] arr={4,2,2,6,4,6};
        int k=6;
        HashMap<Integer,Integer>mp=new HashMap<>();
        mp.put(0,1);
        int xor=0,cnt=0;
        for(int i=0;i<=arr.length-1;i++){
            xor=xor^arr[i];
            if(mp.containsKey(xor^k)){
                cnt=cnt+mp.get(xor^k);
            }
            if(mp.containsKey(xor)){
                mp.put(xor,mp.get(xor)+1);
            }
            else if(!mp.containsKey(xor)){
                mp.put(xor,1);
            }
        }
        System.out.println(cnt);
    }
}
