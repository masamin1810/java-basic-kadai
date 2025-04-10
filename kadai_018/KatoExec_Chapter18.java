package kadai_018;

public class KatoExec_Chapter18 {
    public static void main(String[] args) {
        Kato_Chapter18 taro = new KatoTaro_Chapter18();
        Kato_Chapter18 hanako = new KatoHanako_Chapter18();
        Kato_Chapter18 ichiro = new KatoIchiro_Chapter18();

        taro.setGivenName();
        taro.eachIntroduce();
        System.out.println();

        hanako.setGivenName();
        hanako.eachIntroduce();
        System.out.println();

        ichiro.setGivenName();
        ichiro.eachIntroduce();
        System.out.println();
    }
}