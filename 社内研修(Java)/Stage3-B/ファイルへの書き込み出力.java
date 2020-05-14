import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
 
public class Stage3B {
 
    public static void main(String[] args) {
        try {
            // 書き込みするファイルを指定する
            FileWriter file = new FileWriter("/home/ec2-user/environment/サンプル実行/2020_514_output.txt", true);
            
            PrintWriter pw = new PrintWriter(new BufferedWriter(file));
            
            //ファイルに書き込み
            pw.println("webマーケティング部");
            pw.println("松﨑廉");
            
            //ファイルを閉じる
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
}