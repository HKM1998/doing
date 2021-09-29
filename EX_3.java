
public class EX_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1 = new StringBuffer("Advanced Programming");
		
		System.out.println("시작 문자열 : \"" +sb1+"\"");
		
		sb1.delete(0, 8);
		sb1.insert(0,"Enhanced");
		System.out.println("출력 문자열 : \"" +sb1+"\"");
		
		sb1.delete(8,sb1.capacity());
		sb1.insert(8," Network");
		System.out.println("\"" +sb1+"\"");
	}

}