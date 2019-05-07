package inheritance.button;

public class Main {
	public static void main(String[] args) {
		Button b = new Button();
		MyOn mo = new MyOn();
		b.setOnClickListener(mo);
	}
}
class MyOn extends OnClickListener {
	void onClick() {
		System.out.println("브라우저 띄우기");
	}
}