import java.io.*;
import java.util.*;
import java.util.Scanner;

public class SumGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int day = 0, S = 0, S1 = 0, N;
		
		N = sc.nextInt();
		
		int[] K = new int [N];
		int[] K1 = new int [N];
		
		for (int i = 0; i < N; i++) {
			K[i] = sc.nextInt();
		}
		
		for (int i = 0; i < N; i++) {
			K1[i] = sc.nextInt();
		}
		
		for (int k = 0; k < N; k++) {
			S += K[k];
			S1 += K1[k];
			
			if (S == S1)
				day = k + 1;
		}
		
		System.out.print(day);
		
		sc.close();
	}

}
