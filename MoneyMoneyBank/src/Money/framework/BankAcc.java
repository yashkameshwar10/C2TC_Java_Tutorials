package tnsif.framework;

public class BankAcc {
	private int accno;
	private String accname;
	private float charges;
	
	public BankAcc(int accno, String accname, float charges) {
		super();
		this.accno = accno;
		this.accname = accname;
		this.charges = charges;
	}

	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public String getAccname() {
		return accname;
	}

	public void setAccname(String accname) {
		this.accname = accname;
	}

	public float getCharges() {
		return charges;
	}

	public void setCharges1(float charges) {
		this.charges = charges;
	}
	
	
	public void setCharges(float charges) {
		this.charges = charges;
	}
	
	public void Withdraw(float charges)
	{
		System.out.println("the charge of the product is "+charges);
	}
	public void Salary(float charges)
	{
		System.out.println("the withdraw  are"+ charges);
	}
	@Override
	public String toString() {
		return "BankAcc [accno=" + accno + ", accname=" + accname + ", charges=" + charges + "]";
	}

}

	