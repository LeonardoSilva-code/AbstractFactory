package src;

public class MaquinaDeRefrigerante extends MaquinaDeBebida{

    @Override
    public Bebida entregaBebida() {
        return new Refrigerante();
    }
}
