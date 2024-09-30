// 以下の 条件分岐文を作成してください
// 0 ~ 20 のランダムな 変数 age を宣言
// 0 or 1 のランダムな 変数 gender を宣言
// 以下の表に基づいてコーディングしてください
// 変数 age	変数 gender	表示させる文言
// 3以下	0	あなたは babyな男 です
// 3以下	1	あなたは babyな女 です
// 3より大きく、6未満	0	あなたは childな男 です
// 3より大きく、6未満	1	あなたは childな女 です
// 6以上、18未満	0	あなたは kidな男 です
// 6以上、18未満	1	あなたは kidな女 です
// 18以上	0	あなたは adultな男 です
// 18以上	1	あなたは adultな女 です

import java.util.Random;

class Practice08_03 {
    public static void main(String[] args) {
        int age = new Random().nextInt(21);
        int gender = new Random().nextInt(2);

        System.out.println("age = " + age);
        System.out.println("gender = " + gender);

        if (age <= 3 && gender == 0) {
            System.out.println("あなたは babyな男 です");
        } else if (age <= 3 && gender == 1) {
            System.out.println("あなたは babyな女 です");
        } else if (3 < age && age < 6 && gender == 0) {
            System.out.println("あなたは childな男 です");
        } else if (3 < age && age < 6 && gender == 1) {
            System.out.println("あなたは childな女 です");
        } else if (6 <= age && age < 18 && gender == 0) {
            System.out.println("あなたは childな男 です");
        } else if (6 <= age && age < 18 && gender == 1) {
            System.out.println("あなたは childな女 です");
        } else if (18 <= age && gender == 0) {
            System.out.println("あなたは adlutな男 です");
        } else if (18 <= age && gender == 1) {
            System.out.println("あなたは adlutな女 です");
        }            
    }
}