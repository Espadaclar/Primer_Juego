import java.util.Random;

/**
 * @author franciscoJavier
 * @version (10 / junio / 2017)
 */
class Persona {

    private String name;

    public static final String[] NAME = {"Juán", "Francisco Javier", "Lorenzo", "Israel", "Cristian", "Ricardo", "Emilio", "José Ricardo",
            "Luis Enrique", "Luis Federico", "Mario", "Nasrrudín", "José Manuel", "Aquiles", "Merquiades", "Francisco José",
            "Narciso", "Gregorio", "Isidoro", "Raquel", "María", "Milagros", "Eva Carmina", "Jacinta", "Blas", "Fulgencio",
            "Salusitano", "Elena", "Gemma", "Fermín", "Amancio", "Esther", "Ángela"};

    public static final String[] FRASES_MOTIVADORAS = {"Vivir la vida sin expectativas es la libertad", "no preocuparse por obtener unos resultados determinados",
            "El mayor regalo que se puede hacer" ,
            "No puedes perder la partida."," No puedes fracasar."," No entra en el plan."," No hay modo de que no llegues a donde vas."," No hay modo de que equivoques tu destino",
            "Las leyes del Universo son muy sencillas:","  el temor atrae enegría semejante", "el amor es todo lo que hay",
            "Estamos interesados en que el juego siga"," por más que digamos que queremos "," resolver todos los problemas"," no lo hacemos porque entonces no quedaría nada por hacer",
            "¿Cómo puedo ser útil? ",
            "Nada es doloroso por si mismo."," elimina el juicio y el dolor desaparecerá",
            "El secreto más profundo es que  no es un proceso "," un proceso de creación."," No nos descubrimos   nos creamos  de nuevo."," Tratamos no de averiguar , de determinar ",
            "Estamos siempre en proceso de creación."," En cada momento."," En cada minuto."," Somos una máquina "," de creación y estamos produciendo   literalmente a la misma velocidad. ",
            "Emplea tus sentidos plenamente ", " --Practicando el poder  ahora",
            "Decide actuar antes de tu primer impulso",
            "Para cambiar tu realidad simplemente  deja de pensar como lo haces",
            "Se el guardián siempre atento  del ahora",
        };

    public Persona() {
        while(name == null){
            Random ale = new Random();
            name = NAME[ale.nextInt(NAME.length)];
            NAME[ale.nextInt(NAME.length)] = null;

        }

    }

    public String getNombre() {
        return name;
    }
    
    public void holaQueHayComoEstamos(){
    
    }
}














