// 下記の例文を参考に、2重for 文を利用して以下の結果となるようなプログラムを完成させてください
// ※ 2重for文　例
//   for (式) {
//       for (式) {

//       }
//   }
// コンソール(ターミナル)に 1 ~ 5 までの整数を入力し、[Enter]
// 1 ~ 5 以外の数値が入力された場合、もう一度「何段>」からやり直す
// 入力された値の高さの階段を描画（表示）する
// class Practice08_05 {
//     public static void main(String[] args) {

//         // 2. のやり直すための処理を書く
//         System.out.print("何段>");
//         int inputNum = new java.util.Scanner(System.in).nextInt();

//         // 3. の処理を書く
//     }
// }
// ※ new java.util.Scanner(System.in).nextInt();
// 　 →コンソール(ターミナル)に入力された値をInputするオブジェクト
// 　　何段> 5 [Enter]
// 　　とすると、 5 が inputNum に代入される

// 表示結果　※ 5 を入力した場合
//     *
//    **
//   ***
//  ****
// *****

import java.util.InputMismatchException;
import java.util.Scanner;

public class ComprehensiveBeginner01_04 {
    public static void main(String[] args) {
        int inputNum = 0;
        Scanner sc = null;

        while (true) {
            try {
                // コンソール(ターミナル)に 1 ~ 5 までの整数を入力し、[Enter]
                System.out.print("何段>");
                sc = new java.util.Scanner(System.in);
                inputNum = sc.nextInt();
                if (inputNum < 1 || 5 < inputNum) {
                    System.out.println("1 ~ 5 までの整数を入力してください");
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("1 ~ 5 までの整数を入力してください");
                continue;
            }

            for (int i = 1; i <= inputNum; i++) {
                for (int j = 1; j <= inputNum; j++) {
                    if (inputNum < i + j) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            sc.close();
            break;
        }

    }

}
