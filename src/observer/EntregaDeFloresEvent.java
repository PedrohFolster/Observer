package observer;

import java.util.Date;

public class EntregaDeFloresEvent {

    private final Date horaDaEntrega;

    public EntregaDeFloresEvent(Date horaDaEntrega) {
        this.horaDaEntrega = horaDaEntrega;
    }

    public Date getHoraDaEntrega() {
        return horaDaEntrega;
    }
}
