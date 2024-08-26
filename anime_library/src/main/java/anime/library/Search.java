package anime.library;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Search {

    final static JsonLoader loader = new JsonLoader();

    final static boolean loaded = loader.loadData("./assets/anime-offline-database-minified.json");

    /**
     * Aplicacion que busca animes por consola
     * -----
     * Main app that search animes in consol
     * 
     * @param args
     */
    public static void main(String[] args) {

        Library l = new Library();

        l.animes = loader.getAnime();

        Scanner scan = new Scanner(System.in);

        System.out.println(
                "Menu para buscar anime por titulo o por una serie de criterios - Menu for anime search according to title or criteria.");
        System.out.println("---------------------------------------------------------------");

        Menu(l, scan);
    }

    /**
     * Menu por consola para realizar busquedas
     * -----
     * Menu in consol for search result
     * 
     * @param l
     * @param scan
     */
    private static void Menu(Library l, Scanner scan) {
        while (true) {

            System.out.println("----Introduzca un comando - Use a command:\n*title - titles\n*criteria\n*random\n");
            System.out.println(
                    "--Los criterios que pueden buscar son - The criterias that can query are:\n*Type\n*Status\n*Season\n*Year\n*Tags\n");

            String sW = scan.nextLine();

            switch (sW) {
                case "titles":

                    caseTitles(l, scan);

                    break;
                case "title":

                    caseTitle(l, scan);

                    break;
                case "criteria":

                    caseCriteria(l, scan);

                    break;
                case "random":

                    RandomAnimeSet(loader, loaded);

                    break;
                case "exit":
                    return;
                default:
                    System.out.println("Error. Ingrese otro comando - Error. Put another command\n");
                    break;
            }
        }
    }

    private static void caseCriteria(Library l, Scanner scan) {

        System.out.println(
                "\nRealiza una busqueda ingresando los criterios deseado - Search a list of anime that matches with the criteria\n");
        System.out.println(
                "Puedes poner un limite de animes que seran mostrados con el comando 'limit' - You can put a limit of animes that will be show witn the command 'limit'\n");
        System.out.println("Cuando este listo use 'Search' para buscar - When you're ready use 'Search' for search");

        String str;

        do {

            str = scan.nextLine();

            Type typeSearch = null;

            int yearSearch = 0;

            Season seasonSearch = null;

            Status statusSearch = null;

            String[] tagsSearch = new String[0];

            int limit = 0;

            while (!str.equalsIgnoreCase("search") && !str.equalsIgnoreCase("back")) {

                String[] strSplit = str.split(" ");

                if (strSplit[0].equalsIgnoreCase("type")) {

                    typeSearch = Type(strSplit);
                } else if (strSplit[0].equalsIgnoreCase("year")) {

                    yearSearch = Year(strSplit);
                } else if (strSplit[0].equalsIgnoreCase("season")) {

                    seasonSearch = Season(strSplit);
                } else if (strSplit[0].equalsIgnoreCase("status")) {

                    statusSearch = Status(strSplit);
                } else if (strSplit[0].equalsIgnoreCase("tags")) {

                    tagsSearch = Tags(strSplit);
                } else if (strSplit[0].equalsIgnoreCase("limit")) {

                    limit = Integer.parseInt(strSplit[1]);
                }

                str = scan.nextLine();
            }

            List<Anime> searchResult = l.takeAnimeList(typeSearch, seasonSearch, yearSearch, statusSearch,
                    tagsSearch);

            if (limit > 0) {

                searchResult = searchResult.subList((int) Math.random() * 10, Math.min(limit, searchResult.size()));
            }

            System.out.println();

            for (Anime anime : searchResult) {

                System.out.println(anime.toString() + "\n");
            }

        } while (!str.equalsIgnoreCase("back"));
    }

    private static void caseTitle(Library l, Scanner scan) {
        System.out.println(
                "\nRealiza una busqueda ingresando el titulo deseado - Search an anime that matches with a title\n");

        List<Anime> animeListB = l.takeAnimeEqualTitle(scan.nextLine());
        System.out.println();
        for (Anime animeB : animeListB) {
            System.out.println(animeB.toString() + "\n");
        }
    }

    private static void caseTitles(Library l, Scanner scan) {
        System.out.println(
                "\nRealiza una busqueda de diversos animes ingresando el titulo deseado - Search all animes that matches with a title\n");

        List<Anime> animeListA = l.takeAnimeContainTitle(scan.nextLine());
        System.out.println();
        for (Anime animeA : animeListA) {
            System.out.println(animeA.toString() + "\n");
        }
        System.out.println();
    }

    /**
     * Muestra un anime aleatorio
     * -----
     * Shows a random anime
     * 
     * @param loader
     * @param loaded
     */
    private static void RandomAnimeSet(JsonLoader loader, boolean loaded) {

        if (loaded) {
            List<Anime> anime = loader.getAnime();
            System.out.println("\n" + anime.get((int) (Math.random() * anime.size())));
            System.out.println();
        }
    }

    // private static void RandomAnimeSetX(JsonLoader loader, boolean loaded,
    // Scanner scan) {

    // int num = scan.nextInt();

    // if (loaded) {
    // for (int i = 0; i < num; i++) {

    // List<Anime> anime = loader.getAnime();
    // System.out.println("\n" + anime.get((int) (Math.random() * anime.size())));
    // System.out.println();
    // }
    // }
    // }

    /**
     * Busca un anime si coincide el criterio Estado
     * -----
     * Search an anime if matches with the Status criteria
     * 
     * @param scan
     * @return
     */
    private static Status Status(String[] strSplit) {

        Status getStatus = null;

        if (strSplit[1].toUpperCase().equals(Status.FINISHED.name())) {
            getStatus = Status.FINISHED;
        } else if (strSplit[1].toUpperCase().equals(Status.ONGOING.name())) {
            getStatus = Status.ONGOING;
        } else if (strSplit[1].toUpperCase().equals(Status.UNKNOWN.name())) {
            getStatus = Status.UNKNOWN;
        } else if (strSplit[1].toUpperCase().equals(Status.UPCOMING.name())) {
            getStatus = Status.UPCOMING;
        }

        return getStatus;
    }

    /**
     * Busca un anime si coincide el criterio Temporada
     * -----
     * Search an anime if matches with the Season criteria
     * 
     * @param scan
     * @return
     */
    private static Season Season(String[] strSplit) {

        Season getSeason = null;

        if (strSplit[1].toUpperCase().equals(Season.FALL.name())) {
            getSeason = Season.FALL;
        } else if (strSplit[1].toUpperCase().equals(Season.SPRING.name())) {
            getSeason = Season.SPRING;
        } else if (strSplit[1].toUpperCase().equals(Season.SUMMER.name())) {
            getSeason = Season.SUMMER;
        } else if (strSplit[1].toUpperCase().equals(Season.UNDEFINED.name())) {
            getSeason = Season.UNDEFINED;
        } else if (strSplit[1].toUpperCase().equals(Season.WINTER.name())) {
            getSeason = Season.WINTER;
        }

        return getSeason;
    }

    /**
     * Busca un anime si coincide el criterio Etiquetas
     * -----
     * Search an anime if matches with the Tags criteria
     * 
     * @param scan
     * @return
     */
    private static String[] Tags(String[] strSplit) {

        String[] getTags = null;

        getTags = Arrays.copyOfRange(strSplit, 1, strSplit.length);

        return getTags;
    }

    /**
     * Busca un anime si coincide el criterio Year
     * -----
     * Search an anime if matches with the Year criteria
     * 
     * @param scan
     * @return
     */
    private static int Year(String[] strSplit) {

        int getYear = Integer.parseInt(strSplit[1]);

        return getYear;
    }

    /**
     * Busca un anime si coincide el criterio Tipo
     * -----
     * Search an anime if matches with the Type criteria
     * 
     * @param scan
     * @return
     */
    private static Type Type(String[] strSplit) {

        Type getType = null;

        if (strSplit[1].toUpperCase().equals(Type.TV.name())) {
            getType = Type.TV;
        } else if (strSplit[1].toUpperCase().equals(Type.MOVIE.name())) {
            getType = Type.MOVIE;
        } else if (strSplit[1].toUpperCase().equals(Type.SPECIAL.name())) {
            getType = Type.SPECIAL;
        } else if (strSplit[1].toUpperCase().equals(Type.ONA.name())) {
            getType = Type.ONA;
        } else if (strSplit[1].toUpperCase().equals(Type.OVA.name())) {
            getType = Type.OVA;
        } else if (strSplit[1].toUpperCase().equals(Type.UNKNOWN.name())) {
            getType = Type.UNKNOWN;
        }

        return getType;
    }
}
