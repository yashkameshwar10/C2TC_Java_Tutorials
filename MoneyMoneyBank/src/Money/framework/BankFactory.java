package tnsif.framework;

public interface BankFactory {
	public CurrentAcc getNewCurrentAccount(int accno, String accname, float charges);
	public SavingAcc getSavingAccount(int accno, String accname, float charges);



}
