package section11.middle;

public class AnimalMain {

  public static void main(String[] args) {
    AnimalShelter shelter = new AnimalShelter();
    shelter.addAnimal(new Dog());
    shelter.addAnimal(new Dog());
    shelter.addAnimal(new Cat());
    shelter.addAnimal(new Dog());
    shelter.addAnimal(new Cat());
    shelter.addAnimal(new Cat());
    shelter.addAnimal(new Cat());
    shelter.addAnimal(new Dog());
    shelter.addAnimal(new Dog());
    shelter.addAnimal(new Cat());

    System.out.println("### 등록된 동물 종류 ###");
    shelter.viewAnimals();
  }
}
