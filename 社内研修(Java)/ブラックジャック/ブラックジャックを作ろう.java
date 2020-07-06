import java.util.Scanner;
public class BlackJack {
    public static void main(String[] args){
   //最初に出力されるランダム数値
   int first_number;
   first_number = (int)(Math.random()*10)+1;
   
   
      //子合計
         int child_sum;
         child_sum = first_number;

   //最初に出力されるランダム数値の出力
   System.out.println("数値：[" + first_number + "]" + "合計【" + child_sum + "】");
   
    while(true){
        
         boolean is =  true;
          
         Scanner sc = new Scanner(System.in);
         System.out.print("『次のランダム数値を取得しますか[Y/N]』");
         String input = sc.nextLine();
    
        switch (input){
            
            case "Y":
                //子数値
                int yes_number;
                yes_number = (int)(Math.random()*10)+1;

                child_sum += yes_number;
                
                System.out.println("数値：[" + yes_number + "]" + "合計【" + child_sum + "】");
                if(child_sum > 21){
                    
                   System.out.println("LOSE");
                      is = false;
                }
                  break; 
            
            case "N":
                
                 //親数値
                 int no_number;
                 no_number = (int)(Math.random()*9)+14;
                 System.out.println("親数値：[" + no_number + "]" + "合計【" + child_sum + "】");
                 if(no_number > 22 || no_number < child_sum ){
                     System.out.println("WIN");
                        is = false;
                 }
                 if(no_number > child_sum){
                     System.out.println("LOSE");
                         is = false;
                 }
                 if(no_number == child_sum){
                     System.out.println("DRAW");
                      is = false;
                 }
                       break; 
        } 
         if(is == false){
              is = false;
              break;
      }
    }
   }
}