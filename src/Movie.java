
public class Movie {
   private final int id;
   private final String title;
   private final String Description;
   private final double duration;

    public Movie(int id, String title, String Description, double duration) {
        this.id = id;
        this.title = title;
        this.Description = Description;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return Description;
    }

    public double getDuration() {
        return duration;
    }
   
}
