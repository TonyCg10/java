package anime.library;

import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Anime> animes = new ArrayList<>();

    /**
     * Anade o actualiza un anime segun un titulo
     * -----
     * Add or update an anime according to a title
     * 
     * @param a
     */
    public void addAnime(Anime a) {

        int index = animes.indexOf(a);
        if (index == -1) {

            animes.add(a);
        } else {

            Anime current = animes.get(index);
            current.update(a);
        }
    }

    /**
     * Elimina un anime segun un titulo
     * -----
     * Erase an anime according to a title
     * 
     * @param title
     */
    public void deleteAnime(String title) {

        for (Anime currentAnime : animes) {

            String currentTitle = currentAnime.getTitle();

            if (title.equalsIgnoreCase(currentTitle)) {

                animes.remove(currentAnime);
            }
        }
    }

    /**
     * Toma todos los animes segun un titulo
     * -----
     * Take all anime according to a title
     * 
     * @param title
     * @return
     */
    public List<Anime> takeAnimeContainTitle(String title) {

        List<Anime> animeList = new ArrayList<>();

        for (Anime currentAnime : animes) {

            String animeTitle = currentAnime.getTitle();

            if (animeTitle.toLowerCase().contains(title.toLowerCase())) {

                animeList.add(currentAnime);
            }
        }
        return animeList;
    }

    /**
     * Toma una anime segun el titulo
     * -----
     * Take an anime according to a title
     * 
     * @param title
     * @return
     */
    public List<Anime> takeAnimeEqualTitle(String title) {

        List<Anime> animeList = new ArrayList<>();

        for (Anime currentAnime : animes) {

            String animeTitle = currentAnime.getTitle();

            if (title.equalsIgnoreCase(animeTitle)) {

                animeList.add(currentAnime);
            }
        }
        return animeList;
    }

    /**
     * Toma los animes de una lista segun los criterios que cooincidan con la
     * busqueda realizada
     * -----
     * Take the animes of a list according to the matching criteria with the query
     * 
     * @param tipo
     * @param temporada
     * @param year
     * @param estado
     * @param etiquetas
     * @return
     */
    public List<Anime> takeAnimeList(Type type, Season season, int year, Status status, String[] tags) {

        List<Anime> animeList = new ArrayList<>();

        for (Anime currentAnime : animes) {

            if (type != null && !type.equals(currentAnime.getType()))
                continue;

            if (season != null && !season.equals(currentAnime.getAnimeSeason().getSeason()))
                continue;

            if (year != 0 && year != currentAnime.getAnimeSeason().getYear())
                continue;

            if (status != null && !status.equals(currentAnime.getStatus()))
                continue;

            if (tags != null && tags.length > 0 && !findTag(tags, currentAnime.getTags()))
                continue;

            if (tags != null && tags.length > 0 && !findAllTag(tags, currentAnime.getTags()))
                continue;

            animeList.add(currentAnime);
        }
        return animeList;
    }

    /**
     * Busca si existen todas las etiquetas de una lista fuente dentro de una lista
     * objetivo
     * -----
     * Search if exists all the tags of a base list
     * 
     * @param etiquetas
     * @param tags
     * @return
     */
    private boolean findAllTag(String[] tag, String[] tags) {

        for (String currentTag : tags) {
            boolean belong = false;
            for (String nextTag : tag) {
                if (currentTag.equals(nextTag)) {
                    belong = true;
                    break;
                }
            }
            if (!belong) {
                return false;
            }
        }
        return true;
    }

    /**
     * Busca si existe una etiqueta de una lista fuente dentro de una lista objetivo
     * -----
     * Search if exists a tag of a base list
     * 
     * @param etiquetas
     * @param tags
     * @return
     */
    private boolean findTag(String[] tag, String[] tags) {

        for (String currentTag : tags) {
            for (String nextTag : tag) {

                if (currentTag.equals(nextTag))
                    return true;
            }
        }
        return false;
    }
}
