package pack1;

public class Human {
	static String eyeColour="Brown";
	int weight=190;
	int height=6;
	String gender="F";
	String programmingLanguage="java";

	void speak() {
		String language="English";
		System.out.println("Humans can speak"+language);
	}
	void coding() {
		System.out.println("Syntax students can code"+programmingLanguage);
	}
	public static void main(String[] args) {
		Human obj=new Human();
		obj.eyeColour="pink";
		System.out.println(eyeColour);
		Human obj1=new Human();
		System.out.println(eyeColour);
	}
	
}
