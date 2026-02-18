public class Main{
    private int balance=100;
    public void deposit(int amount){
        balance+=amount;
    }
    public int checkbalance(){
        return balance;
    }
    public static void main(String[] args){
        Main obj=new Main();
        obj.deposit(900);
        int balance=obj.checkbalance();
        System.out.println(balance);
    }
}
