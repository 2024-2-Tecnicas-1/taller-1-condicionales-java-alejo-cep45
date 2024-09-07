
package ejercicios;
import java.time.LocalDate;

import static ejercicios.SetDeTenis.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class Edad {
    public static String evaluar(int dia, int mes, int anno) {
        LocalDate currentDate = LocalDate.now();
        int dian = currentDate.getDayOfMonth();
        int mesn = currentDate.getMonthValue();
        int annon = currentDate.getYear();
        int e =annon-anno;
        if((mes>=mesn)&(dia>=dian)){
            e=e-1;
        
    }
        return("Usted tiene "+e+" años");
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento.");
        System.out.print("Día:");
        int dia = lector.nextInt();
        System.out.print("Mes:");
        int mes = lector.nextInt();
        System.out.print("Año:");
        int anno = lector.nextInt();
        
        String respuesta = evaluar(dia, mes, anno);
        System.out.println(respuesta);
    }
}
