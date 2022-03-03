package tnsif.c2tc;

import tnsif.application.MMBankFactory;
import tnsif.application.MMCurrentAcc;
import tnsif.application.MMSavingAcc;
import tnsif.framework.BankFactory;
import tnsif.framework.CurrentAcc;
import tnsif.framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		BankFactory bf=new MMBankFactory();
		SavingAcc sa=new MMSavingAcc(45321, "Yash" , 2000); 
		sa.Withdraw(600);
        CurrentAcc ca= new MMCurrentAcc(56472, "Kameshwar", 800);
        ca.Withdraw(200);
		

	}

}
