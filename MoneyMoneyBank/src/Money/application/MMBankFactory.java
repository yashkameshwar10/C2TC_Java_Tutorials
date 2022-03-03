package tnsif.application;

import tnsif.framework.BankFactory;
import tnsif.framework.CurrentAcc;
import tnsif.framework.SavingAcc;

public class MMBankFactory implements BankFactory {

	@Override
	public CurrentAcc getNewCurrentAccount(int accno,String accname,float charges) {
		CurrentAcc ca=new CurrentAcc(accno,accname,charges);
		return ca;
	}

	@Override
	public SavingAcc getSavingAccount(int accno, String accname, float charges) {
		SavingAcc sa= new SavingAcc(accno,accname,charges);
		return sa;
	}
	
	
	

}



