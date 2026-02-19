import java.util.ArrayList;
public class Main{
    public static void main(String[] args){
        int[] arr={3,1,-2,-5,2,-4,-1,-9,1,2,3,9,10};
        
        //if there are equal number of positives and negatives
        ArrayList<Integer>pos=new ArrayList<>();
        ArrayList<Integer>neg=new ArrayList<>();
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]>0){
                pos.add(arr[i]);
            }
            else{
                neg.add(arr[i]);
            }
        }
        if(pos.size()==neg.size()){
        for(int i=0;i<pos.size()-1;i++){
            arr[2*i]=pos.get(i);
            arr[2*i+1]=neg.get(i);
        }
        }
        else if(pos.size()>neg.size()){
           for(int i=0;i<=neg.size()-1;i++){
               arr[2*i]=pos.get(i);
               arr[2*i+1]=neg.get(i);
           }
           int index=neg.size()*2;
           for(int i=neg.size();i<=pos.size()-1;i++){
               arr[index]=pos.get(i);
               index++;
           }
        }
        else if(neg.size()>pos.size()){
           for(int i=0;i<=pos.size()-1;i++){
               arr[2*i]=pos.get(i);
               arr[2*i+1]=neg.get(i);
           }
           int index=pos.size()*2;
           for(int i=pos.size();i<=neg.size()-1;i++){
               arr[index]=neg.get(i);
               index++;
           }
        }
        
        //printing the array
        for(int result:arr){
            System.out.println(result);
        }
        
        
    }
}
