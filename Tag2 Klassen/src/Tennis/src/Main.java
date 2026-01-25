package Tennis.src;/* Level 3
In einem Tennis-Match treten 2 Mannschaften gegeneinander an. Gespielt wird nach dem Ko-System.
Ein zufälliger Spieler aus Mannschaft 1 spielt gegen einen zufälligen Spieler aus Mannschaft 2.
Der Spieler, der das Spiel verliert, scheidet aus und wird aus der Mannschaft entfernt.

Eine Begegnung dauert so lange, bis ein Spieler DREI Matches gewonnen hat.
Hier weichen wir von den offiziellen Regeln ab (glaub ich :-)).
Beispiel:
	Spieler 1 - Spieler 2
Match 1:    6     -    4
Match 2:    3     -    6
Match 3:    3     -    6
Match 4:    6     -    2
Match 5:    6     -    5
	Spieler 1 - Spieler 2 (haben jeweils einen eigenen Zähler, der hochgezählt wird)
Eine Zufallszahl entscheidet, wer einen Punkt bekommt.
Beispiel-Match:
S1	S2
1	0
1	1
2	1
3	1
3	2
4	2
5	2
5	3
6	3

Turnier-Sieger ist die Mannschaft, die noch Spieler hat. Eine Mannschaft besteht aus 4 Spielern.

Team 1:			        Team 2:
Hugo Meier			    Fritz
Susi Sorglos			Walter
Fred Feuerstein			Sigrid
Marie Müller			Annemarie

Aus beiden Mannschaften werden ZUFÄLLIG Spieler gewählt.
Der Sieger verbleibt in seiner Mannschaft, der Verlierer scheidet aus.
Danach wird neu ZUFÄLLIG ausgelost.
 */


import java.util.ArrayList;
import java.util.Random;


public class Main {
    public static void main(String[] args) {

        ArrayList<Spieler> team1 = new ArrayList<>();
        ArrayList<Spieler> team2 = new ArrayList<>();

        team1.add(new Spieler("Hugo Meier"));
        team1.add(new Spieler("Susi Sorglos"));
        team1.add(new Spieler("Fred Feuerstein"));
        team1.add(new Spieler("Marie Müller"));

        team2.add(new Spieler("Fritz"));
        team2.add(new Spieler("Walter"));
        team2.add(new Spieler("Sigrid"));
        team2.add(new Spieler("Annemarie"));

        Random random = new Random();

        while (team1.size()!=0 && team2.size()!=0){
            int index1 = random.nextInt(team1.size());
            int index2 = random.nextInt(team2.size());

            Spieler player1 = team1.get(index1);
            Spieler player2 = team2.get(index2);
            System.out.println("Jetzt treffen sich " + player1.getName() + " von Team 1 und " + player2.getName() + " von Team 2");

            player1.resetWins();
            player2.resetWins();

            while(player1.getWins() != 3 && player2.getWins() != 3){
                int counterPlayer1 =0;
                int counterPlayer2 =0;

                while (counterPlayer1!=6 && counterPlayer2!=6){
                    if((random.nextInt(2)) == 0)
                    {
                        counterPlayer1 ++;
                        System.out.println("Results jetzt:" + counterPlayer1 + ":" + counterPlayer2 );
                    }
                    else{
                        counterPlayer2++;
                        System.out.println("Results jetzt:" + counterPlayer1 + ":" + counterPlayer2 );
                    }
                }

                if(counterPlayer1==6){
                    player1.addWin();
                    System.out.println("Player "+ player1.getName() + " von Team 1 hat in dieser Runde  gewonnen. Er hat jetzt " + player1.getWins() + " Wins");
                }
                else{
                    player2.addWin();
                    System.out.println("Player "+ player2.getName() + " von Team 2 hat  in dieser Runde  gewonnen. Er hat jetzt " + player2.getWins() + " Wins");
                }

            }
            if(player1.getWins()==3){
                System.out.println("Player 1 " + player1.getName() + " hat das Spiel  gewohnen.");
                team2.remove(index2);
            } else{
                System.out.println("Player 2 " + player2.getName() + " hat das Spiel gewohnen.");
                team1.remove(index1);
            }

        }

        if(team1.size()>0)
            System.out.println("Team 1 hat gewonnen");
        else
            System.out.println("Team 2 hat gewonnen");

    }
}