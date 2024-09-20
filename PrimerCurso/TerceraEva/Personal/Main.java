package TerceraEva.Personal;

import TerceraEva.maquinaria.Locomotora;
import TerceraEva.maquinaria.Tren;

/*Main para la prueba de funcionamiento de un tren, cuyas carácteristicas estan
en el paquete <maquinaria>
*/
public class Main {
    public static void main(String[] args) {
        Maquinista a = new Maquinista("Juan Borovia","1458754-M",1800,"Oficial");
        Mecanico m = new Mecanico("Arturo Royo",658745985,"FRENOS");
        Locomotora l = new Locomotora("0187-GLM",2500,10,m);
        Tren t =  new Tren (l,a);
        System.out.println(t.toString());

    }
}
