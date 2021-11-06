
import java.util.Stack;
import javax.swing.JOptionPane;

public class MovieController {
   
   Stack<Movie> movies;
   
   public MovieController(){
      movies = new Stack();
   }
    
   public void addMovie(Movie pelicula){
       if(pelicula != null) movies.add(pelicula);
   }
   
   public String viewMovies(){
       String  text = "lista ";
       int i;
       if(!movies.empty()){
         
           for(i = 0; i < movies.size(); i++){
               text += "\nID: " + movies.get(i).getId();
               text += "\nTitulo: "+ movies.get(i).getTitle();
               text += "\nDescripcion:"+ movies.get(i).getDescription();
               text += "\nDuracion:"+ movies.get(i).getDuration();
           }
           
       }
       return text;
   }
   
   
   public String getMovie(String title){
       String text = "Movie ";
       int i;
       if(!movies.empty()){
         
           for(i = 0; i < movies.size(); i++){
             if(title.equals(movies.get(i).getTitle())){
               text += "\nID: " + movies.get(i).getId();
               text += "\nTitulo: "+ movies.get(i).getTitle();
               text += "\nDescripcion:"+ movies.get(i).getDescription();
               text += "\nDuracion:"+ movies.get(i).getDuration();
             }  
           }
       }
       return text;
   }
   
   public void deleteMovie(){
       if(!movies.empty()){
           movies.pop();
           JOptionPane.showMessageDialog(null, "deleted item");
       }
   }
   
}
