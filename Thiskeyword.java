package basicprogram;

public class Thiskeyword {
	Thiskeyword(int a)
	{
		System.out.println("record  1");
	}
	Thiskeyword()
	{
		this(4);
		System.out.println("record 2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thiskeyword();

	}

}
