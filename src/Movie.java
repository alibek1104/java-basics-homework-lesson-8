public class Movie {
    String title;
    String studio;
    String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG13";
    }

    public String toString() {
        return "Название фильма - " + title + ", " + " от студии - " + studio + ", " + " рейтинг фильма: " + rating;
    }


}
