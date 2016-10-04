/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.menu;

/**
 *
 * @author Alumno
 */
public class FPMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
System.out.println("La opcion elegida es: " +  menu());    
    }
    public static int menu(){
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do{
        System.out.println("**** Calculo de areas ****");
        System.out.println("**** Menu ****");
        System.out.println("1. Area de cuadrados");
        System.out.println("2. Area de circulos");
        System.out.println("3. Area de triangulos");
        System.out.println("0. Salir");
        System.out.print("Introdusca la opcion deseada: ");
        opcion = entrada.nextInt();
        }while(opcion<0 || opcion>3);
        return opcion;
    }
    public static float calcularArea(int op){
        float area;
        switch (op){
            case 1:
                area = areaCuadrado();
                break;
            case 2:
                area = areaCirculo();
                break;
            case 3:
                area = areaTriangulo();
                break;
            default:
                mensajeSalida();
        }
    public static double solicitarDatos(String tipo){
        double dato;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Eliga una opcion a calcular " + tipo + " : ");
        dato = entrada.nextDouble();
        return dato;
    }
        if ("opcion".equals(1)){
            
            public static float areaCuadrado(){
                float area;
                double a;
                a = solicitarDatos("Solicitar el lado del cuadrado");
                area = (float) Math.pow(a, 2);
                return area;
        }
        if ("opcion".equals(2)){   
            public static float areaCirculo(){
            float area;
            double r;
            final double pi;
            pi = 3.14;
            r = solicitarDatos("Presentar el Radio porfavor");
            area = (float) (pi*Math.pow(r, 2));
            return area;
            }
         if ("opcion".equals(3)){
             public static float areaTriangulo(){
            float area;
            double b,h ;
            b = SolicitarDatos("Presentar la base del trianfgulo")
            h = SolicitarDatos("muestra la altura del triangulo")
            area = ((b*h)/2)
            return area;
    }
}

