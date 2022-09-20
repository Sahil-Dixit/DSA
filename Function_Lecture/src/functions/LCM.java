package functions;

import java.util.*;

public class LCM {
	public static int lcm(int n, int m) {
		int lcm = n > m ? n : m;
		while (true) {
			if (lcm % n == 0 && lcm % m == 0) {
				return lcm;
			}
			lcm++;
		}
	}

	public static int gcd(int n, int m) {
		while (n % m != 0) {
			int rem = n % m;
			n = m;
			m = rem;
		}
		return m;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		System.out.println("LCM : " + lcm(n, m));
		System.out.println("HCF : " + gcd(n, m));

	}

}