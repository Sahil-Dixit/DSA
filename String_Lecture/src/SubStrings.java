
public class SubStrings {

	public static boolean isPalindrome(String str) {
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
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		String str = "nitin";
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
//				System.out.println(str.substring(i, j));
				if (isPalindrome(str.substring(i, j))) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
