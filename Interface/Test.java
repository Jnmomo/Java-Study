public class Test {
	public static void main(String[] args) {
		Mom m = new Mom();
		m.speak();
		m.announce("Eat your veggies.");
		System.out.println("**********");

		Dad d = new Dad();
		d.speak();
		d.announce("Ask your mom.");
		System.out.println("**********");

		Cat c = new Cat();
		c.speak();
		c.announce("Human, you need to feed me now.");
		System.out.println("**********");

		Speaker s1;
		s1 = m;
		s1.speak();
		s1.announce("Mom is a speaker.");
		System.out.println("**********");

		Speaker s2;
		s2 = d;
		s2.speak();
		s2.announce("Dad is a speaker.");
		System.out.println("**********");

		s2 = new Cat();
		s2.speak();
		s2.announce("Cat is also a speaker.");

	}
}