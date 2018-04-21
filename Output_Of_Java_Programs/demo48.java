package Output_Of_Java_Programs;

import java.util.HashMap;
import java.util.Map;

public class demo48 {

	public static void main(String[] args) {
		Map<String, String> hashMap = new HashMap<String, String>();
        hashMap.put(new String("a"), "audi");
        hashMap.put(new String("a"), "ferrari");
        System.out.println(hashMap);

	}

}
//{a=ferrari}