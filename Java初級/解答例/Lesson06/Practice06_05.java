// 次の1～9に基づいて、プログラムを記述してください

// 変数aを宣言し、7+6の結果を代入
// 変数bを宣言し、15-4の結果を代入
// aとbの値を「実行結果」のように表示
// ++を用いて、aを1加算
// --を用いて、bを1減算
// aとbの値を「実行結果」のように表示
// %=を用いて、aを3で割った余りをaに代入
// *=を用いて、bに5をかけた値をbに代入
// aとbの値を「実行結果」のように表示
// 実行結果

// a = 13,b = 11
// a = 14,b = 10
// a = 2,b = 50

class Practice06_05 {
    public static void main(String[] args) {
        int a;
        a = 7 + 6;

        int b;
        b = 15 - 4;

        System.out.println("a = " + a + ",b = " + b);

        a++;
        b--;

        System.out.println("a = " + a + ",b = " + b);

        a %= 3;
        b *= 5;

        System.out.println("a = " + a + ",b = " + b);
    }
}