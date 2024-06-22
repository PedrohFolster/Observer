package observer;

public class ReceptorDeFlores implements EntregaDeFloresObserver {

    @Override
    public void chegou(EntregaDeFloresEvent event) {
        System.out.println("Recebendo as flores...");
        System.out.println("Muito obrigado! São lindas!");
    }

}
