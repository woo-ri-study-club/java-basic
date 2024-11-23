package section11.advenced;

public abstract class Shape {

  protected abstract double calculateAreas();

  public void displayArea() {
    System.out.printf("넓이(소수점 둘째 자리): %.2f\n", calculateAreas());
  }
}
