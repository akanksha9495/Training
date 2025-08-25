package sample;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;


public class HashMapExample {
public static void main(String[] args) {
	Map<String,Integer> data= new HashMap<String,Integer>();
	data.put("java", 123456);
	data.put("sutherland", 567890);
	data.put("java", 567342);
	data.put("charles", 123456);
	data.put("gavin", 123456);
	System.out.println(data);
	System.out.println(data.get("java"));
	Set<Map.Entry<String,Integer>> set= data.entrySet();
	Iterator<Map.Entry<String,Integer>> itr= set.iterator();
	while(itr.hasNext())
	System.out.println(itr.next());

}
}
