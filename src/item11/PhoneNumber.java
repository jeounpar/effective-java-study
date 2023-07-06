package item11;

import java.util.Objects;

public class PhoneNumber {
	private String a;
	private String b;
	private String c;

	private PhoneNumber() {
	}

	public static PhoneNumber createPhoneNumber(String a, String b, String c) {
		PhoneNumber phoneNumber = new PhoneNumber();
		phoneNumber.a = a;
		phoneNumber.b = b;
		phoneNumber.c = c;
		return phoneNumber;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		PhoneNumber that = (PhoneNumber) o;
		if (!a.equals(that.a)) return false;
		if (!b.equals(that.b)) return false;
		return c.equals(that.c);
	}

	@Override
	public int hashCode() {
		int result = a.hashCode();
		result = 31 * result + b.hashCode();
		result = 31 * result + c.hashCode();
		return result;
	}
}
