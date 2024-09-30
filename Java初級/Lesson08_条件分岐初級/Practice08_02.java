import java.util.Random;

class Practice08_02 {
  public static void main(String[] args) {
      Random rand = new Random();
      int age = rand.nextInt(21);

      if (age <= 3) {
          System.out.println("あなたは baby です");
      } else if (age < 18) {
          System.out.println("あなたは kid です");
      } else {
          System.out.println("あなたは adult です");
      }
  }
}