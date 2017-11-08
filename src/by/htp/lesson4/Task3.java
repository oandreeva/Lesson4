package by.htp.lesson4;

public class Task3 {
	public static void main(String args[]) {
		  int[] a = {-1, -7, -10, 15, 2, 3, 4, 19, -22, 44, 32, 25, 11, 10, 15, 18, 18, -18, 18, 19};
	        int[] b = new int[a.length];
	        int j = 0;
	        for (int i = 0; i < a.length; i++) {
	            if (i % 2 == 0) { 
	                int x = a[i]; 
	                if (x > 0) { 
	                    b[j] = x; 
	                    j++; 
	                }
	            }
	        }

	        int sum = 0;
	        for (int i = 0; i < b.length; i++) {
	            sum =  sum + (int) Math.pow(b[i], 2); 
	        }

	        System.out.printf("sum = " + sum);

	}
}

