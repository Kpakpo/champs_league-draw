public class countryLeague {
    private String leagueName;
    private int rankCoefficient;

    public countryLeague(String countryLeague, int coefficient) {
        leagueName = countryLeague;
        rankCoefficient = coefficient;

    }

    public String getLeagueName() {
        return leagueName;
    }

    public int getRankCoefficient() {
        return rankCoefficient;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public void setRankCoefficient(int rankCoefficient) {
        this.rankCoefficient = rankCoefficient;
    }
}
