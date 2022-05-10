package java8features;

@FunctionalInterface
interface MyFI{
	public String sayHello();
}

public class LambdaDema1 {
	public static void main(String[] args) {
		
		MyFI msg = () -> { return "hello world";};
		System.out.println(msg.sayHello());
		
	}
}
