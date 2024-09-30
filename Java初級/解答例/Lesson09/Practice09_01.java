// 以下の表示結果が表示されるよう、if 文、for 文を使用してコーディングしてください。
// 2
// 4
// 6
// 10
// 20

class Practice09_01 {
    public static void main(String[] args) {
        for (int i = 1; i < 21; i++) {
            if (i % 2 == 0) {
                if (i == 2 || i == 4 || i == 6 || i == 10 || i == 20) {
                    System.out.println(i);
                }
            }
        }
    }
}