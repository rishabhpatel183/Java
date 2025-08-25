
class Bank {
    int accountNo=5555;
    private int bal=1000;
    int pin = 1234;
    public int getBal(String pass) {
        //authenticate
        if(pass == "yuiop"){
            return this.bal;
        }
        System.out.println("auth fail");
        return -1;
    }
    public int getPin(){
        return pin;
    }
    public void matchBal(int bal) {
        if(this.bal == bal ){
            System.out.println("correct");
        }
        else{
            System.out.println("false: your bal is " + this.bal);
        }
    }
    
}

public class Banking {
    public static void main(String[] args) {
    
        Bank rishabhAcc = new Bank();

         int res = rishabhAcc.getBal("yuiop");
         System.out.println(res);
        
         rishabhAcc.matchBal(10000);
        // int newBal = rishabhAcc.getBal("yuiop");
        // System.out.println(newBal);
   
    }
}
