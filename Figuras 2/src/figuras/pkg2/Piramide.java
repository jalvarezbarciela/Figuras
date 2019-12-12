package figuras.pkg2;
/**
 *
 * @author usuario
 */
public class Piramide {
    public Piramide(){
        
    }    
    
    public void Piramide(){
       
        int numFilas=20;
 
        for(int altura = 1; altura<=numFilas; altura++){

            for(int blancos = 1; blancos<=numFilas-altura; blancos++){
                System.out.print(" ");
            }
 
            for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
                System.out.print("*");
            }
            System.out.println();
        }
}
}
