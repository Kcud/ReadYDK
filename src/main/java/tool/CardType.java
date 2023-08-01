package tool;

public class CardType {
    public static String getCardType(int flag){
//        int g[] = new int[]{33,33554465,17,16777249,2097185,8225,4129,67108897,16401,97,8388641,4113,65,33558561,545,
//                1057,4161,129,161,2081,50331681,67108865,4194337,16777233,8388609,16781345,12321,16777313,8193,25165857};
        int x[] = new int[]{131076,4,1048580};
        int m[] = new int[]{2,65538,262146,524290,131074,130};
        for (int i = 0; i< m.length; i++){
            if (flag == m[i])
                return "spells";
        }
        for (int i = 0; i< x.length; i++) {
            if (flag == x[i])
                return "traps";
        }
        return "monsters";
    }
}
