package homework;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a= 8, firstnumber=0, secondnumber=1;
		int nextnumber;
		for (int i = 0; i < a; i++) {
			System.out.println(firstnumber);
			nextnumber=firstnumber+secondnumber;
			firstnumber=secondnumber;
			secondnumber=nextnumber;
		}
	}

}
