package domain;

public class YGOCard {
    private String cardPassword;
    private String name;

    public YGOCard(String cardPassword, String name) {
        this.cardPassword = cardPassword;
        this.name = name;
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

    @Override
    public String toString() {
        return "YGOCard{" +
                "cardPassword='" + cardPassword + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}