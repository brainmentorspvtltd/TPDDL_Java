class Account{
	int id;
	String name;
	double balance ;
	Account(){
		System.out.println("Account class Default cons");
		balance = 9000;
	}
	Account(int balance){
		this.balance = balance;
		System.out.println("Account class Param Cons Call");
	}
	void withDraw() {
		System.out.println("Account withDraw");
	}
	void deposit() {
		System.out.println("Account Deposit");
	}
	void roi() {
		System.out.println("Account ROI 3%");
	}
}
class SavingAccount extends Account{
	double balance;
	 SavingAccount() {
		 // this is implicit super call
		 // super(); // calling parent class default cons
		System.out.println("Saving Account default cons");
		balance = 10000 + super.balance;  // this.balance = 10000;
		System.out.println("Balance is "+balance);
	 }
	 SavingAccount(int balance){
		 // super() parent cons call or 
		 // this () own class cons call
		 // both must be on first line 
		 super(1000);  // Explicit Cons Call
		 this.balance = balance + super.balance;
		 System.out.println("Saving Account Param Cons Call"+this.balance);
	 }
	@Override
	void roi() {
		//roi();  this.roi()
		super.roi();
		System.out.println("SA ROI "+this.getInterestRate()+"%");
	}
	int getInterestRate() {
		return 4;
	}
}
class CurrentAccount extends Account{
	@Override
	void roi() {
		System.out.println("CA ROI Pay 6%");
	}
	void odLimit() {
		System.out.println("OD Limit 50K");
	}
}

class AccountCaller{
	void callAccount(Account account) {
		account.withDraw();
		account.deposit();
		account.roi();
		if(account instanceof SavingAccount) {
			SavingAccount sa = (SavingAccount) account; // Downcasting
			sa.getInterestRate();
		}
		if(account instanceof CurrentAccount) {
			((CurrentAccount)account).odLimit();
		}
		System.out.println("*******************");
	}
}

public class ISADemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountCaller ac = new AccountCaller();
		ac.callAccount(new SavingAccount(2000));
		ac.callAccount(new CurrentAccount());
//		Account sa = new SavingAccount(2000);
//		//SavingAccount sa = new SavingAccount(2000);
//		sa.withDraw();
//		sa.deposit();
//		//sa.saroi();
//		sa.roi();
//		sa.getInterestRate();
////		System.out.println("******************");
//		CurrentAccount ca = new CurrentAccount();
//		ca.withDraw();
//		ca.deposit();
//		//ca.caroi();
//		ca.roi();
//		ca.odLimit();
		System.out.println("Access M");
		FinalUse f = new FinalUse();
		System.out.println(f.m);
	}

}
