package exception_handling;

public class NegativeBalanceException extends Exception {

	private  String msg;

	public NegativeBalanceException(String string) {
		// TODO Auto-generated constructor stub
		
		this.msg = string;
	}

	@Override
	public String toString() {
		return (msg);
	}

}
