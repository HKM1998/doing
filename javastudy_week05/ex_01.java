class Tv{
	String color;
	boolean power;
	int channel;
	
	void power(){ power =! power;}
	void channelUp() { channel++;}
	void channelDown() {channel--;}
}

public class ex_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t;
		t= new Tv();
		
		System.out.printf("color : %s, power : %b, channel : %d\n", t.color,t.power,t.channel);
		t.channel = 7;
		System.out.println("채널 초기화 결과 채널 값"+t.channel);
		t.channelDown();
		System.out.println("채널 다운 메서드 실행 결과 채널값"+t.channel);
	}

}
