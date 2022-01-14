package comparador;

import java.util.List;

/**
 *
 * @author Guilherme Gomes
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        Pessoa p1 = new Pessoa("Guilherme", "Gomes", 30);
        Pessoa p2 = new Pessoa("Guilherme", "Ap", 31);
        
        List<Diferenca> difs = Comparador.comparar(p1, p2);
        
        difs.forEach(System.out::println);
    }
    
}
