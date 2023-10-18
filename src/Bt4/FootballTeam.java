package Bt4;

public class FootballTeam {
    private int id;
    private String name;
    private int numberOfPlayer;
    private int score;

    public FootballTeam(int id, String name, int numberOfPlayer, int score) {
        this.id = id;
        this.name = name;
        this.numberOfPlayer = numberOfPlayer;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfPlayer() {
        return numberOfPlayer;
    }

    public int getScore() {
        return score;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfPlayer(int numberOfPlayer) {
        this.numberOfPlayer = numberOfPlayer;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
