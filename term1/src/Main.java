import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		int N = scan.nextInt();

		int[] nn = new int[N];
		
		for(int i = 0; i < N; i++) {
			int j =random.nextInt(10000000);
			nn[i] = j;
		}
		int a = scan.nextInt();
		int b = scan.nextInt();
		int min = nn[a - 1];
		for(int d = a - 1; d < b; d++) {
			if(min > nn[d]) {
				min = nn[d];
			}
		}
		System.out.println("최소값 : " + min);
		int max = nn[a-1];
		for(int d = a - 1; d < b; d++) {
			if(max < nn[d]) {
				max = nn[d];
			}
		}
		System.out.println("최대값 : " + max);
		int sum = 0;
		for(int d = a - 1; d < b; d++) {
			sum = sum + nn[d];
		}
		System.out.println("합계 : " +sum);
	}

}
