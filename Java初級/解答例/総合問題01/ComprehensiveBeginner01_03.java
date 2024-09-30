// 以下の 条件分岐文を作成してください
// 1 ~ 3 のランダムな 変数 man, woman, child を宣言
// 3つの変数には以下の性質があります
// 3 は 2 に強く、2 は 1 に強く、1 は 3 に強い
// 強い値がでた変数名を「変数名 が勝ちました」と表示させる
// 強い値が複数出た場合「変数名A と 変数名B が勝ちました」と表示させる
// 全ての変数が同じ値の場合、「あいこです」と表示させる
// 全ての変数が違う値の場合、「あいこです」と表示させる

import java.util.Random;

class ComprehensiveBeginner01_03 {
    public static void main(String[] args) {
        int man = new Random().nextInt(3) + 1;
        int woman = new Random().nextInt(3) + 1;
        int child = new Random().nextInt(3) + 1;

        System.out.println("man = " + man);
        System.out.println("woman = " + woman);
        System.out.println("child = " + child);

        if ((man == woman && man == child) || (man != woman && woman != child && man != child)) {
            System.out.println("あいこです");
        } else if (man == 3) {
            if (woman == 3) {
                if (child == 1) {
                    System.out.println("child が勝ちました");
                } else {
                    System.out.println("man と woman が勝ちました");
                }
            } else if (woman == 2) {
                if (child == 2) {
                    System.out.println("man が勝ちました");
                } else {
                    System.out.println("man と child が勝ちました");
                }
            } else {
                if (child == 3) {
                    System.out.println("woman が勝ちました");
                } else {
                    System.out.println("woman と child が勝ちました");
                }
            }
        } else if (man == 2) {
            if (woman == 3) {
                if (child == 2) {
                    System.out.println("woman が勝ちました");
                } else {
                    System.out.println("woman と child が勝ちました");
                }
            } else if (woman == 2) {
                if (child == 3) {
                    System.out.println("child が勝ちました");
                } else {
                    System.out.println("man と woman が勝ちました");
                }
            } else {
                if (child == 1) {
                    System.out.println("man が勝ちました");
                } else {
                    System.out.println("man と child が勝ちました");
                }
            }
        } else if (man == 1) {
            if (woman == 3) {
                if (child == 3) {
                    System.out.println("man が勝ちました");
                } else {
                    System.out.println("man と child が勝ちました");
                }
            } else if (woman == 2) {
                if (child == 1) {
                    System.out.println("woman が勝ちました");
                } else {
                    System.out.println("woman と child が勝ちました");
                }
            } else {
                if (child == 2) {
                    System.out.println("child が勝ちました");
                } else {
                    System.out.println("man と woman が勝ちました");
                }
            }
        }
    }
}
