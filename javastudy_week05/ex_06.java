class NewTime{
	int hour;
	int minute;
	int second;
	
	NewTime() {
		hour = 0; minute = 0; second = 0;
	}
	NewTime(int h) {
		this(h,0,0);
	}
	NewTime(int h, int min) {
		hour = h; minute = min; second = 0;
	}
	NewTime(int h, int min, int sec) {
		hour = h; minute = min; second = sec;
	}
}

public class ex_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NewTime t = new NewTime();
		t.hour = 12;
		t.minute = 20;
		t.second = 25;
		
		NewTime t2 = new NewTime(12,20,25);
		
		int res = ex_05.add(3,5);

		System.out.println("static add method 3 + 5 : " + res);
		ex_05 ex5 = new ex_05();
		int res2 = ex5.minus(5, 3);
		

		System.out.println("minus method 5 - 3 : " + res2);
		
	}

}
