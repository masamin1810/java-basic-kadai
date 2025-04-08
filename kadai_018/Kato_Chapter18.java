package kadai_018;

public abstract class Kato_Chapter18 {
    protected String familyName = "加藤";
    protected String givenName;
    protected String address = "東京都中野区〇×";

    public void commonIntroduce() {
        System.out.println("名前は " + familyName + givenName + " です");
        System.out.println("住所は " + address + " です");
    }

    public abstract void eachIntroduce();

    public void displayInfo() {
        commonIntroduce();
        eachIntroduce();
        System.out.println();
    }
}

//家族の紹介・姓（共通）と名前（個別）と住所（共通）