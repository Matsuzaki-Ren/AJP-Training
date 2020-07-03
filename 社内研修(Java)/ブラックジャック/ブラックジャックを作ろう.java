import java.util.Scanner;
public class BlackJack {
    public static void main(String[] args){
   //最初に出力されるランダム数値
   int first_number;
   first_number = (int)(Math.random()*10)+1;
   //子数値
   int yes_number;
   yes_number = (int)(Math.random()*10)+1;
   //子合計
   int child_sum;
   child_sum = first_number + yes_number;
   //親数値
   int no_number;
   no_number = (int)(Math.random()*9)+14;
   //親合計
   int parent_sum;
   parent_sum = no_number + child_sum;
   //最初に出力されるランダム数値の出力
   System.out.println("数値：[" + first_number + "]" + "合計【" + first_number + "】");

    while(true){
        
        //子数値
      yes_number = (int)(Math.random()*10)+1;
        
      Scanner sc = new Scanner(System.in);
        System.out.print("次のランダム数値を取得しますか[Y/N]");
        String input = sc.nextLine();
    
        switch (input){
            
            case "Y":
                System.out.println("数値：[" + yes_number + "]" + "合計【" + child_sum + "】");
                if(yes_number > 21){
                   System.out.println("LOSE");
                   break; 
                }
            
            case "N":
                 no_number = (int)(Math.random()*9)+14;
                 System.out.println("親数値：[" + parent_sum + "]" + "子合計【" + child_sum + "】");
                 if(no_number > 22 || no_number < child_sum ){
                     System.out.println("WIN");
                     break; 
                 }if(no_number > child_sum){
                     System.out.println("LOSE");
                     break; 
                 }if(no_number == child_sum){
                     System.out.println("DRAW");
                     break; 
                 }
                 
            default:
        }
    }
   }
}