class Stage3E {
  public static void main(String[] args) {
    //ユーザーIDの登録
    User userId = new User();
    userId.id();
    
    //ユーザー名の登録
    User userName = new User();
    userName.name();
    
    //パスワードの登録
    User password = new User();
    password.pass();
    
    //生年月日の登録
    User birth = new User();
    birth.date();
    
    //年齢の登録
    User age = new User();
    age.nenrei();
    
  }

class User {
  //ユーザーIDの出力
  public void id(){
    System.out.println("matsuzaki");
  }
  //ユーザー名の出力
  public void name(){
    System.out.println("松﨑廉");
  }
  //パスワードの出力
  public void pass(){
    System.out.println("agilejp");
  }
  //生年月日の出力
  public void date(){
    System.out.println("1996年10月31日");
  }
  //年齢の出力
  public void nenrei(){
    System.out.println(23);
  }
}
