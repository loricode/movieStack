
import javax.swing.JOptionPane;


public class MovieStack {
    
    private static Movie createMovie(){
       
        int id = Integer.parseInt(input("ingrese el id"));
        String title = input("ingrese el titulo");
        String description = input("ingrese la description");
        double duration = Double.parseDouble(input("ingrese la duracion"));
        Movie movie = new Movie(id, title, description, duration);
 
        return movie;
    }
    
    private static String input(String text){
        return JOptionPane.showInputDialog(text);
    }

    public static void main(String[] args) {
      
        MovieController obj = new MovieController();
        
        int opcion;
        
        do{
           opcion = Integer.parseInt(JOptionPane.showInputDialog( 
                   "** Menu Principal **"
                   +"\n 1. Agregar a la pila"
                   +"\n 2. Mostrar la pila"
                   +"\n 3. Buscar por titulo"
                   +"\n 4. Eliminar ultima pelicula ingresada"
                   +"\n 5. Finalizar"));
           
           switch(opcion){
               case 1:
                    obj.addMovie(createMovie());
                   break;
               case 2:
                    JOptionPane.showMessageDialog(null, obj.viewMovies());
                   break;
               case 3:
                    JOptionPane.showMessageDialog(null,
                        obj.getMovie(input("ingrese el titulo")));
                   break;
               case 4:
                   obj.deleteMovie();
                   break;
               case 5:
                     JOptionPane.showMessageDialog(null, "bye");
                   break;
               default:
                   JOptionPane.showMessageDialog(null, "opcion invalid");
                   break;        
           }
           
        }while(opcion != 5);
        System.exit(0);
    }
    
}
