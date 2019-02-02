abstract public class Mammal extends Animal {

	public static final String MAMMAL = "Mammal";

	public Mammal(String name, int age, float Weigtht) {
		super(name, age, Weigtht);
	}

	@Override
	abstract public String makeSound();

	public String getCategory() {
		return MAMMAL;
	}

	@Override
	abstract public String getType();
}

class Tiger extends Mammal {

	public static final String TIGER = "Tiger";

	public Tiger(String name, int age, float Weigtht) {
		super(name, age, Weigtht);
	}

	@Override
	public String makeSound() {
		return "Roar";
	}

	@Override
	public String getType() {
		return TIGER;
	}

}

class Dog extends Mammal {

	public static final String DOG = "Dog";

	public Dog(String name, int age, float Weigtht) {
		super(name, age, Weigtht);
	}

	@Override
	public String makeSound() {
		return "Woof";
	}

	@Override
	public String getType() {
		return DOG;
	}

}
