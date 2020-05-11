import java.util.Scanner;

  class Stage3A {
    
   public static void main( String[] args ) {
    
    // 半径 
    double hankei;	
    
    // 面積
    double menseki;	
  
  
     // scannerクラスでキーボード入力を受け付ける
     Scanner sc = new Scanner(System.in);

     System.out.print( "半径：" );
     hankei = sc.nextDouble();

     menseki = hankei * hankei * Math.PI;
     
     System.out.println( "面積：" + menseki );

   }

}