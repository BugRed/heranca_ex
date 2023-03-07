package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class Program {

	public static void main(String[] args) {

		//Account acc = new Account(404, "Yahto", 0.0);
		//BusinessAccount bacc = new BusinessAccount(001, "Catarinas Lanches", 0.0, 500.00);
		
		//UPCASTING = um objeto de subclass pode ser atribuido a uma variavel de superclass
		
		//Account acc1 = bacc;
		Account acc2 = new BusinessAccount(222, "Empresas mil", 0.0, 5000.00);
		Account acc3 = new SavingAccount(171, "Coquinho suado", 0.0, 0.01);
		
		//DOWNCASTING = um objeto de superclass atribuido a uma variavel de subclass
		
		BusinessAccount acc4 = (BusinessAccount) acc2;
		acc4.loan(100.0);
		//BusinessAccount acc8 = (BusinessAccount)acc1;
		// nunca fazer um casting entre subclass
		// BusinessAccount acc5 = (BusinessAccount) acc3;
		
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingAccount) {
			SavingAccount acc5 = (SavingAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update");
			
		}
	}

}