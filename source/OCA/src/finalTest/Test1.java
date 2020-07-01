package finalTest;

public class Test1 {

	public static void main(String[] args) throws Error {
		// TODO Auto-generated method stub
		
		int[] crossword [] = new int[10][20];
		for(int i = 0; i < crossword.length; i++) {
			for(int j = 0; j < crossword.length; j++) {
				//crossword[i][j] = 'x';
				System.out.print(crossword[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(crossword.length);
		
		//throw new Error();

	}

}
