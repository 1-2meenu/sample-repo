public class Main{
    public static void main(String[] args){
        int[] arr={7,1,5,3,6,4,10};
        int buy=arr[0];
        int profit=0;
        for(int i=1;i<=arr.length-1;i++){
            int cost=arr[i]-buy;
            profit=Math.max(profit,cost);
            if(arr[i]<buy){
                buy=arr[i];
            }
        }
        System.out.println(profit);
    }
}
