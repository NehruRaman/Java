package pattern;

public class TestQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 7312;
		int a=0,b=0;
		for(int i=1;i<=number;i++) {
			int sp = number%10;
			if(i%2==0) {
				a=a+sp;
			}
			else
			{
				b=b+sp;
			}
			number = number/10;
			}
		System.out.println("answer:"+a+"-"+b+"=:"+(a-b));
	}
}
