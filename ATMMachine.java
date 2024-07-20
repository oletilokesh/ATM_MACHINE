import java.util.*;
public class ATMMachine {
    float balance;
    int pin=5467;
    public void checkpin(){
        System.out.println("enter pin");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if(enteredpin == pin){
            menu();
        }
        else{
            System.out.println("Enter valid pin");
        }
    }
    public void menu(){
        System.out.println("Enter your choice");
        System.out.println("1.check A/C Balance");
        System.out.println("2.Deposit Money");
        System.out.println("3.Withdraw Money");
        System.out.println("4.exit");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        if(ch == 1){
            checkbalance();
        }
        else if(ch == 2){
            depositmoney();
        }
        else if(ch == 3){
            withdrawmoney();
        }
        else if(ch == 4){
            return;
        }
        else{
            System.out.println("Enter a valid choice");
        }
    }
    public void checkbalance(){
        System.out.println("balance is : "+ balance);
        menu();
    }
    public void depositmoney(){
        System.out.println("Enter money");
        Scanner sc = new Scanner(System.in);
        float money = sc.nextFloat();
        balance = balance + money;
        System.out.println("money deposited successfully");
        menu();
    }
    public void withdrawmoney(){
        System.out.println("Enter money");
        Scanner sc = new Scanner(System.in);
        float money = sc.nextFloat();
        balance = balance - money;
        System.out.println("money withdrawn successfully");
        menu();
    }
    public static void main(String[] args){
        ATMMachine obj = new ATMMachine();
        obj.checkpin();
    }
}