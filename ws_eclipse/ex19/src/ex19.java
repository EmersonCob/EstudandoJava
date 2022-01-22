import java.util.Scanner;

public class ex19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X, in, out;
		in = 0;
		out = 0;
		
		for (int i=0; i<N; i++) {
			X = sc.nextInt();
			if (X >= 10 && X <= 20) {
				in += 1;
			} else {
				out +=1;
			}
		}
		System.out.println(in + " in");
		System.out.println(out + " out");

	}

}
