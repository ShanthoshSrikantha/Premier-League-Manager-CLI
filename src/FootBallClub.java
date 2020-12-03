import java.util.*;

public class FootBallClub extends SportsClub{
    private ArrayList<FootBallClub> playedFootBallClubs;
    private int numberOfReceivedGoals;
    private int numberOfScoredGoals;

    public FootBallClub(String name, String location) {
        super(name, location);
    }
    public FootBallClub(String name, String location, int win, int lost, int draw){
        super(name,location,win,lost,draw);
    }

    public ArrayList<FootBallClub> getPlayedFootBallClubs() {
        return playedFootBallClubs;
    }

    public void setPlayedFootBallClubs(ArrayList<FootBallClub> playedFootBallClubs) {
        this.playedFootBallClubs = playedFootBallClubs;
    }

    public int getNumberOfReceivedGoals() {
        return numberOfReceivedGoals;
    }

    public void setNumberOfReceivedGoals(int numberOfReceivedGoals) {
        this.numberOfReceivedGoals = numberOfReceivedGoals;
    }

    public int getNumberOfScoredGoals() {
        return numberOfScoredGoals;
    }

    public void setNumberOfScoredGoals(int numberOfScoredGoals) {
        this.numberOfScoredGoals = numberOfScoredGoals;
    }
}
