import java.io.*;
import java.util.*;

public class CrazyFencing {

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int fence = sc.nextInt();
		double area = 0;
		
		double[] height = new double [fence + 1];
		double[] base = new double [fence];
		
		for (int k = 0; k <= fence; k++) {
			height[k] = sc.nextDouble();
		}
		
		for (int j = 0; j < fence; j++) {
			base[j] = sc.nextDouble();
		}
		
		for (int i = 0; i < fence; i++) {
			area += base[i] * (height[i] + height[i + 1])/2;
		}
		
		System.out.println (area);
		
		sc.close(); // To close the scanner
	}

}
