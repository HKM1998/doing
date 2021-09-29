
public class EX_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] math;
		math = new int[3][3];
		math[0]= new int[] {2,4,8};
		math[1]= new int[] {3,6,9};
		math[2]= new int[] {4,16,64};
		
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(math[i][j]);
			}
		}
		
	}

}
