
package Practise;

import java.util.HashMap ;
import java.util.Map;
import java.util.Set;



public class HashMapEx {
	public static void main(String[] args){
		Map<String, String> m= new HashMap<> ();
		m.put("url", "www.gmail.com");
		m.put("username", "gmail");
		m.put("password", "www.gmail.com");
		Set<String> s=m.keySet();
		for(String key: s){
			System.out.println(key+"=="+m.get(key));
		}
	}

}
