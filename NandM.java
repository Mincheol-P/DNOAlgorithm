package algorithm1;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class NandM {
	
	static int N, M;
	static int[] arr;
	static int[] arr2;
	static boolean[] bool;
	
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[N];
		arr2 = new int[N];
		bool = new boolean[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		Arrays.sort(arr);
		
		dfs(0, 0);
	}
	
	static void dfs(int startIdx, int depth) {
		
		if(depth == M) {
			for(int i=0; i<M; i++) {
				System.out.print(arr2[i]+" ");
			}
			System.out.println();
			return;
		}
		
		for(int i=0; i<N; i++) {
			if(!bool[i]) {
				bool[i] = true;
				arr2[depth] = arr[i];
				dfs(i + 1, depth + 1);
				bool[i] = false;
			}
		}		
	}
}