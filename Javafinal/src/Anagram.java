import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Army";
		String s2="Mary";
		
		char [] arr1=s1.toLowerCase().toCharArray();
		char [] arr2=s1.toLowerCase().toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2)) {
			
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
	}

}
