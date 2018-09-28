package fibonacci;

import java.util.Scanner;

public class fibonacci {
	public static int fiboo(int n) {

		if (n == 0)
			return 0;
		if (n == 1)
			return 1;

		return fiboo(n - 1) + fiboo(n - 2);
	}

	public static void main(String[] args) {
		int i = 0;
		String fibo = " ";
		Scanner a = new Scanner(System.in);
		System.out.println("kacýncý elemana kadar gösterilsin ?");
		fibo = a.nextLine();
		i = Integer.parseInt(fibo);

		for (int t = 0; t <= i; t++) {
			System.out.print(fiboo(t) + "\t");
		}
	}
}
