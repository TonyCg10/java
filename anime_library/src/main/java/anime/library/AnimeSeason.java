package anime.library;

enum Season {
    SPRING, SUMMER, FALL, WINTER, UNDEFINED
};

public class AnimeSeason {

    private Season season;
    private int year;

    public AnimeSeason() {
    }

    public AnimeSeason(Season season, int year) {
        this.season = season;
        this.year = year;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
