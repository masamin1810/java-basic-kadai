package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18 {
    public KatoTaro_Chapter18() {
        setGivenName("太郎");
    }

    // givenNameを設定するメソッド
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }
    
    public void eachIntroduce() {
        System.out.println("Javaが得意です");
    }
}

