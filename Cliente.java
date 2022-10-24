public class Cliente {

    public static void main(String[] args) {

        AbstractFactory factory = CreateFactory.getFactory();

        MaquinaDeBebida maquinaA;
        MaquinaDeBebida maquinaB;

        maquinaA = factory.createMaquinaDeBebida("cafe");
        maquinaB = factory.createMaquinaDeBebida("refrigerante");

        maquinaA.entregaBebida();
        maquinaB.entregaBebida();
    }
}
