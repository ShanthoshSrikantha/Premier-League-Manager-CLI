import java.util.*;

public interface ILeagueManager {
    void addClub(SportsClub sportsClub);
    void deleteClub(String sportsClubName);
    void displayStatistics(SportsClub sportsClub);
    void displayTable(List<SportsClub> list);
    void displayMenu();
}
