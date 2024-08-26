package anime.library;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonLoader {

    private List<Anime> anime = new ArrayList<>();

    public List<Anime> getAnime() {
        return anime;
    }

    public void setAnime(List<Anime> anime) {
        this.anime = anime;
    }

    public boolean loadData(String from) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            Root readValue = mapper.readValue(new File(from), Root.class);
            anime = readValue.getData();
            return true;
        } catch (StreamReadException e) {
            System.err.println("ERROR");
            e.printStackTrace();
        } catch (DatabindException e) {
            System.err.println("ERROR");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("ERROR");
            e.printStackTrace();
        }
        return false;
    }
}
