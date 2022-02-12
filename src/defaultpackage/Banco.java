package defaultpackage;
import java.util.Locale;
import java.util.Scanner;
import java.util.Random;
import entities.Account;

public class Banco {
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		double accBalance = 0;
		
		System.out.print("Enter account name: ");
		String accName = sc.nextLine();
		System.out.print("Is there a initial deposit? (Y/N)\n");
		char ch = sc.next().charAt(0);
		
		if(ch=='Y' || ch=='y') {
			System.out.print("Enter initial deposit value: ");
			accBalance = sc.nextDouble();
		} else if(ch=='N' || ch=='n') {
			
		} else {
			System.out.print("!!ERRO!!");
			System.exit(1);
		}
		
		
		int accId = random.nextInt(9999);
		Account Acc = new Account(accId, accName, accBalance);
		System.out.print("Account info: \n"+Acc);
		
		System.out.println("Enter deposit value: ");
		Acc.Deposit(sc.nextDouble());
		
		System.out.println("Update: \n"+Acc);
		
		System.out.println("Enter withdraw value: ");
		Acc.Withdraw(sc.nextDouble());
		
		System.out.println("Update: \n"+Acc);
		
		sc.close();
	}
}
