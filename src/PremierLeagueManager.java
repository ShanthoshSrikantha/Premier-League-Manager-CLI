import java.util.*;


public class PremierLeagueManager implements ILeagueManager {
    List<SportsClub> premierLeagueClubs = new ArrayList<>();

    @Override
    public void displayMenu() {
        System.out.println("================================================================");
        System.out.println("====== 	Welcome to Premier League Manager ======================");
        System.out.println("================================================================");
        System.out.println("================================================================");
        System.out.println("Press \"A\" For Add a Club to Premier League Manager ");
        System.out.println("Press \"D\" For Delete a Club from Premier League Manager");
        System.out.println("Press \"E\" For Display Statistics of a Club ");
        System.out.println("Press \"S\" For Save All the Details to a  File ");
        System.out.println("Press \"T\" For Display Table of Statistics of All the Clubs");
        System.out.println("Press \"P\" For Add played Match Details : ");
        System.out.println("Press \"O\" For Sort Tables : ");
        System.out.println("Press \"Q\" For Quit the Program");
        System.out.println("****************************************************************");
        System.out.println("================================================================");

        this.selectOption();
    }

    private void selectOption() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Option : ");
        String option = scanner.nextLine().toLowerCase();

        switch (option) {
            case ("a"):
                System.out.println("==============================================");
                System.out.println("        Add Club to Premier League            ");
                System.out.println("**********************************************");
                System.out.println("==============================================");
                break;
            case ("d"):
                System.out.println("==============================================");
                System.out.println("        Delete Club From Premier League       ");
                System.out.println("**********************************************");
                System.out.println("==============================================");
                break;
            case ("e"):
                System.out.println("==============================================");
                System.out.println("   Statistics of Club From Premier League     ");
                System.out.println("**********************************************");
                System.out.println("==============================================");
                break;
            case ("s"):
                System.out.println("==============================================");
                System.out.println("    ----  All Details save to the File   ---  ");
                System.out.println("    ----    Program Closing Now          ---  ");
                System.out.println("**********************************************");
                break;
            case ("t"):
                System.out.println("==============================================");
                System.out.println(" Table of All Statistics From Premier League  ");
                System.out.println("**********************************************");
                System.out.println("==============================================");
                break;
            case ("p"):
                System.out.println("==============================================");
                System.out.println("   Insert Played Match to Premier League      ");
                System.out.println("**********************************************");
                System.out.println("==============================================");
                break;
            case ("o"):
                System.out.println("==============================================");
                System.out.println(" Sort Table of Statistics From Premier League ");
                System.out.println("**********************************************");
                System.out.println("==============================================");
                break;
            case ("q"):
                System.out.println("==============================================");
                System.out.println(" ---   Are u sure You want to quit ??   ----  ");
                System.out.print(" ---   Press \"Y\" to Quit --- \n ---   Press Any Key To Back to Program  --- \n Enter Option : ");
                String userOption = scanner.next();
                switch (userOption) {
                    case ("y"):
                        System.out.println("==============================================");
                        System.out.println("    ----    Program Closing Now..        ---  ");
                        System.out.println("    ----         Thank you               ---  ");
                        System.out.println("**********************************************");
                        System.exit(0);
                        break;
                    default:
                        this.displayMenu();
                }
        }
    }

    @Override
    public void addClub(SportsClub sportsClub) {

    }

    @Override
    public void deleteClub(String sportsClubName) {

    }

    @Override
    public void displayStatistics(SportsClub sportsClub) {

    }

    @Override
    public void displayTable(List<SportsClub> list) {

    }

}
