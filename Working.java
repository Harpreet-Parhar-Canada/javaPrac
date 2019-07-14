class Animal {
	private String name;
        private String sound;
	public void setName(String newName) {
		name = newName;
	}
	public String getName() {
		return name;
	}
}
class Dog extends Animal {
	}

class Cat extends Animal {
	public void digHole() {
		System.out.println("dog digging hole in the ground");
	}
	public Cat() {
		super();
		setName("Cat");
	}
}
class printing extends JavaProgram {
}
public class Working {
	public static void main(String[] args ) {
	Cat a= new Cat();
	a.getName();
	System.out.println(a.getName());
	printing p = new printing();
	p.message();
	}
}




