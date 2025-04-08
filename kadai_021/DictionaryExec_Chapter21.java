package text.section_21;

public class DictionaryExec_Chapter21 {
    public static void main(String[] args) {
        // 辞書クラスのインスタンスを作成
        Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();

        // 辞書に単語を追加
        dictionary.addWord("apple", "りんご");
        dictionary.addWord("peach", "桃");
        dictionary.addWord("banana", "バナナ");
        dictionary.addWord("lemon", "レモン");
        dictionary.addWord("pear", "梨");
        dictionary.addWord("kiwi", "キウィ");
        dictionary.addWord("strawberry", "いちご");
        dictionary.addWord("grape", "ぶどう");
        dictionary.addWord("muscat", "マスカット");
        dictionary.addWord("cherry", "さくらんぼ");

        // 出力結果のイメージに合わせて表示
        printMeaning(dictionary, "apple");
        printMeaning(dictionary, "banana");
        printMeaning(dictionary, "grape");
        printMeaning(dictionary, "orange"); // 存在しない単語
    }

    // 辞書から単語の意味を取得して出力するメソッド
    private static void printMeaning(Dictionary_Chapter21 dictionary, String word) {
        if (dictionary.containsWord(word)) {
            System.out.println(word + "の意味は" + dictionary.getMeaning(word));
        } else {
            System.out.println(word + "は辞書に存在しません");
        }
    }
}
