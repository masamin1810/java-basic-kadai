package kadai_018;

public class KatoExec_Chapter18 {
    public static void main(String[] args) {
        KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
        KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();
        KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();

        taro.display();
        System.out.println();
        hanako.display();
        System.out.println();
        ichiro.display();
    }
}


//合格条件
//１．クラスの継承を使い、各Stepの説明通りに実装できている
//２．抽象クラスと抽象メソッドを使い、各Stepの説明通りに実装できている