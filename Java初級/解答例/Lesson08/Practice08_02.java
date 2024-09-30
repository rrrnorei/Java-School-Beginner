// 以下の 条件分岐文を作成してください
// 0 ~ 20 のランダムな 変数 age を宣言
// 変数 age の値が「3以下の場合」は「あなたは baby です」と表示させる
// 変数 age の値が「3より大きく、18未満の場合」は「あなたは kid です」と表示させる
// 変数 age の値が「18以上の場合」は「あなたは adult です」と表示させる

import java.util.Random;

class Practice08_02 {
    public static void main(String[] args) {
        int age = new Random().nextInt(21);

        System.out.println(age);

        if (age <= 3) {
            System.out.println("あなたは baby です");
        } else if (3 < age && age < 18) {
            System.out.println("あなたは kid です");
        } else if (18 <= age) {
            System.out.println("あなたは adult です");
        }
    }
}