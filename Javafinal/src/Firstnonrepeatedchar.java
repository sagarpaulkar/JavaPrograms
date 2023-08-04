import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Firstnonrepeatedchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "swiss";
		
		Map <Character,Integer> map=new LinkedHashMap<Character,Integer>();
		int count=1;
		
		for (int i=0;i<=s.length()-1;i++) {
			if(!map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), count);
			}
			else {
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}
		}
		for(Entry<Character,Integer> entry: map.entrySet()) {
			
			if (entry.getValue()==1) {
				System.out.println("Non repeated character:"+entry.getKey());
				
			}
		}
	}

}
