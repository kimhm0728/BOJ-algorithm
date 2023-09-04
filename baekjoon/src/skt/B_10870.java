package skt;

import java.io.*;

public class B_10870 {
	static int[] dp;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
	
		dp = new int[n + 1];
		System.out.println(fibo(n));
	}
	
	static int fibo(int i) {
		if (i == 0) return 0;
		if (i == 1) return 1;
		if (dp[i] != 0) return dp[i];
		
		return dp[i] = fibo(i - 1) + fibo(i - 2);
	}

}
