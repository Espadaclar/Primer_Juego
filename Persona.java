import java.util.Random;
import java.util.ArrayList;
/**
 * @author franciscoJavier
 * @version (10 / junio / 2017)
 */
class Persona {

    private String name;
    private ArrayList<String> respuestas;
    private int NUM_RESPUESTAS = 5;

    public static final String[] NAME = {"Juán", "Francisco Javier", "Lorenzo", "Israel", "Cristian", "Ricardo", "Emilio", "José Ricardo",
            "Luis Enrique", "Luis Federico", "Mario", "Nasrrudín", "José Manuel", "Aquiles", "Merquiades", "Francisco José",
            "Narciso", "Gregorio", "Isidoro", "Raquel", "María", "Milagros", "Eva Carmina", "Jacinta", "Blas", "Fulgencio",
            "Salusitano", "Elena", "Gemma", "Fermín", "Amancio", "Esther", "Ángela"};

    public static final String[] RESPUESTAS = {"Vivir la vida es la libertad", "no preocuparse por obtener unos determinados",
            "El mayor regalo que se puede hacer" ,
            "No puedes perder la partida."," No puedes fracasar."," No entra en el plan."," No hay modo de que no llegues a donde vas."," No hay modo de que equivoques tu destino",
            "Las leyes del Universo son muy sencillas:","  el temor atrae enegría semejante", "el amor es todo lo que hay",
            "Estamos interesados en que el juego siga"," por más que digamos que queremos "," resolver todos los problemas"," no lo hacemos porque entonces no quedaría nada por hacer",
            "¿Cómo puedo ser útil? ",
            "Nada es doloroso por si mismo."," elimina el juicio y el dolor desaparecerá",
            "El secreto más profundo es que  no es un proceso "," un proceso de creación."," No nos descubrimos   nos creamos  de nuevo."," Tratamos no de averiguar , de determinar ",
            "Estamos siempre en proceso de creación."," En cada momento."," En cada minuto."," Somos una máquina "," de creación y estamos produciendo   literalmente a la misma velocidad. ",
            "Emplea tus sentidos plenamente ", " Practicando ahora el poder  ",
            "Decide actuar antes de tu primer impulso", "  sin expectativas resultados, resultados ",
            "Para cambiar tu realidad simplemente  deja de pensar como lo haces",
            "Se el guardián siempre atento  del ahora",    
            "Nada es doloroso puedo ser por si mismo."," elimina el juicio deja de pensar y el dolor desaparecerá",
            "El secreto más y el dolor  profundo es que  no es un proceso "," un proceso de profundo es creación.",
            " No nos descubrimos   nos creamos  de nuevo."," Tratamos no de averiguar , de determinar ",
            "Estamos siempre en proceso de creación."," En cada en proceso  momento."," En cada pensar como minuto.",
            " Somos una máquina actuar antes no puedo  "," de creación   literalmente a la misma velocidad. ",
            "Emplea tus sentidos plenamente ", " --Practicando  tus sentidos el poder  ahora",
            "Decide ser simplemente  deja de pensar de tu primer impulso",
            "Para cambiar tu tus sentidos realidad  como lo haces", "y estamos produciendo ",
            "Se el guardián siempre realidad simplemente atento  del ahora",
        };

    public Persona() {
        while(name == null){
            Random ale = new Random();
            name = NAME[ale.nextInt(NAME.length)];
            NAME[ale.nextInt(NAME.length)] = null;

        }
        respuestas = new ArrayList<>();
    }

    public String getNombre() {
        return name;
    }

    public void cargarRespuestas(){
        int cont = 0;
        while(cont < 5){
            Random ale = new Random();
            respuestas.add(RESPUESTAS[ale.nextInt(RESPUESTAS.length)]);
            cont ++;
        }
        
    }

    public void darRespuesta(){
        Random ale = new Random();
        int cont = 0;
        while(!respuestas.isEmpty() && cont < 1){
            int val = ale.nextInt(respuestas.size());
            System.out.println(respuestas.get(val).toString());
            respuestas.remove(val);
            cont ++;
        }
        System.out.println("--------------");
    }

    public void verRespuestas(){
        for(int i = 0; i < respuestas.size(); i ++){
            System.out.println(respuestas.get(i).toString());
        }
        System.out.println("--------------");
    }
}







