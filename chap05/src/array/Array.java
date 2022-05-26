package array;

public class Array {

	public static void main(String[] args) {
		/*
		 * int[] intAry = new int[2]; for(int i=0; i<intAry.length; i++) {
		 * System.out.println("intAry[" + i +"]: " +intAry[i]); } int[][] intAry2=new
		 * int[3][2]; // int[2]가 총 3개 존재하는 2차원 배열 for (int i=0; i< intAry2.length; i++)
		 * { int[] tempAry = intAry2[i]; for(int j=0; j<tempAry.length; j++) {
		 * System.out.println("intAry2["+i+"]["+j+"]:"+intAry2[i][j]);
		 * //System.out.println("tempAry["+j+"]:" + tempAry[j]); } }
		 * 
		 * System.out.println(); int[][] intAry3 = new int[2][]; intAry3[0] = new
		 * int[3]; intAry3[1] = new int[5];
		 * 
		 * for(int i=0; i<intAry3.length; i++) { for(int j=0; j<intAry3[i].length; j++)
		 * { System.out.println("intAry3[" + i + "]["+j+"]:"+intAry3[i][j]); }
		 * System.out.println(); }
		 * 
		 */
		
		//2차원 배열
		int[][] javaScores = { { 95, 80 }, { 92, 96, 80 } };
		for (int i = 0; i < javaScores.length; i++) {
			for (int j = 0; j < javaScores[i].length; j++) {
				System.out.println(javaScores[i][j]);
			}

		}
		
		//향상된 for문 : index 이용 x 순서대로 출력할 때
		for(int[] tempAry : javaScores) { // tempAry = 1{95, 80} , 2{92, 96, 80}
			for(int temp : tempAry) { // temp = {95, 80}, {92, 96, 80} 
				System.out.println(temp);
			}
		}

	}
}
