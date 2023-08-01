package domain;

import java.util.ArrayList;

public class YGODeck {
    private String deckName;
    private ArrayList<YGOCard> main;
    private ArrayList<YGOCard> extra;
    private ArrayList<YGOCard> side;

    public YGODeck(String deckName, ArrayList<YGOCard> main, ArrayList<YGOCard> extra, ArrayList<YGOCard> side) {
        this.deckName = deckName;
        this.main = main;
        this.extra = extra;
        this.side = side;
    }

    public YGODeck() {
        this.main = new ArrayList<YGOCard>();
        this.extra = new ArrayList<YGOCard>();
        this.side = new ArrayList<YGOCard>();
    }

    public String getDeckName() {
        return deckName;
    }

    public void setDeckName(String deckName) {
        this.deckName = deckName;
    }

    public ArrayList<YGOCard> getMain() {
        return main;
    }

    public void setMain(ArrayList<YGOCard> main) {
        this.main = main;
    }

    public ArrayList<YGOCard> getExtra() {
        return extra;
    }

    public void setExtra(ArrayList<YGOCard> extra) {
        this.extra = extra;
    }

    public ArrayList<YGOCard> getSide() {
        return side;
    }

    public void setSide(ArrayList<YGOCard> side) {
        this.side = side;
    }
    public ArrayList<YGOCard> switchArea(String type,ArrayList<YGOCard> old){
        type = type.trim();
        if (type.equals("#main")) {
            return this.main;
        }
        else if (type.equals("#extra")) {
            return this.extra;
        }
        else if (type.equals("!side")) {
            return this.side;
        }
        return old;
    }
    @Override
    public String toString() {
        return "YGODeck{" +
                "deckName='" + deckName + '\'' +
                ", main=" + main +
                ", extra=" + extra +
                ", side=" + side +
                '}';
    }
}
