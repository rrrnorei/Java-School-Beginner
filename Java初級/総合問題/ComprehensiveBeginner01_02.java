import java.util.Random;

class ComprehensiveBeginner01_02 {
  public static void main(String[] args) {

    int[] nums = new int[10];    
    Random rand = new Random();
    int sum = 0;

    int count = 0;
    
    for (int i = 0; i < nums.length; i++) {
      
      int num = rand.nextInt(100) + 1;
      // count == nums.length を削りました
      if (sum > 100) {
        break;
      }
      
      sum += num;
      nums[count] += num; 
      count++;

    }
    System.out.println("合計値" + sum);
    System.out.println("入力された数値");
    for (int i = 0; i < count; i++) {
      System.out.println(nums[i]);
    }
  }
}