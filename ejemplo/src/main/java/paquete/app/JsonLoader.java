package paquete.app;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonLoader {
    private List<Entity> entities = new ArrayList<>();

    public List<Entity> getEntities() {
        return entities;
    }

    public void setEntities(List<Entity> entities) {
        this.entities = entities;
    }

    public boolean loadData(String from) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            Entity[] readValue = mapper.readValue(new File(from), Entity[].class);
            entities = Arrays.asList(readValue);
            return true;
        } catch (StreamReadException e) {
            System.err.println("STREAM ERROR");
            e.printStackTrace();
        } catch (DatabindException e) {
            System.err.println("DATABIND ERROR");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("IO ERROR");
            e.printStackTrace();
        }
        return false;
    }
}
