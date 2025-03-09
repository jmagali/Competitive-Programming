import java.io.*;
import java.util.*;
import java.util.Scanner;

public class NailedIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		HashMap< Integer, Integer > map = new HashMap < Integer, Integer >();
		
		int fences = sc.nextInt(), max = 0, d = 0;
		
		int[] heights = new int [fences];
		
		for (int j = 0; j < fences; j++) {
			heights[j] = sc.nextInt();
		}
		
		for (int i = 0; i < fences; i++) {
			for (int k = 0; k < fences; k++) {
				int sum = heights[i] + heights[k];
				if (map.containsKey(sum)) {
					map.put(sum, map.get(sum) + 1);
				}
				else {
					map.put(sum, 1);
				}
				
				if (map.get(sum) + 1 >= max)
					max = map.get(sum) + 1 ;
				}
			}
		
		for (int i : map.keySet()) {
			if (map.get(i) >= d)
				d = map.get(i);
		}
		
		System.out.print (max / 2);
		System.out.print (" " + d);

		
		sc.close(); // To close the scanner
	}

}
