  class ComprehensiveBeginner01_04 {
    public static void main(String[] args) {

        System.out.print("何段>");
        int num = new java.util.Scanner(System.in).nextInt();
        // 2. 終了させるための処理を書く
        if(num < 1 || num > 5) {
          System.out.println("1 ~ 5 までの整数を入力してください");
        } else { // 3. の処理を書く
          for(int i = 1; i <= num; i++) {
            for(int space = 5; space > i; space--) {
              System.out.print(" ");
            }
            for(int mark = 1; mark <= i; mark++) {
              System.out.print("*");
            }
            System.out.println("");
          }
        }

    }
}
