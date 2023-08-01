package domain;

public class YGOCard {
    private String cardPassword;
    private String name;
    private String type;

    public YGOCard(String cardPassword, String name, String type) {
        this.cardPassword = cardPassword;
        this.name = name;
        this.type = type;
    }

    public YGOCard() {
    }

    public String getCardPassword() {
        return cardPassword;
    }

    public void setCardPassword(String cardPassword) {
        this.cardPassword = cardPassword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "YGOCard{" +
                "cardPassword='" + cardPassword + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}