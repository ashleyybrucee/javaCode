/*
Ashley Bruce
CIS 231
Lab 15
11/26/19
Randy Scovil
 */

public class Lab15ABru {

    public class Game {

        private int homeScore;
        private int visScore;
        private String homeTeam;
        private String visTeam;

        public Game (int theHomeScore, int theVisScore, String theHomeTeam, String theVisTeam) {
            homeScore = theHomeScore;
            visScore = theVisScore;
            homeTeam = theHomeTeam;
            visTeam = theVisTeam;
        }

        public int getHomeScore () {
            return homeScore;
        }

        public int getVisScore () {

            return visScore;
        }

        public void setGetHomeScore(int newHomeScore) {

            homeScore = newHomeScore;
        }

        public void setVisScore(int newVisScore) {

            visScore = newVisScore;
        }

        public String toString () {
            if (visScore > homeScore) {
                return (visTeam + ": " + visScore + "\n" + homeTeam + ": " + homeScore);
            }

            else {
                return (homeTeam + ": " + homeScore + "\n" + visTeam + ": " + visScore);
            }
        }
    }
}

