
public class primeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=7;
		int count= 0;
		for(int i=2;i<=num-1;i++) {
			
			if(num%i==0) {
			count =count+1;
			}
		}
		
		if (count==0) {
			System.out.println("prime"+num);
		}
		else {
			System.out.println("not prime");
		}
	}

}
