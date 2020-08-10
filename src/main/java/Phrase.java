import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Phrase {
    public static void main(String[] args) {
        String frase = "pepe_pecas_pica_papas_con_un_pico";
        String[] parte1;
        String[] parte2;

        parte1 = frase.substring(0,15).split("_");
        parte2 = frase.substring(16,frase.length()).split("_");

        List<String> list1 = Arrays.asList(parte1);
        List<String> list2 = Arrays.asList(parte2);

        for(int x = parte1.length-1; x>=0; x--){
            System.out.println(parte1[x]);
        }
        Collections.reverse(list1);
        Collections.reverse(list2);

        System.out.println(parte1.length+ " "+String.join("_",parte1));
        System.out.println(parte2.length+ " "+String.join("_",parte2));
    }
}
