
public class ex_05 {

	static int add(int a, int b) {
		int result = a+b;
		return result;
	}
	
	static int minus(int a, int b) {
		int result = a-b;
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result =add(3, 5);
		
		System.out.println("add method 3 + 5 : "+result);
		
		int result2 =minus(3, 5);
		

		System.out.println("minus method 3 + 5 : "+result2);
	}

}
