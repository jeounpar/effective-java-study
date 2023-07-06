package item11;

import java.util.HashMap;
import java.util.Map;

public class Item11Main {
	public static void main(String[] args) {
		Map<PhoneNumber, String> hashMap = new HashMap<>();
		hashMap.put(PhoneNumber.createPhoneNumber("010", "1234", "1234"), "Park");
		String value = hashMap.get(PhoneNumber.createPhoneNumber("010", "1234", "1234"));
		System.out.println("value = " + value);
	}
}
