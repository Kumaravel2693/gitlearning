package org.icici;

public class SingleTon {

	static SingleTon a;

	private SingleTon() {
	}

	private static SingleTon getObject() {
		int before = System.identityHashCode(a);
		System.out.println(before);

		if (a == null) {
			a = new SingleTon();
		}
		return a;

	}

	private void kum() {
		System.out.println("Emp Details");

	}

	public static void main(String[] args) {
		SingleTon b = getObject();
		b.kum();

		SingleTon c = getObject();
		int after = System.identityHashCode(c);
		System.out.println(after);
		
		SingleTon d=getObject();
		int identityHashCode = System.identityHashCode(d);
		System.out.println(identityHashCode);

	}

}
