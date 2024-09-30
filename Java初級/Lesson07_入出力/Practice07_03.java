import java.util.Scanner;

class Practice07_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("＞");
        int inputNum = sc.nextInt();

        System.out.println(inputNum + " を 3 で割ったあまりは " + inputNum % 3 + " です");

        sc.close();
    }
}