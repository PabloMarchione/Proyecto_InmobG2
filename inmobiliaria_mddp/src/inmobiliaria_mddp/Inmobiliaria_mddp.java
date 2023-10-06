
package inmobiliaria_mddp;
import inmobiliaria_mddp.accesoDatos.*;
import inmobiliaria_mddp.entidades.*;
import java.time.LocalDate;
import java.util.List;

public class Inmobiliaria_mddp {

    
    public static void main(String[] args) {
        // TODO code application logic here
        //Linea agregada solo para chequear push
        
        ///PRUEBA DEL METODO PARA MARTIN
        /* 
        InmuebleData id = new InmuebleData();
        id.estadoInmueble(12);
        */
        
        //hola soy Diana
        
        PropietarioMartin propi = new PropietarioMartin(1, 3333);
        InquilinoMartin inqui = new InquilinoMartin(1);
        InmuebleMartin inmu = new InmuebleMartin(1, propi);
        
       
        Calquiler alquilo = new Calquiler(LocalDate.of(2023, 12, 6), LocalDate.of(2023, 12, 7), 777, 1,inmu, inqui);
        
        CalquilerData alquiData = new CalquilerData();
        
        alquiData.generarContrato(alquilo);
        
    }
    
}
