package section11.middle;

import java.util.ArrayList;
import java.util.List;

public class AnimalShelter {

  private List<Animal> animals = new ArrayList<>();

  public void addAnimal(Animal animal) {
    animals.add(animal);
  }

  public void viewAnimals() {
    for (Animal animal : animals) {
      if (animal instanceof Dog) {
        System.out.println("개입니다.");
      } else if (animal instanceof Cat) {
        System.out.println("고양이입니다.");
      } else {
        System.out.println("그외 동물입니다.");
      }
    }
  }

}
