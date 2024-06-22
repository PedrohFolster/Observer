package observer;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Entregador extends Thread {

    private List<EntregaDeFloresObserver> observers = new ArrayList<EntregaDeFloresObserver>();

    public void addEntregaDeFloresObserver(EntregaDeFloresObserver observer)  {
        this.observers.add(observer);
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite 1 para simular a chegada do entregador de flores:");
            int valor = scanner.nextInt();

            if (valor == 1) {
                EntregaDeFloresEvent event = new EntregaDeFloresEvent(new Date());

                for(EntregaDeFloresObserver observer: this.observers) {
                    observer.chegou(event);
                }
            } else {
                System.out.println("Nenhuma entrega no momento.");
            }
        }
    }

}
