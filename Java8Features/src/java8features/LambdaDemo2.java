package java8features;

public class LambdaDemo2 {

	public static void main(String[] args) {
		
		NumericTest isEven=(n) -> (n%2==0);
        NumericTest isNegative =(n) ->(n<0);

        System.out.println(isEven.computerTest(7));
        System.out.println(isNegative.computerTest(-55));

        //boolean a=(n) -> (n%2==0); //error - lambda expressions should be stored in instance of FI

	}

}
