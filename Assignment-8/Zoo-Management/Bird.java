abstract public class Bird extends Animal {

	public static final String BIRD = "Bird";

	public Bird(String name, int age, float Weigtht) {
		super(name, age, Weigtht);

	}

	@Override
	abstract public String makeSound();

	public String getCategory() {
		return BIRD;
	}

	@Override
	abstract public String getType();

}

class Peacock extends Bird {
	public static final String PEACOCK = "Peacock";

	public Peacock(String name, int age, float Weigtht) {
		super(name, age, Weigtht);
	}

	@Override
	public String makeSound() {
		return "chirr-up";
	}

	@Override
	public String getType() {
		return PEACOCK;
	}
}

class Sparrow extends Bird {

	public static final String SPARROW = "Sparrow";

	public Sparrow(String name, int age, float Weigtht) {
		super(name, age, Weigtht);
	}

	@Override
	public String makeSound() {
		return "chirr-up";
	}

	@Override
	public String getType() {
		return SPARROW;
	}

}
