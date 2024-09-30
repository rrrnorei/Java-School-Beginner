// 以下の2次元配列の値が全て表示されるよう、for 文を使用してコーディングしてください。
// int arr[][] = {{0, 1, 2}, {3, 4, 5}};

public class Practice09_02 {
    public static void main(String[] args) {
        int arr[][] = { { 0, 1, 2 }, { 3, 4, 5 } };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
