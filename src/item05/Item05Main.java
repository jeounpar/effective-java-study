package item05;

public class Item05Main {
	public static void main(String[] args) {
		Programmer javaProgrammer = new Programmer(new JavaLanguage());
		javaProgrammer.getInstance().Hello();

		Programmer pythonProgrammer = new Programmer(new PythonLanguage());
		pythonProgrammer.getInstance().Hello();
	}
}
