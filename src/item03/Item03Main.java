package item03;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Item03Main {
	public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
		Constructor<?> constructor = SingletonTest.class.getDeclaredConstructors()[0];
		constructor.setAccessible(true);
		SingletonTest singletonTest = (SingletonTest) constructor.newInstance();
	}
}
