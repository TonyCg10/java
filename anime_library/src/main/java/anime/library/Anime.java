package anime.library;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

enum Type {
    TV, MOVIE, OVA, ONA, SPECIAL, UNKNOWN;
};

enum Status {
    FINISHED, ONGOING, UPCOMING, UNKNOWN
};

@JsonIgnoreProperties({ "sources", "picture", "thumbnail", "synonyms", "relations", "deadEntries", "relatedAnime" })
public class Anime {

    private String title;
    private Type type;
    private Status status;
    private String[] tags;
    private int episodes;
    private AnimeSeason animeSeason;

    public Anime() {
    }

    public Anime(String title, Type type, Status status, String[] tags, int episodes) {
        this.title = title;
        this.type = type;
        this.status = status;
        this.tags = tags;
        this.episodes = episodes;
    }

    public Anime(String title, Type type, Status status, String[] tags, int episodes, AnimeSeason animeSeason) {
        this.title = title;
        this.type = type;
        this.status = status;
        this.tags = tags;
        this.episodes = episodes;
        this.animeSeason = animeSeason;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public AnimeSeason getAnimeSeason() {
        return animeSeason;
    }

    public void setAnimeSeason(AnimeSeason animeSeason) {
        this.animeSeason = animeSeason;
    }

    public void update(Anime a) {
        this.title = a.getTitle();
        this.type = a.getType();
        this.status = a.getStatus();
        this.tags = a.getTags();
        this.episodes = a.getEpisodes();
    }

    @Override
    public String toString() {
        return "Title: " + title + " " + "\nType: " + type + " " + "\nStatus: " + status + " " + "\nEpisodes: "
                + episodes
                + " " + "\nYear: " + animeSeason.getYear() + " " + "\nSeason: "
                + animeSeason.getSeason() + "\nTags: " + tags;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Anime) {
            return this.title.equalsIgnoreCase(((Anime) obj).getTitle());
        }
        return false;
    }
}