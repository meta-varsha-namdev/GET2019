
abstract public class Reptile extends Animal {

	public static final String REPTILE = "Reptile";

	public Reptile(String name, int age, float Weigtht) {
		super(name, age, Weigtht);
	}

	@Override
	abstract public String makeSound();

	@Override
	public String getCategory() {
		return REPTILE;
	}

	@Override
	abstract public String getType();

}

class Snake extends Reptile {

	public static final String SNAKE = "Snake";

	public Snake(String name, int age, float Weigtht) {
		super(name, age, Weigtht);
	}

	@Override
	public String makeSound() {
		return "hissss";
	}

	@Override
	public String getType() {
		return SNAKE;
	}
}

class Turtle extends Reptile {

	public static final String TURTLE = "Turtle";

	public Turtle(String name, int age, float Weigtht) {
		super(name, age, Weigtht);
	}

	@Override
	public String makeSound() {
		return "hissss";
	}

	@Override
	public String getType() {
		return TURTLE;
	}

}