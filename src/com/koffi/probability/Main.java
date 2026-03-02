import com.koffi.probability.LoiGeometrique;
import com.koffi.probability.LoiNormale;

public static void main(String[] args) {


    LoiGeometrique loi= new LoiGeometrique(0.34,9);
    LoiNormale  loi2= new LoiNormale(23,6,6);



    System.out.println(loi.event(8));
    System.out.println(loi2.fonctionLoiNormale());





}
