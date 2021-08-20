import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Ajith {

	public static void main(String[] args) 
	{
		Map <String,Integer> hm=new HashMap<String,Integer>();
		hm.put("zorro",4);
		hm.put("Kumar",53);
		hm.put("Krish",1);
		for(Map.Entry<String,Integer> a: hm.entrySet())
			System.out.println(a.getKey()+" "+a.getValue());
		Map <String,Integer> hmm=new TreeMap<String,Integer>(hm);
		System.out.println(" ");
		for(Entry<String, Integer> b: hmm.entrySet())
			System.out.println(b.getKey()+" "+b.getValue());
	}
}
