class Practice09_01 {
  public static void main(String[] args) {

    for (int i = 2; i <= 20; i += 2) {
      if (i == 8) {
        continue;
      } else if (i > 10 && i < 20) {
        continue;
      }
      System.out.println(i);
    }
  }

}
