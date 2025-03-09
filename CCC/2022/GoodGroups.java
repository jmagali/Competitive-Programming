import java.io.*;
import java.util.*;
import java.util.Scanner;

public class GoodGroups {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int violations = 0, X, Y, G;
		
		X = sc.nextInt();
		
		HashMap< String, Integer > map = new HashMap< String, Integer >();
		
		String[][] x = new String [X][2];
				
		for (int i = 0; i < X; i++) {
			for (int k = 0; k < 2; k++) {
				x[i][k] = sc.next();
			}
		}
		
		Y = sc.nextInt();
		
		String[][] y = new String [Y][2];
		
		for (int i = 0; i < Y; i++) {
			for (int k = 0; k < 2; k++) {
				y[i][k] = sc.next();
			}
		}
		
		G = sc.nextInt();
		
		for (int i = 0; i < G; i++) {
			for (int k = 0; k < 3; k++) {
				map.put(sc.next(), i);
			}
		}
		
		for (int l = 0; l < X; l++) {
			if (map.get(x[l][0]) != map.get (x[l][1])) {
				violations++;
			}
		}
		
		for (int l = 0; l < Y; l++) {
			if (map.get(y[l][0]) == map.get (y[l][1])) {
				violations++;
			}
		}
		
		System.out.println (map);
		
		System.out.println (violations);
		
		sc.close();

	}

}
