public class Main {
    public static void main(String[] args) {
        // Deklarera variabler
        int numberOfFilms = 27;
        int numberOfMofos = 171;

        // Bearbeta variabler
        double averageMofos = numberOfMofos / numberOfFilms;

        // Presentera resultaten
        System.out.println ("Samuel L Jackson har medverkat i " + numberOfFilms + "st filmer.");
        System.out.println ("Samuel L Jackson har sagt MF i " + numberOfMofos + "st filmer.");
        System.out.println ("I snitt har Samuel L Jackson sagt MF " + averageMofos + " per film.");
    }
}
