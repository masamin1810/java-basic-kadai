package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18 {
    public KatoIchiro_Chapter18() {
        setGivenName("一郎");
    }
    
    // givenNameを設定するメソッド
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }
    
    public void eachIntroduce() {
        System.out.println("好きな食べ物はリンゴです");
    }
}