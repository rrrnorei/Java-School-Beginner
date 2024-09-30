// メインメソッドを書き、
// 下記をソースコードとして、コーディングしてください。

// 整数型、小数型の変数を宣言

// byte の1桁の任意の整数 var_01 を宣言
// long の10桁の任意の整数 var_02 を宣言
// float の小数第2位までの小数 var_03 を宣言
// double の小数第7位までの小数 var_04 を宣言
// 宣言した var_01 ~ var_04 の値を実行時に表示させるようにする
// ブール型の表示

// int の値 1 の整数 var_05 を宣言
// int の任意の整数 var_06 を宣言
// boolean の var_bool を宣言
// var_05, var_05 を使用し、 var_bool が true を代入させる
// var_bool の値を実行時に表示させるようにする

class Practice04_01 {
    public static void main(String[] args) {
        byte var_01 = 8;
        long var_02 = 1000000000;
        float var_03 = 44.25f;
        double var_04 = 44.1234567;

        System.out.println(var_01);
        System.out.println(var_02);
        System.out.println(var_03);
        System.out.println(var_04);

        int var_05 = 1;
        int var_06 = 6;
        boolean var_bool;
        
        var_bool = (var_05 < var_06);

        System.out.println(var_bool);
    }
}