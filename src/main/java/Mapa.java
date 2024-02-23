import java.util.Random;

public class Mapa {

    private Cor[][] mapaCheio;


    public Mapa(){
        Cor [][] mapaVazio = new Cor[4][4];
        mapaCheio = popularMapa(mapaVazio);

    }


    private Cor[][] popularMapa(Cor[][] mapaVazio){

        for (int i = 0; i < mapaVazio.length; i++){
            for(int j = 0; j < mapaVazio.length;j++){
                mapaVazio[i][j] = randomizaCor();
            }
        }

        return mapaVazio;

    }


    private Cor randomizaCor(){
        Cor[] listaDeCores = new Cor[4];
        Random random = new Random();
        Cor azul = new Cor("azul");
        Cor amarelo = new Cor("amarelo");
        Cor verde = new Cor("verde");
        Cor vermelho = new Cor("vermelho");

        listaDeCores[0] = azul;
        listaDeCores[1] = amarelo;
        listaDeCores[2] = verde;
        listaDeCores[3] = vermelho;


        return listaDeCores[random.nextInt(4)];
    }

    public Cor[][] getMapaCheio() {
        return mapaCheio;
    }
}
