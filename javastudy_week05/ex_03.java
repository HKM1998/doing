class NewTv{
	String color;
	boolean power;
	int channel;
	
	static int width;
	static int height;
	
	void power() {power=!power;}
	void channelUp() {channel++;}
	void channelDown() {channel--;}
}
public class ex_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewTv t = new NewTv();
		NewTv t2 = new NewTv();
		
		t.width = 300;
		t.height = 200;
		
		t.color = "Blue";
		t.channel = 5;
		t2.color = "White";
		t2.power = true;
		t2.channel =7;
		
		System.out.printf("T - color : %s, power : %b, channel : %d\n", t.color,t.power,t.channel);
		System.out.printf("T2 - color : %s, power : %b, channel : %d\n", t2.color,t2.power,t2.channel);
		

		System.out.printf("T1 - width : %d, height : %d\n", t.width,t.height);
		System.out.printf("T2 - width : %d, height : %d\n", t2.width,t2.height);
	}

}
