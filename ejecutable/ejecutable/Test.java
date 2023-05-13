package ejecutable;

import modelo.Coordenada;

public class Test{

    public static void main(String[] args) {
        Coordenada c1 =new Coordenada();
        Coordenada c2 =new Coordenada(1.3, 5.3);
        Coordenada c3 =c1;
        Coordenada c4 =c2;

        Coordenada C1= new Coordenada(50, 7);
        System.out.println(C1);
        Coordenada C2 = new Coordenada(3, 1);
        System.out.println(C2);

        if (C1.equals(C2)){
            System.out.println("Son iguales");
            }
    
            else{
            System.out.println("Son diferentes"); 
    }
        System.out.println("---SegundoPunto--");
        System.out.println("Distancia entre coordenadas:");
        System.out.println("distancia(C1, C2) = " + C1.distancia(C2));



}
}