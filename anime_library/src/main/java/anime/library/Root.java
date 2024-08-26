package anime.library;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({ "license", "repository", "lastUpdate" })
public class Root {

    private List<Anime> data;

    public Root() {
    }

    public Root(List<Anime> data) {
        this.data = data;
    }

    public List<Anime> getData() {
        return data;
    }

    public void setData(List<Anime> data) {
        this.data = data;
    }
}
