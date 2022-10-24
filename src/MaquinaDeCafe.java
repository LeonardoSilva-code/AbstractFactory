package src;

public class MaquinaDeCafe extends MaquinaDeBebida{

    @Override
    public Bebida entregaBebida() {
        return new Cafe();
    }
}
