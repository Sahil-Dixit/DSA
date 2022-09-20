
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abba";
		int count = 0;
		int i = 0;
		int j = str.length() - 1;
		while (i < str.length() && j >= 0) {
			if (str.charAt(i) == str.charAt(j)) {
				count++;
			}
			i++;
			j--;
		}
		if (count == str.length()) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not palindrome");
		}
	}

}
