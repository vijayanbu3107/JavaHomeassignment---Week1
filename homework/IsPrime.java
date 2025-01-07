package homework;

public class IsPrime {

	public static void main(String[] args) {
		int a=13;
		boolean prime=true;
		for (int i = 2; i<a; i++) {
			if(a%i==0) {
			break;
			}
		}
		if (prime) {
			System.out.println(a +"is a prime number");
		} else {
          System.out.println(a+"is not a prime number");
		}
	}
}
		 