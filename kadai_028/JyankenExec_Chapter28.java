import java.util.HashMap;

public class JyankenExec_Chapter28 {
    public static void main(String[] args) {
        // 結果を格納するHashMap
        HashMap<String, String> outcomes = new HashMap<>();
        outcomes.put("rr", "あいこです");
        outcomes.put("rs", "自分の勝ちです");
        outcomes.put("rp", "自分の負けです");
        outcomes.put("sr", "自分の負けです");
        outcomes.put("ss", "あいこです");
        outcomes.put("sp", "自分の勝ちです");
        outcomes.put("pr", "自分の勝ちです");
        outcomes.put("ps", "自分の負けです");
        outcomes.put("pp", "あいこです");

        // Jyanken_Chapter28クラスをインスタンス化してゲームを実行
        Jyanken_Chapter28 jyanken = new Jyanken_Chapter28();
        jyanken.playGame(outcomes);
    }
}
