package tag3;

public class CA113 {
	public static void main(String[] args) {
		byte zahl = 4;
		switch (zahl) {
		case 1:
			break;
		}
		
		  String[][][] arr = {
			      { {}, null },
			      { { "1", "2" }, { "1", null, "3" } },
			      {},
			      { { "1", null } }
			    };
			    System.out.println(arr.length + arr[1][2].length);
	}
}