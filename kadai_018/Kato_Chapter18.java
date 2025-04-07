package kadai_018;

public class Kato_Chapter18 {
    protected String lastName = "加藤";
    protected String address = "東京都中野区〇×";

    public void displayInfo(String firstName, String extraInfo) {
        System.out.println("名前は " + lastName + firstName + " です");
        System.out.println("住所は " + address + " です");
        System.out.println(extraInfo);
    }
}



//家族の紹介・姓（共通）と名前（個別）と住所（共通）