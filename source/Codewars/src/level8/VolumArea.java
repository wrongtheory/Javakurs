package level8;

public class VolumArea {
	
	 public static int[] getSize(int w,int h,int d) {
	        
		 
		 return new int []{d*w*2+d*h*2+w*h*2, w*h*d};
		 
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i: getSize(10, 10, 10))
			System.out.println(i);

	}

}
