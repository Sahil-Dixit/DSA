import java.util.Arrays;

public class ReverseWordWiseOptimized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "the sky is blue";
		String rev = "";
		int[] arr = new int[10];
		int count = 0;
		boolean flag = true;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ' && flag == true) {
				arr[count] = i;
				count++;
				flag = false;
			} else if (str.charAt(i) == ' ' && flag == false) {
				arr[count] = i;
				count++;
				flag = true;
			} else if (i == str.length() - 1 && str.charAt(i) != ' ') {
				arr[count] = i + 1;
				count++;
			}
		}
		if(count%2!=0) {
			arr[count]=str.length();
			count++;
			for (int i = 0; i < count - 1; i = i + 2) {
				rev = str.substring(arr[i], arr[i + 1]) + " " + rev;
			}
			
		}else {
			for (int i = 0; i < count - 1; i = i + 2) {
				rev = str.substring(arr[i], arr[i + 1]) + " " + rev;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(rev.substring(0, rev.length()));
		System.out.println(str.length());
	}

}
