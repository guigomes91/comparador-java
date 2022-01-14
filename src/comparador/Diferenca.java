package comparador;

/**
 *
 * @author Guilherme Gomes
 */
class Diferenca {
    
    private final String propriedade;
    private final Object valorNovo;
    private final Object valorVelho;

    public Diferenca(String propriedade, Object valorNovo, Object valorVelho) {
        this.propriedade = propriedade;
        this.valorNovo = valorNovo;
        this.valorVelho = valorVelho;
    }

    @Override
    public String toString() {
        return "Diferenca{" + "propriedade=" + propriedade + ", valorNovo=" + valorNovo + ", valorVelho=" + valorVelho + '}';
    }
}
