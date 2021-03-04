package saif;
class PublicIn{
	private int show() {
		System.out.println("byy");
		return 10;
	}
}
class Ad extends PublicIn{
	void show1() {
		System.out.println("nhefwu");
	}
}

public class PrivateIn extends Ad{
	 int add() {
		System.out.println("hii");
		return 20;
	}
	 

	public static void main(String[] args) {
		PrivateIn p=new PrivateIn();
	p.add();

	}

}
