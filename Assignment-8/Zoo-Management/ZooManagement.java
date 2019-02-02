import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ZooManagement {
	private static Scanner sc = new Scanner(System.in);
	private static int choice;
	private static List<Zone> zoneList = new ArrayList<Zone>();

	public static void main(String args[]) {
		createZone();

		do {
			System.out.println("1 Add Zone");
			System.out.println("2 Add Animal");
			System.out.println("3 Remove Animal");
			System.out.println("4 Display Details Zone Wise");
			System.out.println("9 Exit!!! ");
			choice = getValidInteger();
			switch (choice) {

			case 1:
				createZone();
				break;
			case 2:
				addAnimal();
				break;
			case 3:
				if (deleteAnimal())
					System.out.println("Animal Deleted Suceccfully!!!");
				break;
			case 4:
				for (Zone z : zoneList)
					z.display();
				break;
			case 9:
				choice = 9;
				break;
			default:
				System.out.println("Enter a Valid choice");

			}
		} while (choice != 9);
	}

	public static boolean addAnimal() {
		String animalName;
		int animalAge;
		float animalWeight;
		Animal newAnimal = null;

		System.out.println("1. Dog");
		System.out.println("2. Tiger");
		System.out.println("3. Snake");
		System.out.println("4. Turtle");
		System.out.println("5. Peacock");
		System.out.println("6. Sparrow");

		do {
			System.out.println("Enter choice : ");
			choice = getValidInteger();
			sc.nextLine();
			System.out.println("Enter Animal Name :");
			animalName = sc.nextLine();
			System.out.println("Enter Animal Age :");
			animalAge = getValidInteger();
			System.out.println("Enter Animal weight :");
			animalWeight = getValidFloat();

			switch (choice) {
			case 1:
				newAnimal = new Dog(animalName, animalAge, animalWeight);
				break;
			case 2:
				newAnimal = new Tiger(animalName, animalAge, animalWeight);
				break;
			case 3:
				newAnimal = new Snake(animalName, animalAge, animalWeight);
				break;
			case 4:
				newAnimal = new Turtle(animalName, animalAge, animalWeight);
				break;
			case 5:
				newAnimal = new Peacock(animalName, animalAge, animalWeight);
				break;
			case 6:
				newAnimal = new Sparrow(animalName, animalAge, animalWeight);
				break;
			default:
				System.out.println("Enter Correct choices : ");
			}
		} while (choice != 1 && choice != 2 && choice != 3 && choice != 4);

		if (addAnimalOfType(newAnimal))
			return true;
		return false;
	}

	public static boolean deleteAnimal() {
		System.out.println("List Of animals is:");
		boolean boolValue = false;
		boolean result = false;
		Zone zone = null;
		Cage cage = null;
		for (Zone var : zoneList) {
			for (Cage varForCage : var.getCageList()) {
				for (Animal varForAnimal : varForCage.getAnimalList()) {
					System.out.println(varForAnimal.getAnimalId() + " "
							+ varForAnimal.getAnimalname());
					System.out.println("want to delete ?(true/false)");
					boolValue = getValidBoolen();
					if (boolValue) {
						varForCage.getAnimalList().remove(varForAnimal);
						zone = var;
						cage = varForCage;
						result = true;
						break;
					}
					if (boolValue)
						break;
				}
				if (boolValue)
					break;
			}
			if (boolValue)
				break;
		}
		if (boolValue && cage.getAnimalList().size() == 0) {
			zone.getCageList().remove(cage);
			result = true;
		}
		return result;
	}

	public static boolean addAnimalOfType(Animal newAnimal) {

		boolean zoneExist = false;
		for (Zone var : zoneList) {
			if (var.getCategory() == newAnimal.getCategory()) {
				zoneExist = true;
				break;
			}
		}
		if (!zoneExist) {
			System.out.println("There is no zone Available for:"
					+ newAnimal.getCategory());
			System.out.println("Please create a zone first");
			return false;
		}
		for (Zone var : zoneList) {
			if (var.getCategory() == newAnimal.getCategory()) {
				if (var.addAnimalToCage(newAnimal)) {
					System.out.println("Animal Allocated a Cage");
					return true;
				}
			}
		}
		System.out.println("Sorry!!! Animal not allocated a cage");
		return false;
	}

	public static boolean createZone() {
		String category = null;
		System.out.println("Create a Zone for :");
		System.out.println("1 Mammal");
		System.out.println("2 Reptile");
		System.out.println("3 Bird");

		do {
			choice = getValidInteger();
			switch (choice) {
			case 1:
				category = Mammal.MAMMAL;
				break;
			case 2:
				category = Reptile.REPTILE;
				break;
			case 3:
				category = Bird.BIRD;
				break;
			default:
				System.out.println("Enter Correct choices : ");
			}
		} while (choice != 1 && choice != 2 && choice != 3);

		return createZoneFor(category);

	}

	public static boolean createZoneFor(String category) {

		boolean hasPark;
		boolean hasCanteen;
		int maxCages;
		String name;
		try {
			System.out.println("Zone Name : ");
			sc.nextLine();
			name = sc.nextLine();
			System.out.println("Zone has Park? (true/false) ");
			hasPark = getValidBoolen();
			System.out.println("Zone has Canteen? (true/false) ");
			hasCanteen = getValidBoolen();
			System.out.println("Maximum No of cages : ");
			maxCages = getValidInteger();
			Zone instanceOfZone = new Zone(name, hasPark, hasCanteen, maxCages, category);
			zoneList.add(instanceOfZone);

			return true;
		} catch (Exception E) {
			return false;
		}
	}

	/**
	 * @return :an integer passed by user with exception handling
	 */
	public static boolean getValidBoolen() {
		boolean value = false;
		boolean continueInput = true;
		do {
			try {
				value = sc.nextBoolean();
				continueInput = false;
			} catch (InputMismatchException ex) {
				System.out
						.println("Try again. Incorrect input: an boolen (true/false) is required)");
				sc.nextLine();
			}
		} while (continueInput);
		return value;
	}

	/**
	 * @return :an integer passed by user with exception handling
	 */
	public static int getValidInteger() {
		int value = 0;
		boolean continueInput = true;
		do {
			try {
				value = sc.nextInt();
				continueInput = false;
			} catch (InputMismatchException ex) {
				System.out.println("Try again. ("
						+ "Incorrect input: an integer is required)");
				sc.nextLine();
			}
		} while (continueInput);
		return value;
	}

	/**
	 * @return :an integer passed by user with exception handling
	 */
	public static float getValidFloat() {
		Float value = null;
		boolean continueInput = true;
		do {
			try {
				value = sc.nextFloat();
				continueInput = false;
			} catch (InputMismatchException ex) {
				System.out
						.println("Try again!!! Incorrect input: a Float is required)");
				sc.nextLine();
			}
		} while (continueInput);
		return value;
	}
}

