import java.util.Objects;

public abstract class SportsClub {
    private String clubName;
    private String clubLocation;
    private int numberOfPlayedMatch;
    private int numberOfWin;
    private int numberOfLost;
    private int numberOfDraw;
    private int numberOfPoint;

    public SportsClub(String name, String location) {
        this.clubName = name;
        this.clubLocation = location;
    }
    public SportsClub(String name, String location, int win, int lost,int draw){
        this.clubName = name;
        this.clubLocation = location;
        this.numberOfWin = win;
        this.numberOfLost =lost;
        this.numberOfDraw =draw;
    }

    @Override
    public String toString() {
        return "Club Name : " + this.clubName  +
                "\nClub Location : " + this.clubLocation +
                "\nPlayedMatch : " + this.numberOfPlayedMatch +
                "\nWins : " + this.numberOfWin +
                "\nLost : " + this.numberOfLost +
                "\nDraws : " + this.numberOfDraw;
    }
    @Override
    public  boolean equals(Object o) {
        return this.getClubName().equals(((SportsClub)o).clubName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clubName);
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getClubLocation() {
        return clubLocation;
    }

    public void setClubLocation(String clubLocation) {
        this.clubLocation = clubLocation;
    }

    public int getNumberOfPlayedMatch() {
        return numberOfPlayedMatch;
    }

    public void setNumberOfPlayedMatch(int numberOfPlayedMatch) {
        this.numberOfPlayedMatch = numberOfPlayedMatch;
    }

    public int getNumberOfWin() {
        return numberOfWin;
    }

    public void setNumberOfWin(int numberOfWin) {
        this.numberOfWin = numberOfWin;
    }

    public int getNumberOfLost() {
        return numberOfLost;
    }

    public void setNumberOfLost(int numberOfLost) {
        this.numberOfLost = numberOfLost;
    }

    public int getNumberOfDraw() {
        return numberOfDraw;
    }

    public void setNumberOfDraw(int numberOfDraw) {
        this.numberOfDraw = numberOfDraw;
    }

    public int getNumberOfPoint() {
        return numberOfPoint;
    }

    public void setNumberOfPoint(int numberOfPoint) {
        this.numberOfPoint = numberOfPoint;
    }
}
