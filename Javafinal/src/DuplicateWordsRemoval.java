import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateWordsRemoval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input="I am Sagar Sagar";
		
		String [] arr=input.split(" ");
		
		Set <String> s= new LinkedHashSet<String>();
		
		for(String x:arr) {
			
			s.add(x);
		
		}
		
		Iterator itr=s.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
		}
	
	}

}
