import module java.base;
package CrashCourse;
public class NewFootballTeam {
    
    public double winRate;
    public int budget;
    public int trophyCount = 0;
    public double averageRating;
    public int playGames = 10;
    private int v = 0;
    public int wins = 5;
    public int streak = 0;
    public String teamName;
    public String manager;
    public String teamLeague;
    private boolean gameResult = true;

    public NewFootballTeam(String teamName, String manager, String teamLeague) {
        this.teamName = teamName;
        this.manager = manager;
        this.teamLeague = teamLeague;

        winRate = wins/playGames;
        budget = 100000000;
        averageRating = 5.0;
    }

    public void playGame (boolean gameResult) {
        this.gameResult = gameResult;
        if (gameResult && averageRating > 6.0) {
            wins += 1;
            playGames++;
            streak ++;
            System.out.println("Game won!");
        } else {
            playGames++;
            streak = 0;
            System.out.println("Game lost!");
        }
    } 

    public void ManagerSacked () {
        manager = manager.replace(manager, "new" + v);
        v++;
        trophyCount -= 1;
        System.out.println("Manager has been sacked. New manager is: " + manager);
    }

    public void budgetSurplus () {
        budget *= 1.25;
        averageRating *= 1.21;
        if (playGames > 15 && winRate < 0.5) {
            budget *= 0.75;
            ManagerSacked();
            playGames = 0;
        }
        System.out.println("Budget surplus updated. Current budget: " + budget + ", Average rating: " + averageRating);
    }

    public void WinningStreak () {
        if (winRate > 0.6 && streak == 5) {
            trophyCount ++;
        }
        else {
            winRate -= 0.1;
        }
    }

    public void OnTheGrind () {
        averageRating *= 1.2;
        budget *= 0.5;
    }

}
public class NewFootballTeam {
    
    public double winRate;
    public int budget;
    public int trophyCount = 0;
    public double averageRating;
    public int playGames = 10;
    private int v = 0;
    public int wins = 5;
    public int streak = 0;
    public String teamName;
    public String manager;
    public String teamLeague;
    private boolean gameResult = true;

    public NewFootballTeam(String teamName, String manager, String teamLeague) {
        this.teamName = teamName;
        this.manager = manager;
        this.teamLeague = teamLeague;

        winRate = wins/playGames;
        budget = 100000000;
        averageRating = 5.0;
    }

    public void playGame (boolean gameResult) {
        this.gameResult = gameResult;
        if (gameResult && averageRating > 6.0) {
            wins += 1;
            playGames++;
            streak ++;
            System.out.println("Game won!");
        } else {
            playGames++;
            streak = 0;
            System.out.println("Game lost!");
        }
    } 

    public void ManagerSacked () {
        manager = manager.replace(manager, "new" + v);
        v++;
        trophyCount -= 1;
        System.out.println("Manager has been sacked. New manager is: " + manager);
    }

    public void budgetSurplus () {
        budget *= 1.25;
        averageRating *= 1.21;
        if (playGames > 15 && winRate < 0.5) {
            budget *= 0.75;
            ManagerSacked();
            playGames = 0;
        }
        System.out.println("Budget surplus updated. Current budget: " + budget + ", Average rating: " + averageRating);
    }

    public void WinningStreak () {
        if (winRate > 0.6 && streak == 5) {
            trophyCount ++;
        }
        else {
            winRate -= 0.1;
        }
    }

    public void OnTheGrind () {
        averageRating *= 1.2;
        budget *= 0.5;
    }

}
NewFootballTeam m1 = new NewFootballTeam("Team1","Manager1","TeamLeague1");
m1.budgerSurplus
m1.budgetSurplus
m1.budgetSurplus()
m1.budget
NewFootballTeam m2 = new NewFootballTeam("Team2","Manager2","TeamLeague2");
m2.playGame(false)
m1.winRate
NewFootballTeam m3 = new NewFootballTeam("Team3","Manager3","TeamLeague3");
m3.OnTheGrind()
m3.averageRating
m2.winRate
NewFootballTeam m4 = new NewFootballTeam("Team4","Manager4","TeamLeague4");
m4.ManagerSacked()
m4.manager
NewFootballTeam m5 = new NewFootballTeam("Team5","Manager5","TeamLeague5");
m5.budgetSurplus
m5.budgetSurplus()
m5.playGame(true)
m5.playGame(true)
m5.playGame(true)
m5.playGame(true)
m5.playGame(true)
m5.playGame(true)
m5.playGame(true)
m5.WinningStreak()
m5.trophyCount
m5.winRate