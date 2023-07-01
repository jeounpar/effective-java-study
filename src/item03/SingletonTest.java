package item03;

public class SingletonTest {
	private static SingletonTest instance = new SingletonTest();

	private SingletonTest() {
		// 두번째 인스턴스 생성시 예외 던지기
		if (instance != null)
			throw new AssertionError();
		System.out.println("SingletonTest Instance Generated");
	}
	public SingletonTest getInstance() {
		if (instance == null) {
			instance = new SingletonTest();
		}
		return instance;
	}
}
