import java.io.*;
import java.util.*;
import java.util.Scanner;

public class ModernArt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int rows, columns, brushes, gold = 0;
		
		rows = sc.nextInt();
		columns = sc.nextInt();
		
		int[][] art = new int[rows][columns];
		
		brushes = sc.nextInt();
		
		for (int i = 0; i < brushes; i++) {
			String brushD = sc.next();
			int brushNum = sc.nextInt();
			
			if (brushD.equals ("R")) {
				for (int k = 0; k < columns; k++) {
					if (art[brushNum - 1][k] == 0) {
						art[brushNum - 1][k] = 1;
						gold++;
					}
					else {
						art[brushNum - 1][k] = 0;
						gold--;
					}
				}
			}
			
			if (brushD.equals ("C")) {
				for (int j = 0; j < rows; j++) {
					if (art[j][brushNum - 1] == 0) {
						art[j][brushNum - 1] = 1;
						gold++;
					}
					else {
						art[j][brushNum - 1] = 0;
						gold--;
					}
				}
			}
		}
		
		System.out.println (gold);

		sc.close();

	}

}
