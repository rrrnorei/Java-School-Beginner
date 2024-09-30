// 以下の 演算式を作成、表示してください
// 変数 a = 2, b = 4, c = 7 をそれぞれ 1回以上使用し、答えが 「14」となるような演算式を作成する
// 上記の答えを実行時に表示させる

class Practice06_01 {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int c = 7;

        int result = a + b + c + (b / b);

        System.out.println(result);
    }
}