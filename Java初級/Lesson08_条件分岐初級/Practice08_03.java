import java.util.Random;

class Practice08_03 {
  public static void main(String[] args) {
      Random rand = new Random();
      int age = rand.nextInt(21);
      int gender = rand.nextInt(2);

      if (age <= 3 && gender == 0) {
          System.out.println("あなたは babyな男 です");
      } else if (age <= 3 && gender == 1) {
          System.out.println("あなたは babyな女 です");
      } else if (age < 6 && gender == 0) {
          System.out.println("あなたは childな男 です");
      } else if (age < 6 && gender == 1) {
          System.out.println("あなたは childな女 です");
      } else if (age < 18 && gender == 0) {
          System.out.println("あなたは kidな男 です");
      } else if (age < 18 && gender == 1) {
          System.out.println("あなたは kidな女 です");
      } else if (18 <= age && gender == 0) {
          System.out.println("あなたは adultな男 です");
      } else if (18 <= age && gender == 1) {
          System.out.println("あなたは adultな女 です");
      }
  }
}