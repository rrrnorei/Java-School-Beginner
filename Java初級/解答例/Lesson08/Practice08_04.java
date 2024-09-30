// 以下の 条件分岐文を作成してください
// 1 ~ 5 のランダムな 変数 color を宣言
// 変数 color の値が「1 の場合」は「今日のラッキーカラーは ピンク です」と表示させる
// 変数 color の値が「2 or 3 or 4 の場合」は「今日のラッキーカラーは レッド です」と表示させる
// 変数 color の値が「5 の場合」は「今日のラッキーカラーは ゴールド です」と表示させる

import java.util.Random;

class Practice08_04 {
    public static void main(String[] args) {
        int color = new Random().nextInt(5) + 1;

        System.out.println("color = " + color);

        if (color == 1) {
            System.out.println("今日のラッキーカラーは ピンク です");
        } else if (color == 2 || color == 3 || color ==4) {
            System.out.println("今日のラッキーカラーは レッド です");
        } else {
            System.out.println("今日のラッキーカラーは ゴールド です");
        }
    }
}