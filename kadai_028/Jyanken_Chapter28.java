import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
    private static final String[] HANDS = {"r", "s", "p"}; // グー, チョキ, パー

    // 自分のじゃんけんの手を入力するメソッド
    public String getMyChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("グーは'r', チョキは's', パーは'p'を入力してください:");
        String choice = scanner.nextLine();

        while (!choice.equals("r") && !choice.equals("s") && !choice.equals("p")) {
            System.out.println("無効な入力です。もう一度入力してください:");
            choice = scanner.nextLine();
        }
        return choice;
    }

    // 対戦相手のじゃんけんの手を乱数で選ぶメソッド
    public String getRandom() {
        double randomValue = Math.random() * 3; // 0以上3未満の乱数を生成
        int index = (int) Math.floor(randomValue); // 乱数を切り捨てて0, 1, 2のいずれかを取得
        return HANDS[index];
    }

    // じゃんけんを行うメソッド
    public void playGame(HashMap<String, String> outcomes) {
        String myChoice = getMyChoice(); // 自分の手を取得
        String opponentChoice = getRandom(); // 対戦相手の手を取得

        System.out.println("自分の手: " + myChoice);
        System.out.println("対戦相手の手: " + opponentChoice);

        // 結果を出力
        String result = outcomes.get(myChoice + opponentChoice);
        System.out.println(result);
    }
}
