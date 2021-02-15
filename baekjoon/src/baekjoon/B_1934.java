package baekjoon;
import java.util.Scanner;

public class B_1934 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int n = stdin.nextInt();
		int []array = new int[2*n];

		for(int i=0;i<2*n;i++)
			array[i] = stdin.nextInt();
		stdin.close();

		for(int i=0;i<2*n;i+=2) {
			int a = gcd(array[i], array[i+1]); // 최대공약수 저장
			System.out.println(array[i] * array[i+1] / a);
			}
		}
	public static int gcd(int x, int y) { // 유클리드 호제법 
		if(y == 0) 
			return x;
		else 
			return gcd(y, x % y);
	}
}
