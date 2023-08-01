package tool;

import db.ConnectYGOSQLite;
import domain.YGOCard;
import domain.YGODeck;
import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ReadYDK {
    public static YGODeck get(String ydkPath,String dbPath){
        ConnectYGOSQLite ygosqLite = new ConnectYGOSQLite(dbPath);
        File ydkFile = new File(ydkPath);
        FileReader fileReader = null;
        YGODeck ygoDeck = new YGODeck();
        String context;
        try {
            fileReader = new FileReader(ydkFile);
            char buff[] = new char[1024];
            int len = fileReader.read(buff);
            context = new String (buff,0,len);
        } catch (IOException e) {
            e.printStackTrace();
            context = "";
        }finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (context.equals("")){
            return null;
        }
        String deckArray[] = context.split("\n");
        ArrayList<YGOCard> rear = null;
        for (String password:deckArray){
            rear = ygoDeck.switchArea(password,rear);
            if (!String.valueOf(password.charAt(0)).equals("!") && !String.valueOf(password.charAt(0)).equals("#")){
                password = password.replaceAll("^(0+)", "");
                YGOCard card = ygosqLite.getCardByPassword(password);
                if (card != null ){
                    rear.add(card);
                }
            }
        }
        ygoDeck.setDeckName(ydkPath.split("/")[ydkPath.split("/").length-1]);
        ygosqLite.close();
        return ygoDeck;
    }
    public static YGODeck getOnly(String ydkPath,String dbPath) {
        ConnectYGOSQLite ygosqLite = new ConnectYGOSQLite(dbPath);
        File ydkFile = new File(ydkPath);
        FileReader fileReader = null;
        YGODeck ygoDeck = new YGODeck();
        String context;
        try {
            fileReader = new FileReader(ydkFile);
            char buff[] = new char[1024];
            int len = fileReader.read(buff);
            context = new String(buff, 0, len);
        } catch (IOException e) {
            e.printStackTrace();
            context = "";
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (context.equals("")) {
            return null;
        }
        String deckArray[] = context.split("\n");
        LinkedHashSet<String> passwords = new LinkedHashSet<>();
        ArrayList<YGOCard> rear = null;
        for (String password : deckArray) {
            passwords.add(password);
        }
        ArrayList<String> cardPasswords = new ArrayList<>();
        for (String password : passwords) {
            cardPasswords.add(password);
        }
        for (String password : cardPasswords) {
            rear = ygoDeck.switchArea(password, rear);
            if (!String.valueOf(password.charAt(0)).equals("!") && !String.valueOf(password.charAt(0)).equals("#")) {
                password = password.replaceAll("^(0+)", "");
                YGOCard card = ygosqLite.getCardByPassword(password);
                if (card != null) {
                    rear.add(card);
                }
            }

        }
        ygoDeck.setDeckName(ydkPath.split("/")[ydkPath.split("/").length - 1]);
        ygosqLite.close();
        return ygoDeck;
    }
}
