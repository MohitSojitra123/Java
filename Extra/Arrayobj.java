import java.util.Scanner;

class Bank1{
    int ano;
    double balance;
    static double total=0;
    Bank1(int ano,double balance){
        this.ano=ano;
        this.balance=balance;
    }
    void display(){
        System.out.print("Accno"+ano);
        System.out.println("balance"+balance);
    }
    static double totalBal(Bank1[] b){
        for(int i=0;i<b.length;i++){
            total=total+b[i].balance;
        }
        return total;
    }
}

public class Arrayobj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total amount");
        int size = sc.nextInt();
        Bank1[] b = new Bank1[size];

        for(int i=0;i<b.length;i++){
            System.out.println("Eneter Account No.");
            b[i]=new Bank1(sc.nextInt(), sc.nextDouble());
        }

        for(int i=0;i<b.length;i++){
            b[i].display();
        }
        double tot = Bank1.totalBal(b);
        System.out.println("Total money in bank account"+tot);
    }
}