package src.main;

public class Main2 {
  public static void main(String args[]) {
    int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
    for (int i = 0; i < numbers.length; i++) {
      System.out.println("------ Multiplos de " + numbers[i] + " ------");
      for (int j = 1; j < 11; j++) {
        System.out.println(numbers[i] + " x " + j + " = " + (numbers[i] * j));
      }
    }
  }
}