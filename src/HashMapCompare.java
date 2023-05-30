import java.util.HashMap;
import java.util.Map;

public class HashMapCompare {
	
	public static boolean compareMaps(HashMap<?, ?> map1, HashMap<?, ?> map2) {
	    if (map1.size() != map2.size()) {
	        return false;
	    }

	    for (Map.Entry<?, ?> entry : map1.entrySet()) {
	        Object key = entry.getKey();
	        Object value = entry.getValue();

	        if (!map2.containsKey(key) || !map2.get(key).equals(value)) {
	            return false;
	        }
	    }

	    return true;
	}
	
	public static void main(String a[]) {
		HashMap<String, Integer> map1 = new HashMap<>();
		map1.put("A", 1);
		map1.put("B", 2);

		HashMap<String, Integer> map2 = new HashMap<>();
		map2.put("B", 2);
		map2.put("A", 3);
		map2.put("C", 4);


		if (compareMaps(map1, map2)) {
		    System.out.println("The maps are equal");
		} else {
		    System.out.println("The maps are not equal");
		}

	}


}
