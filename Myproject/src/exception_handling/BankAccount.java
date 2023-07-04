package exception_handling;

public class BankAccount {

	private double balance;
	public BankAccount(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
    public void withdraw(double amount) throws NegativeBalanceException {
        if ((balance - amount) < 0) {
        	 throw new NegativeBalanceException("Insufficient funds to withdraw " + amount + " Rupees."); 
        } else {
            balance -= amount;
        }
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BankAccount ba = new BankAccount(200);
        try {
            ba.withdraw(100);
        } catch (NegativeBalanceException ex) {
            System.out.println(ex.toString());
        }
        System.out.println("Remaining balance: " + ba.getBalance());
    }

	}


