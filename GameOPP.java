package gameoop;
import java.util.Scanner;

/**
 *
 * @author amand
 */
public class GameOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
      
        String role = "";
        String opponent = "";
        

        
        System.out.println("Por favor seleccione un personaje e ingrese el literal del personaje: " ) ; 
	System.out.println( "A: Guerrero") ; 
	System.out.println( "B: Caballero" ) ; 
	System.out.println( "C: Mago " ) ; 
	role = scanner.nextLine();
        
        System.out.println("Por favor seleccione un oponente e ingrese el literal del personaje: " ) ; 
	System.out.println( "A: Guerrero") ; 
	System.out.println( "B: Caballero" ) ; 
	System.out.println( "C: Mago " ) ; 
        System.out.println( "D: Computadora " ) ; 
	opponent = scanner.nextLine();
        
        if(role.equals(opponent))
        {
            System.out.println( "El personaje principal y el oponente no pueden ser el mismo... Elija otro oponente: " ); 
            opponent = scanner.nextLine();
        }
        
        GamePVP.Start(role+opponent);
    }
   
}
