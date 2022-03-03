package tnsif.application;

import tnsif.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accno, String accname, float charges) {
		super(accno, accname, charges);
		
	}
	
	@Override
	public void Withdraw(float charges) {
		System.out.println("You have saving money "+charges+ " along with current account"+Creditlimit);
	}

}
