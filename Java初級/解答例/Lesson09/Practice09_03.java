// 以下の処理が 10 回繰り返されるような for 文をコーディングしてください。
// 1 ~ 6 のランダムな 変数 num を宣言
// num が「奇数」だった場合、「X 回目、num が出ました」と表示させる
// ※ X : カウンタ変数を利用して繰り返し回数を表示させる
// ※ num : 変数 num の値を表示させる

import java.util.Random;

public class Practice09_03 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int num = new Random().nextInt(6) + 1;
            System.out.println("num = " + num);
            if (num % 2 == 1) {
                System.out.println(i + " 回目、 " + num + " が出ました");
            }
        }
    }

}

