package ico.fes.aragon.unam.mx.main;

import ico.fes.aragon.unam.mx.clases.ListaLigada;
import ico.fes.aragon.unam.mx.clases.Nodo1;
import ico.fes.aragon.unam.mx.clases.smartPhone;

public class Main {
    public static void main(String[] args) {



        ListaLigada<smartPhone> lista = new ListaLigada<>();
        lista.insertarAlInicio(new smartPhone("Xiaomi",2022,4,128,"Azul"));
        lista.agregarAlFinal(new smartPhone("Motorola",2023,4,128,"Rosa"));
        lista.agregarAlFinal(new smartPhone("LG",2016,2,32,"Blanco"));
        lista.agregarAlFinal(new smartPhone("Huawei",2017,4,64,"Amarillo"));
        lista.agregarAlFinal(new smartPhone("Xiaomi",2022,8,256,"Cafe"));
        lista.transversal();


        lista.eliminar(1);
        lista.transversal();

        lista.actualizar(1,new smartPhone("Poco",2022,8,256,"Rojo"));
        lista.transversal();
        lista.insertarAlInicio(new smartPhone("Vivo",2022,6,256,"Azul"));
        lista.agregarAlFinal(new smartPhone("Realme",2019,4,128,"Rosa"));
        lista.transversal();
        lista.eliminar(0);
        lista.transversal();












    }
}