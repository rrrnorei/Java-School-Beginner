// 次の1～9に基づいて、プログラムを記述してください

// 変数 a = 3 を宣言
// a は 2でない かつ、3未満　の結果を 変数 c に代入する
// a、c の値を「実行結果」のように表示
// 変数 b = 5 を宣言
// b は 1 である または、5以上　の結果を 変数 d に代入する
// b、d の値を「実行結果」のように表示
// 実行結果

// a は 2でない かつ、3未満 の結果は false です
// b は 1である または、5以上 の結果は true です

class Practice06_04 {
    public static void main(String[] args) {
        int a = 3;
        boolean c = (a == 2 && a < 3);

        System.out.println("a は 2でない かつ、3未満 の結果は " + c + " です");

        int b = 5;
        boolean d = (b == 1 || b >= 5);

        System.out.println("b は 1である または、5以上 の結果は " + d + "です");
    }
}