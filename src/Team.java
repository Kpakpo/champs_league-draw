public class Team {
    public enum rank {
        First,
        Second,
        Third,
        Fourth
    }

    private String name;
    private int titlesWon;
    private String country;
    private int leagueRank;

    public Team(String teamName, int trophies, String countryName) {
        name = teamName;
        titlesWon = trophies;
        country  = countryName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setTitlesWon(int titlesWon) {
        this.titlesWon = titlesWon;
    }


    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getTitlesWon() {
        return titlesWon;
    }
}
