import java.util.LinkedList;
import java.util.Scanner;
public class RecorridoArray 
{
    public static void main(String[] args) 
    {
        System.out.println(E1());
        System.out.println(E2());
        System.out.println(E3());
    }
    public static String E1()
    {
        System.out.println("Ejercicio 1:");
        int[] num = new int[100];               //Declaracion del arreglo.
        for (int i = 0; i < num.length; i++)    //Ciclo for para almacenar los
        {                                       //numeros en orden ascendente.
            num[i]=i+1;                         //Insertar numeros de 1 al 100.
            System.out.println(num[i]+" ");       //Imprimir en pantalla el arreglo.
        }
        return "";
    }
    public static String E2()
    {
        System.out.println("Ejercicio 2:");
        int[] num = new int[10];                //Declaracion del arreglo.
        for (int i = 0; i < num.length; i++)    //Ciclo for para pasar por las
        {                                       //10 posiciones del arreglo.
            num[i]=(int)(Math.random()*10);     //Insertar aleatoriamente los
            System.out.print(num[i]+" ");       //numeros entre el 0 y 10.
        }
        return "";
    }
    public static String E3()
    {
        System.out.println("Ejercicio 3:");
        Scanner leer = new Scanner(System.in);  
        LinkedList arreglo = new LinkedList();  //Declarar arreglo como una lista.
        Object x;                               //Declaramos x como un objeto.
        for (int i = 0; i < 10; i++)            //Iniciamos ciclo for.
        {
            System.out.println("Inserte el elemento "+(i+1)+":");    
            x=leer.next();                      //Leemos el dato ingresado.
            arreglo.add(x);                     //Agregamos a array el dato.
        }
        System.out.println(arreglo);
        return "";
    }
}
