import java.util.Random;

class Practice08_01 {
  public static void main(String[] args) {
      Random rand = new Random();
      int gender = rand.nextInt(2);

      if (gender == 0) {
          System.out.println("あなたは 男 です");
      } else {
          System.out.println("あなたは 女 です");

      }
  }
}