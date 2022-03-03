package tnsif.framework;

public class SavingAcc extends BankAcc {

	public SavingAcc(int accno, String accname, float charges) {
		super(accno, accname, charges);
		
	}
	private static boolean isSalary = true;
	
	public boolean isIsSalary() {
		return isSalary;
	}

	public void setIsSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}

	@Override
	public String toString() {
		return "SavingAcc [getAccno()=" + getAccno() + ", getAccname()=" + getAccname() + ", getCharges()="
				+ getCharges() +  "]";
	}
}