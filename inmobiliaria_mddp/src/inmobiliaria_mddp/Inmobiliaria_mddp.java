
package inmobiliaria_mddp;
import inmobiliaria_mddp.accesoDatos.*;
import inmobiliaria_mddp.entidades.*;
import java.time.LocalDate;
import java.util.List;

public class Inmobiliaria_mddp {

    
    public static void main(String[] args) {
        // TODO code application logic here
        /* 
        
        */

        Propietario propi = new Propietario(1, 22, "Lopez", "Juanjo", "Calle Buena", 88, "mail@domucho.com");
        InquilinoMartin inqui = new InquilinoMartin(1);
        Inmueble inmu = new Inmueble(1, 44, "SiempreViva", 123, "casa", 234, 999,  true, propi);
        
       
        Calquiler alquilo = new Calquiler(LocalDate.of(2023, 12, 6), LocalDate.of(2023, 12, 7), 444, 1,inmu, inqui);
        
        CalquilerData alquiData = new CalquilerData();
        
        alquiData.generarContrato(alquilo);
        
        
    }
    
}
