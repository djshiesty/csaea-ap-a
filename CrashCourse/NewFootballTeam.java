public class NewFootballTeam {
    
    private double winRate;
    private int budget;
    private int trophyCount = 0;
    private double averageRating;
    private int playGames = 10;
    private int v = 0;
    private int wins = 5;
    private int streak = 0;
    private String teamName;
    private String manager;
    private String teamLeague;
    private boolean gameResult = true;

    public NewFootballTeam(String teamName, String manager, String teamLeague) {
        this.teamName = teamName;
        this.manager = manager;
        this.teamLeague = teamLeague;

        winRate = wins/playGames;
        budget = 100000000;
        averageRating = 5.0;
    }

    public void playGame(boolean gameResult) {
        this.gameResult = gameResult;
        if (gameResult && averageRating > 6.0) {
            wins += 1;
            playGames++;
            streak ++;
        } else {
            playGames++;
            streak = 0;
        }
    } 

    public void ManagerSacked () {
        manager.replace(" ","new" + v);
        v++;
        trophyCount -= 1;
        System.out.println("Manager has been sacked. New manager is: " + manager);
    }

    public void budgetSurplus () {
        budget *= 1.25;
        averageRating *= 1.1;
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
