import java.util.Date;

public class FootBallMatch {
    private SportsClub team1;
    private SportsClub team2;
    private Date matchDate;
    private int team1Goals;
    private int team2Goals;

    public FootBallMatch(SportsClub team1, SportsClub team2, Date matchDate) {
        this.team1 = team1;
        this.team2 = team2;
        this.matchDate = matchDate;
    }

    public SportsClub getTeam1() {
        return team1;
    }

    public void setTeam1(SportsClub team1) {
        this.team1 = team1;
    }

    public SportsClub getTeam2() {
        return team2;
    }

    public void setTeam2(SportsClub team2) {
        this.team2 = team2;
    }

    public Date getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(Date matchDate) {
        this.matchDate = matchDate;
    }

    public int getTeam1Goals() {
        return team1Goals;
    }

    public void setTeam1Goals(int team1Goals) {
        this.team1Goals = team1Goals;
    }

    public int getTeam2Goals() {
        return team2Goals;
    }

    public void setTeam2Goals(int team2Goals) {
        this.team2Goals = team2Goals;
    }

    public FootBallMatch(SportsClub team1, SportsClub team2) {
        this.team1 = team1;
        this.team2 = team2;
    }

    // static method to get random number
    public static int getRandomNumber(int first, int last){
        return  (int) Math.round(Math.random() * (last - first +1) +first);
    }
}
