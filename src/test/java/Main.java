import db.ConnectYGOSQLite;
import tool.ReadYDK;

public class Main {
    public static void main(String[] args) {
        System.out.println(ReadYDK.get("E:/游戏/ygopro/WindBot/Decks/AI_Zoodiac.ydk",
                "D:\\2017\\Python\\Dictionary\\code\\sql\\cards_chinese.cdb"));
        System.out.println(ReadYDK.getOnly("E:/游戏/ygopro/WindBot/Decks/AI_Zoodiac.ydk",
                "D:\\2017\\Python\\Dictionary\\code\\sql\\cards_chinese.cdb"));
    }
}
