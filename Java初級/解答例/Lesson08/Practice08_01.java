// 以下の 条件分岐文を作成してください
// 0 or 1 のランダムな 変数 gender を宣言
// 変数 gender の値が「0場合」は「あなたは 男 です」と表示させる
// 変数 gender の値が「1場合」は「あなたは 女 です」と表示させる

import java.util.Random;

class Practice08_01 {
    public static void main(String[] args) {
        int gender = new Random().nextInt(2);

        System.out.println(gender);

        if (gender == 0) {
            System.out.println("あなたは 男 です");
        } else {
            System.out.println("あなたは 女 です");
        }
    }
}