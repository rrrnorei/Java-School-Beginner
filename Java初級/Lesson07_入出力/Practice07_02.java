import java.util.Scanner;

class Practice07_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("＞");
        String inputText = sc.nextLine();

        System.out.println("MLBで二刀流として活躍している日本人野球選手は「" + inputText + "」です");

        sc.close();
    }
}