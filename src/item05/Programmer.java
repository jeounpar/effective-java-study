package item05;

public class Programmer {
	private final Language language;

	public Programmer(Language language) {
		this.language = language;
	}

	public Language getInstance() {
		return language;
	}
}
