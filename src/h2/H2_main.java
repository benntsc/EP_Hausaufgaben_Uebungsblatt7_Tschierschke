package h2;

import java.util.Arrays;

public class H2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int[] change(int[] a, int[] b, int start, int end) {
		if (end > start) {
			if (Arrays.compare(a, b) != 0) {
				return Arrays.copyOfRange(a, 0, a.length);
			} else {
				Arrays.sort(a);
				return Arrays.copyOfRange(a, start, end);
			}
		} else {
			return new int[0];
		}
	}

}
