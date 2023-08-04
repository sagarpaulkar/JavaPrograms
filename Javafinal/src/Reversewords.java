
public class Reversewords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="We are leanring java";
		String result="";
		String [] arr=s.split(" ");
		
		for (int i=arr.length-1;i>=0;i--) {
			result =result+arr[i]+" ";
			
		}
				
				System.out.println(result);
	}

}
