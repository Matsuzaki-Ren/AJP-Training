import java.util.Scanner;

class Stage2B{
  public static void main(String args[]){
    // Scannerを宣言                     
    Scanner scan = new Scanner(System.in);
    String str = scan.next();
  
    
    System.out.println("入力された値は{" + str + "}です");
   
   //文字列の長さを取得
    int len = str.length();
    
    System.out.println("桁数:{" + len + "}");
    
    //文字列の頭文字を取得  
     System.out.println("頭文字:{" + str.substring(0,1) + "}");
    //文字列の語尾を取得
     System.out.println("語尾;{" + str.substring(str.length()-1) + "}");
  
  }
}
