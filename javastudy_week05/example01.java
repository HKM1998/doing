class Calculator{
	int[] result;
	int count=0;
	
	Calculator(){
		result = new int[10];
	}
	Calculator(int a) {
		result = new int[a];
	}
	
	int exec(int a, int b, char s) {
		if(s=='+') {
			result[count] = a+b;
		}
		else if (s=='-') {
			result[count] = a-b;
		}
		else if (s=='/') {
			result[count] = a/b;
		}
		else if (s=='*') {
			result[count] = a*b;
		}
		else if (s=='%') {
			result[count] = a%b;
		}
		return result[count++];
	}
	int exec(int a, int b, String s) {
		if(s=="+") {
			result[count] = a+b;
		}
		else if (s=="-") {
			result[count] = a-b;
		}
		else if (s=="/") {
			result[count] = a/b;
		}
		else if (s=="*") {
			result[count] = a*b;
		}
		else if (s=="%") {
			result[count] = a%b;
		}
		return result[count++];
	}
	void prevResult() {
		if(count==0) {
			System.out.println("저장된 결과값이 없습니다.");
			return;
		}
		System.out.printf("저장된 결과값 : ");
		for(int i=0; i<result.length;i++) {
			System.out.printf("%d ",result[i]);
		}
		System.out.println("");
	}
}

public class example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator calc = new Calculator(3);
		calc.prevResult();
		System.out.println("5 + 7 =  "+ calc.exec(5, 7, '+'));
		calc.exec(5,3,'-');
		calc.exec(9,3,"/");
		calc.prevResult();
		calc.exec(10,5,'*');
		calc.prevResult();
	}

}
