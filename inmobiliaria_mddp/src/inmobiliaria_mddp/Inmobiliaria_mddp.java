
package inmobiliaria_mddp;
import inmobiliaria_mddp.accesoDatos.*;
import inmobiliaria_mddp.entidades.*;
import java.time.LocalDate;
import java.util.List;

public class Inmobiliaria_mddp {

    
    public static void main(String[] args) {

        
        //alta inquilino
//        Inquilino juan = new Inquilino ("Jose Rodriguez", 2036966695, 296064558,"Rio Cuarto", "Gomez Ruben",20369665);
//        InquilinoData inquilino=new InquilinoData();
//        inquilino.guardarInquilino(juan);
        
        // modificacion inquilino
        
        /*Inquilino juan = new Inquilino (1, "Juan Rodrigues", 2036966695, 296064558,"Rio Cuarto", "Gomez Ruben",20369665);
        InquilinoData inquilino=new InquilinoData();
        inquilino.modificarInquilino(juan*/
//
//        Propietario propi = new Propietario(1, 22, "Lopez", "Juanjo", "Calle Buena", 88, "mail@domucho.com");
//        Inquilino inqui = new Inquilino(1, "Pepe", 987, 4433, "SuEmpresa", "Josefa", 22);
//        Inmueble inmu = new Inmueble(1, 44, "SiempreViva", 123, "casa", 234, 999,  true, propi);
//        
//       
//        Calquiler alquilo = new Calquiler(LocalDate.of(2023, 12, 6), LocalDate.of(2023, 12, 7), 333, 1,inmu, inqui);
//        
//        CalquilerData alquiData = new CalquilerData();
//        
//        alquiData.generarContrato(alquilo);
//        
//        CalquilerData calquiData = new CalquilerData();
//        
//        Calquiler calqui = calquiData.buscarContrato(6);
//        
//        //int idContrato = calqui.getIdContrato();
//        
//        //System.out.println(idContrato);
//        
//        calquiData.anularContrato(calqui.getIdContrato());
PropietarioData pro=new PropietarioData();
Propietario propietario= new Propietario(1, 254, "P", "J", "A", 43, "f");
//pro.agregarPropietario(propietario);
pro.modificarPropietario(propietario);
//        
    }
    
}
