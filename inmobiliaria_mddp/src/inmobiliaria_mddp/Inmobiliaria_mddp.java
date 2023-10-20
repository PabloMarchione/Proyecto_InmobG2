
package inmobiliaria_mddp;
import inmobiliaria_mddp.accesoDatos.*;
import inmobiliaria_mddp.entidades.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Inmobiliaria_mddp {

    
    public static void main(String[] args) {
//       Inquilino d =new Inquilino("Burgos Diego",25203366,29664194,"agvp","Barria luis",20255563);
      InquilinoData a = new InquilinoData();
//       a.guardarInquilino(d);
//       
         
         Inquilino encontrado= a.buscarInquilinoConCuit(20263396);
     if(encontrado!=null){   
      System.out.println(encontrado.toString() );
    }
    

    }
}
