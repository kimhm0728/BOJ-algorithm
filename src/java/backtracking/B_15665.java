package java.backtracking;

import java.util.*;
import java.io.*;

public class B_15665 {
	static StringBuilder sb = new StringBuilder();
	static LinkedHashSet<String> set = new LinkedHashSet<>();
	static int[] arr;
	static int N, M;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		arr = new int[M];

		int[] num = new int[N];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++)
			num[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(num);

		DFS(num, 0);
		Iterator<String> iter = set.iterator();
		while(iter.hasNext())
			sb.append(iter.next()).append('\n');
		System.out.println(sb);
	}

	static void DFS(int[] num, int depth) {
		if(depth == M) {
			for(int i : arr)
				sb.append(i).append(' ');
			set.add(sb.toString());
			sb.setLength(0);
			return;
		}

		for(int i=0;i<N;i++) {
			arr[depth] = num[i];
			DFS(num, depth + 1);
		}
	}

}