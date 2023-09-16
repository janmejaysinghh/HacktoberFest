package DSA;

public class scenario {

	static boolean isSubsequence(String a, String b) {

		int curr = 0;
		for (int i = 0; i < b.length(); i++) {
			if (b.charAt(i) == a.charAt(curr)) {
				curr++;
			}
			if (curr == a.length()) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		String a = "axc";
		String b = "ahbgdc";
		boolean result = isSubsequence(a, b);
		System.out.println(result);
	}
}
