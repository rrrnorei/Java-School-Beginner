// 以下の 1次元配列を作成、表示してください

// ["リンゴ"], ["バナナ"], ["メロン"], ["マスカット"]のデータを含む文字列配列 arr_01 を宣言
// 宣言した arr_01 の全ての値を実行時に表示させるようにする
// 以下の 1次元配列を作成、表示してください

// [10], [20], [100], [3]のデータを含む整数配列 arr_02 を宣言
// 宣言した arr_02 の全ての値を実行時に表示させるようにする
// 以下の 2次元配列を作成、表示してください

// 1要素目{["ポチ"], ["ジョン"]}
// 2要素目{["タマ"], ["もちまる"]}
// 3要素目{["ペンペン"], ["ペンギン丸"]} のデータを含む文字列配列 arr_03 を宣言
// 宣言した arr_03 の全ての値を実行時に表示させるようにする

class Practice05_01 {
    public static void main(String[] args) {
        String[] arr_01 = {"リンゴ", "バナナ", "メロン", "マスカット"};
        
        System.out.println(arr_01[0]);
        System.out.println(arr_01[1]);
        System.out.println(arr_01[2]);
        System.out.println(arr_01[3]);

        int[] arr_02 = {10, 20, 100, 3};

        System.out.println(arr_02[0]);
        System.out.println(arr_02[1]);
        System.out.println(arr_02[2]);
        System.out.println(arr_02[3]);
        
        String[][] arr_03 = {{"ポチ", "ジョン"}, {"タマ", "もちまる"}, {"ペンペン", "ペンギン丸"}};

        System.out.println(arr_03[0][0]);
        System.out.println(arr_03[0][1]);
        System.out.println(arr_03[1][0]);
        System.out.println(arr_03[1][1]);
        System.out.println(arr_03[2][0]);
        System.out.println(arr_03[2][1]);
    }
}