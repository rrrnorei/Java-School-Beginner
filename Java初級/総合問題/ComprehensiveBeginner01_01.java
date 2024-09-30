import java.util.Scanner;

class ComprehensiveBeginner01_01 {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int[] arr = new int [3];
    System.out.println("整数1を入力してください");
    arr[0] = sc.nextInt();
    System.out.println("整数50を入力してください");
    arr[1] = sc.nextInt();
    System.out.println("整数10を入力してください");
    arr[2] = sc.nextInt();

    sc.close();

    for (int i = 0; i < 3; i++){
    System.out.println((i + 1) + "番目の要素の値は" + arr[i] + "で、2倍すると" + arr[i] * 2 + "になり、3で割ったあまりは" + arr[i] % 3 +"です");
    }      
  }
}
