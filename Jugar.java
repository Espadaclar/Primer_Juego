
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author franciscoJavier
 * @version (10 / junio / 2017)
 */
public class Jugar
{
    static int opcion; 
    static int  numPersonas;
    static int  indicePersonas;
    static ArrayList<Persona> personas;
    static Persona person;
    public static void main(String[] args) {
        // instance variables - replace the example below with your own
        int numPersonas;

        Enunciado enunciado;
        
        boolean oky;
        int numMenu;

        char resp;

        numPersonas = 3;
        personas = new ArrayList<>();

        //pide datos por teclado.
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Si quieres jugar, marca 's' \n"
                + " Si no marca 'n'.");
            resp = teclado.next().charAt(0);
        } while (resp != 's' && resp != 'n');

        if (resp == 's') {

            do {
                enunciado = new Enunciado();
                enunciado.getEnunciado();//--------- información sobre el juego
                System.out.println("");
                System.out.println("Elige número de personas? entre 3 y 12");
                numPersonas = teclado.nextInt();
                for(int i = 0; i < numPersonas; i ++){// ------crea el grupo de personas dentro del ArrayList.
                     person = new Persona();
                    personas.add(person);
                }
            } while (numPersonas < 3 || numPersonas > 12);
            
            ZmostrarPersonas();
            
            do {
                System.out.println("");
            System.out.println("Elige a una persona para preguntar ( marca nº de índice)");
                indicePersonas = teclado.nextInt();
                System.out.println("Ya puedes preguntar a: " +personas.get(indicePersonas).getNombre());
            } while (indicePersonas <= 0 || indicePersonas > (personas.size() -1));
            //pide datos por teclado.
            opcion = teclado.nextInt(); 

            menuDelJuego();


            if (resp == 's') { 
                do {
                    System.out.println("");
                    menuDelJuego();
                    numMenu = teclado.nextInt();
                } while (numMenu <= 1 || numMenu > 12);
            }

            opcion = teclado.nextInt();
            oky = false;
        }
    }

    public static void  menuDelJuego()
    {
        ZmostrarMenu();
        System.out.println("Introduce el nº de la opción eledida: "); 

        while(opcion != 666){
            ZmostrarMenu();
            if(opcion == 1 ){
                ZmostrarPersonas();

            }
            else if(opcion == 2){
                int num = 0;
                elegirPersona( num);
            }

            System.out.println();

        }
    }

    ////////////////////////////////////////////////
    //////////////////////////////////////////////////////////

    public static void ZmostrarPersonas(){
        System.out.println("   -------------- Nombres.");
        
        for(int i = 0; i < personas.size(); i ++){
            System.out.println(i+ ". " +personas.get(i).getNombre());
        }
    }

    public static void elegirPersona(int num){
        boolean encontrado = false;
        int cont = 0;
        while(cont < personas.size() && encontrado == false){
            if(num >= 0 && num < personas.size() ){
                System.out.println(".- " +personas.get(num).getNombre());
                encontrado = true;
            }
            cont ++;
        }
    }

    public static void ZmostrarMenu(){
        System.out.println("============== MENÚ DE OPCIONES. ================= ");
        System.out.println("   1. Ver nombre de personas ");
        System.out.println("   2. Elegir persona. (teclee nombre).");
        System.out.println("   3. Consultar libro(por temática)");
        System.out.println("   4. Número de libros por temática");
        System.out.println("   5. Total de libros en la biblioteca");
        System.out.println("   6. Total de ejemplares");
        System.out.println("   7. Datos completos de un libro dando su referencia");
        System.out.println("   8. Libros editados en el año actual");
        System.out.println("   9. Salir");
        System.out.println(" ");
    }
}

