import java.util.Scanner;

class Hello3{
  public static void main(String args[]){
    // Scannerを宣言                     
    Scanner scan = new Scanner(System.in);
    String str = scan.next();
    // 文字列１の出力
    System.out.println("入力された値は{"+ str + "}です");
    int i = scan.nextInt();
    // 整数の出力
    System.out.println("桁数：{"+ i + "}桁");
    String initial = scan.next();
    // 文字列２の出力
    System.out.println("頭文字：{"+ initial + "}");
    String last = scan.next();
    // 文字列３の出力
    System.out.println("語尾：{"+ last + "}");
  }
}
