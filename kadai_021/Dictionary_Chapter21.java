package text.section_21;

import java.util.HashMap;

public class Dictionary_Chapter21 {
    private HashMap<String, String> dictionary;

    // コンストラクタでHashMapを初期化
    public Dictionary_Chapter21() {
        dictionary = new HashMap<>();
    }

    // 単語とその意味を追加するメソッド
    public void addWord(String word, String meaning) {
        dictionary.put(word, meaning);
    }

    // 単語の意味を取得するメソッド
    public String getMeaning(String word) {
        return dictionary.get(word);
    }

    // 単語が辞書に存在するか確認するメソッド
    public boolean containsWord(String word) {
        return dictionary.containsKey(word);
    }
}
