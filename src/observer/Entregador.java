package observer;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Entregador {

    private List<EntregaDeFloresObserver> observers = new ArrayList<>();

    public void addEntregaDeFloresObserver(EntregaDeFloresObserver observer) {
        this.observers.add(observer);
    }

    public void simularEntrega() {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("Digite 1 para simular a chegada do entregador de flores: ");
        int valor = scanner.nextInt();

        if (valor == 1) {
            EntregaDeFloresEvent event = new EntregaDeFloresEvent(new Date());

            for (EntregaDeFloresObserver observer : this.observers) {
                observer.chegou(event);
            }
        } else {
            System.out.println("Nenhuma entrega no momento.");
        }
    }
}
