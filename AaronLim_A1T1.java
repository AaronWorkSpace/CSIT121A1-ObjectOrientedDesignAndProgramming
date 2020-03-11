//Done by Aaron Lim
//It is my work, I did not pass my work to
//any of my friends
//and did not copy anyone. I am willing to
//accept whatever punishment if there is someone
//copying my work


enum SuitEnum{
    Spade('S'),
    Heart('H'),
    Diamond('D'),
    Club('C');

    private char suit;

    SuitEnum (char suit){
        this.suit = suit;
    }

    public char getSuit(){
        return suit;
    }

    public void setSuit(char suit){
        this.suit = suit;
    }
}

enum RankEnum{
    Two('2'),
    Three('3'),
    Four('4'),
    Five('5'),
    Six('6'),
    Seven('7'),
    Eight('8'),
    Nine('9'),
    Ten('T'),
    Jack('J'),
    Queen('Q'),
    King('K'),
    Ace('A');

    private char rank;

    RankEnum (char rank){
        this.rank = rank;
    }

    public char getRank() {
        return rank;
    }

    public void setRank(char rank){
        this.rank = rank;
    }
}

class PlayingCard{
    private SuitEnum s;
    private RankEnum r;

    public PlayingCard(SuitEnum suit, RankEnum rank){
        this.s = suit;
        this.r = rank;
    }

    static public SuitEnum getSuit(int i){
        if (i == 0)
            return SuitEnum.Spade;
        else if (i == 1)
            return SuitEnum.Heart;
        else if (i == 2)
            return SuitEnum.Diamond;
        else
            return SuitEnum.Club;
    }

    static public RankEnum getRank(int i){
        if (i == 0)
            return RankEnum.Two;
        else if (i == 1)
            return RankEnum.Three;
        else if (i == 2)
            return RankEnum.Four;
        else if (i == 3)
            return RankEnum.Five;
        else if (i == 4)
            return RankEnum.Six;
        else if (i == 5)
            return RankEnum.Seven;
        else if (i == 6)
            return RankEnum.Eight;
        else if (i == 7)
            return RankEnum.Nine;
        else if (i == 8)
            return RankEnum.Ten;
        else if (i == 9)
            return RankEnum.Jack;
        else if (i == 10)
            return RankEnum.Queen;
        else if (i == 11)
            return RankEnum.King;
        else
            return RankEnum.Ace;

    }

    public void set (SuitEnum suit, RankEnum rank){
        this.s = suit;
        this.r = rank;
    }

    public String toString(){
        return String.format("%s%s%s",
                            s.getSuit(),
                            r.getRank(),
                            " ");
    }
}

public class AaronLim_A1T1 {

    static private void buildArray(PlayingCard[] card){
        int k = 0;
        for(int i = 0; i < 4; i++){
            for (int j = 0; j < 13; j++){
                PlayingCard cards = new PlayingCard(PlayingCard.getSuit(i), PlayingCard.getRank(j));
                card[k] = cards;
                k++;
            }
        }
    }

    static private void printArray(PlayingCard[] card){
        int j = 0;
        for (PlayingCard c : card){
            System.out.print(c.toString());
            j++;
            if (j == 13) {
                System.out.println();
                j = j - 13;
            }
        }
    }

    public static void main (String[] args){
        PlayingCard card[] = new PlayingCard[52];
        buildArray(card);
        printArray(card);
    }
}


