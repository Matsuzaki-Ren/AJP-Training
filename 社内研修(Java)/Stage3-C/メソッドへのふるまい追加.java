import java.io.File;
import java.io.IOException;
 
public class Stage3C {
 
    public static void main(String[] args) {
        
        //ファイルを5つ作成する
        File file1 = new File("/home/ec2-user/environment/サンプル実行/2020_514_output.1.txt");
        File file2 = new File("/home/ec2-user/environment/サンプル実行/2020_514_output.2.txt");
        File file3 = new File("/home/ec2-user/environment/サンプル実行/2020_514_output.3.txt");
        File file4 = new File("/home/ec2-user/environment/サンプル実行/2020_514_output.4.txt");
        File file5 = new File("/home/ec2-user/environment/サンプル実行/2020_514_output.5.txt");
        
        //5つ目のファイルを確認した時、1つ目を削除する
        if(file5.exists()){
            System.out.println("5つ目のファイルが作られたため、1つ目を削除しする");
            file1.delete(); 
        }
        
    }
 
}