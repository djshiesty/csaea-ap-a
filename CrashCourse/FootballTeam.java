public class FootballTeam {
    
    double winRate;
    int budget;
    int trophyCount = 0;
    double averageRating;
    boolean gameResult = true;
    int playGames = 10;
    int v = 0;
    int wins = 5;
    int streak = 0;
    String teamName;
    String manager;
    String teamLeague;

    public FootballTeam(String teamName, String manager, String teamLeague) {
        this.teamName = teamName;
        this.manager = manager;
        this.teamLeague = teamLeague;

        winRate = wins/playGames;
        budget = 100000000;
        averageRating = 5.0;
    }

    public void playGame(boolean gameResult) {
        
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
    }

    public void budgetSurplus () {
        budget *= 1.25;
        averageRating *= 1.1;
        if (playGames > 15 && winRate < 0.5) {
            budget *= 0.75;
            ManagerSacked();
            playGames = 0;
        }
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
