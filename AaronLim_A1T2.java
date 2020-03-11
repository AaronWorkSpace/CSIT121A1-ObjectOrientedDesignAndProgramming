//Done by Aaron Lim
//It is my work, I did not pass my work to
//any of my friends
//and did not copy anyone. I am willing to
//accept whatever punishment if there is someone
//copying my work

import java.util.ArrayList;

public class AaronLim_A1T2 {

    private static void buildArray(ArrayList<PlayingCard> CardList){
        ArrayList<SuitEnum> SuitList = new ArrayList<>();
        ArrayList<RankEnum> Rank = new ArrayList<>();
        for (int i = 0; i < 4; i++){
            SuitEnum suit = PlayingCard.getSuit(i);
            SuitList.add(suit);
        }

        for (int i = 0; i < 13; i++){
            RankEnum rank = PlayingCard.getRank(i);
            Rank.add(rank);
        }

        for (SuitEnum s : SuitList){
            for(RankEnum r: Rank){
                PlayingCard cards = new PlayingCard(s, r);
                CardList.add(cards);
            }
        }
    }

    private static void printArray(ArrayList<PlayingCard> CardList){
        int i = 0;
        for (PlayingCard c : CardList){
            System.out.print(c);
            i++;

            if(i == 13){
                System.out.println();
                i -= 13;
            }
        }
    }
    public static void main(String[] args){
        ArrayList<PlayingCard> CardList = new ArrayList<>();
        buildArray(CardList);
        printArray(CardList);
    }
}
