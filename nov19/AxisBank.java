package nov19;

public class AxisBank extends BankInfo{
	public void deposit () {
		System.out.println("Deposit New");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank bank =new AxisBank();
		bank.saving();
		bank.fixed();
		bank.deposit();
	}

}
