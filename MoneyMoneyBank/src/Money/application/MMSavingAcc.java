package tnsif.application;

import tnsif.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {

	public MMSavingAcc(int accno, String accname, float charges) {
		super(accno, accname, charges);
		
	}
	
	@Override
	public void Withdraw(float charges) {
		
		System.out.println("You have saving money"+charges);

	}

	@Override
	public String toString() {
		return "MMSavingAcc [isIsSalary()=" + isIsSalary() + ", toString()=" + super.toString() + ", getAccno()="
				+ getAccno() + ", getAccname()=" + getAccname() + ", getCharges()=" + getCharges() + ", getClass()="
				+ getClass() + "]";
	}

}
