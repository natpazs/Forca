import javax.management.StringValueExp;
import java.util.Random;

public class Classe {

    public Classe(){

    }
    Random gerar = new Random();
    String[] animais = {"AAA","B","CC"};

    public String sortear(){
        int indiceAleatorio = gerar.nextInt(animais.length);
        String animalSorteado = animais[indiceAleatorio];
        return animalSorteado;
    }




}
