
package inmobiliaria_mddp;
import inmobiliaria_mddp.accesoDatos.*;
import inmobiliaria_mddp.entidades.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Inmobiliaria_mddp {

    
    public static void main(String[] args) {
        // TODO code application logic here
        /* 
        
        

        Propietario propi = new Propietario(1, 22, "Lopez", "Juanjo", "Calle Buena", 88, "mail@domucho.com");
        Inquilino inqui = new Inquilino(1, "Pepe", 987, 4433, "SuEmpresa", "Josefa", 22);
        Inmueble inmu = new Inmueble(1, 44, "SiempreViva", 123, "casa", 234, 999,  true, propi);
        
        Inmueble inmu2 = new Inmueble(8, 3264, "Corro", 123, "casa", 234, 999,  true, propi);
        
       
        Calquiler calquilo = new Calquiler(LocalDate.of(2023, 12, 7), LocalDate.of(2023, 12, 8), 222, 1,inmu2, inqui);
        
        //calquiData.generarContrato(calquilo);
        
        //Calquiler calqui = calquiData.buscarContrato(6);
        
        //calquiData.anularContrato(calqui.getIdContrato());

        //calquiData.renovarContrato(calquilo);
        
        List<Calquiler> calquis = new ArrayList<>();
        calquis = calquiData.historialPorInmueble(8);
        
        for(Calquiler aux : calquis)
        {
            System.out.println(aux.getIdContrato());
        }
        
        List<Calquiler> calquis2 = new ArrayList<>();
        calquis2 = calquiData.historialPorInmueble(1);
        for (Calquiler aux : calquis2)
        {
            System.out.println(aux.getPrecioAlquiler());
        }
        
        CalquilerData calquiData = new CalquilerData();
        calquiData.destruirContrato(7);
        */

        
    }
    
}
