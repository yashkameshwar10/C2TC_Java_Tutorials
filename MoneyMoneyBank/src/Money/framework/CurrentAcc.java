package tnsif.framework;

public class CurrentAcc extends BankAcc {
	
	protected float Creditlimit;

	public CurrentAcc(int accno, String accname, float charges) {
		super(accno, accname, charges);
		
	}
		
	public float getCreditlimit() {
		return Creditlimit;
	}

	public void setCreditlimit(float Creditlimit) {
		this.Creditlimit = Creditlimit;
	}


}

	
