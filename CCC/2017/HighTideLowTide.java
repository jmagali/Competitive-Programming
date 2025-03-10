import java.io.*;
import java.util.*;
import java.util.Scanner;

public class HighTideLowTide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int measurements = sc.nextInt();
		
		int[] records = new int [measurements];
		
		for (int i = 0; i < measurements; i++) {
			records[i] = sc.nextInt();
		}
		
		Arrays.sort(records);
		
		for (int i = 0; i < measurements / 2; i++) {
			System.out.print ((int) records[Math.ceilDiv(records.length, 2) - 1 - i] + " ");
			System.out.print ((int) records[Math.ceilDiv(records.length, 2) + i] + " ");
		}
		
		if (measurements % 2 != 0)
			System.out.print (records[0]);
		
		sc.close();
	}

}
