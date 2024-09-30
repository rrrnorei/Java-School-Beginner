import java.util.Random;

class ComprehensiveBeginner01_03 {
  public static void main (String[] args) { 
    Random rand = new Random();
    int man = rand.nextInt(3)+1;
    int woman = rand.nextInt(3)+1;
    int child = rand.nextInt(3)+1;

    if(man == 3) {
      if(woman == 3) {
        if(child == 3) {
          System.out.println("あいこです");
        }else if(child == 2) {
          System.out.println("manとwomanが勝ちました");
        }else if(child == 1) {
          System.out.println("childが勝ちました");
        }    
      }else if(woman == 2) {
        if(child == 3) {
          System.out.println("manとchildが勝ちました");
        }else if(child == 2) {
          System.out.println("manが勝ちました");
        }else if(child == 1) {
          System.out.println("あいこです");
        }    
      }else if(woman == 1) {
        if(child == 3) {
          System.out.println("womanが勝ちました");
        }else if(child == 2) {
          System.out.println("あいこです");
        }else if(child == 1) {
          System.out.println("womanとchildが勝ちました");
        }    
      }
    }else if(man == 2) {
      if(woman == 3) {
        if(child == 3) {
          System.out.println("womanとchildが勝ちました");
        }else if(child == 2) {
          System.out.println("manが勝ちました");
        }else if(child == 1) {
          System.out.println("あいこです");
        }    
      }else if(woman == 2) {
        if(child == 3) {
          System.out.println("childが勝ちました");
        }else if(child == 2) {
          System.out.println("あいこです");
        }else if(child == 1) {
          System.out.println("manとwomanが勝ちました");
        }    
      }else if(woman == 1) {
        if(child == 3) {
          System.out.println("あいこです");
        }else if(child == 2) {
          System.out.println("manとchildが勝ちました");
        }else if(child == 1) {
          System.out.println("manが勝ちました");
        }    
      }
    }else if(man == 1) {
      if(woman == 3) {
        if(child == 3) {
          System.out.println("manが勝ちました");
        }else if(child == 2) {
          System.out.println("あいこです");
        }else if(child == 1) {
          System.out.println("manとchildが勝ちました");
        }    
      }else if(woman == 2) {
        if(child == 3) {
          System.out.println("あいこです");
        }else if(child == 2) {
          System.out.println("womanとchildが勝ちました");
        }else if(child == 1) {
          System.out.println("womanが勝ちました");
        }    
      }else if(woman == 1) {
        if(child == 3) {
          System.out.println("manとwomanが勝ちました");
        }else if(child == 2) {
          System.out.println("childが勝ちました");
        }else if(child == 1) {
          System.out.println("あいこです");
        }    
      }
    }
  }
}
