import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int totalcapacity=10;
        int total=totalcapacity;
        int alwaysremain=5;
        int sold=0;
        int rem=10;
        while(true){
            System.out.println("Enter the number of chocolates needed:");
            int needed=scan.nextInt();
            sold=sold+needed;
            System.out.println("Number of chocolates sold:"+sold);
             rem=rem-needed;
            System.out.println("Remaining chocolates in the jar:"+rem);
            if(rem<alwaysremain){
                rem=rem+(total-rem);
            }
        }
    }
}
