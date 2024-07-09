package observer;

public class EntregaDeFlores {

    public static void main(String[] args) {
        ReceptorDeFlores receptor = new ReceptorDeFlores();
        Entregador entregador = new Entregador();

        entregador.addEntregaDeFloresObserver(receptor);

        while (true) {
            entregador.simularEntrega();
        }
    }
}
