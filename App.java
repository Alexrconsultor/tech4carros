import model.Carro;

public class App {
    public static void main(String[] args) {
        
        Carro gol = new Carro();

        gol.setPlaca("ASBB234");
        gol.setNumChassi(1234);

        System.out.printf("Carro contém a placa %s e o número do chassi %d",  gol.getPlaca(),gol.getNumChassi());

        

    }
}