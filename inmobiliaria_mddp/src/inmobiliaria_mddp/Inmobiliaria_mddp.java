
package inmobiliaria_mddp;
import inmobiliaria_mddp.accesoDatos.*;
import inmobiliaria_mddp.entidades.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Inmobiliaria_mddp {

    
    public static void main(String[] args) {
     Inquilino d =new Inquilino();
     InquilinoData a = new InquilinoData();
//       a.guardarInquilino(d);
//       
         
      
      if(a!=null){   
          a.eliminarInquilino(19);
      System.out.println(a.toString() );

      

    }
    }
    

}

