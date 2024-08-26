package paquete.app;

import java.util.List;

public class App {

    public static void main(String[] args) {
        
        JsonLoader loader = new JsonLoader();
        boolean loaded = loader.loadData("./assets/entities.json");
        if (loaded) {
            List<Entity> entities = loader.getEntities();
            System.out.println(entities.get((int) (Math.random() * entities.size())));
        }
    }
}
