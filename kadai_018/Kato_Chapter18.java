package kadai_018;

public abstract class Kato_Chapter18 {
    protected String familyName = "加藤";
    protected String givenName;
    protected String address = "東京都中野区〇〇";

    // 抽象メソッド
    public abstract void eachIntroduce();

    // 共通のメソッド
    public void execIntroduce() {
        System.out.println("名前は " + familyName + givenName + " です");
        System.out.println("住所は " + address + " です");
    }

    // givenNameを設定するメソッド
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }
}