package Output_Of_Java_Programs;

public class demo148 extends Super1 {

	public static void main(String[] args) {
		Super1 sooper = new Super1();
		demo148 sub = new demo148();
		System.out.println(sooper.getLength().toString() + "," + sub.getLength().toString());

	}

	public Long getLength() {
		return new Long(5);
	}

}

class Super1 {
	public Integer getLength() {
		return new Integer(4);
	}
}
/*
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The return type is incompatible with Super1.getLength()*/