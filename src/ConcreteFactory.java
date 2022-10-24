package src;

public class ConcreteFactory extends AbstractFactory{

    @Override
    MaquinaDeBebida createMaquinaDeBebida(String tipoDeMaquina) {
        MaquinaDeBebida maquinaDeBebida = null;
        switch (tipoDeMaquina.toUpperCase()){
            case "CAFE":
                maquinaDeBebida = new MaquinaDeCafe();
                break;
            case "REFRIGERANTE":
                maquinaDeBebida = new MaquinaDeRefrigerante();
                break;
        }
        return maquinaDeBebida;
    }
}
