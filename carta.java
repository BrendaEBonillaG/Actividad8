import java.util.Random;

public class Deck {


    private Object carta;

    public static void main (String[] args){


        int[] carta = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8,
                9, 10, 11, 12, 13, 14, 15,
                16, 17, 18, 19, 20, 21, 22,
                23, 24, 25, 26, 27, 28, 29,
                30, 31, 32, 33, 34, 35, 36,
                37, 38, 39, 40, 41, 42, 43,
                44, 45, 46, 47, 48, 49, 50,
                51};

        getShuffle(carta, 52);
        // Imprimir todos los elementos barajados de las cartas
        for (int i = 0; i < 52; i ++)
            System.out.print(carta+" ");

    }
    int cartas[]  = new int[52];

    //método para barajar cartas.

    public static int getShuffle(int[] carta, int n) {
        Random rand = new Random();
        for (int i = 0; 1 < n; i++){
            int r = i + rand.nextInt(52 - i);
            // Se cambian los elementos:
            int temp = carta;
            carta = carta;
            carta = temp;
            System.out.println("Se mezcló el Deck");
        }
        int shuffle ;
        System.out.println("Se mezcló el Deck");
        return shuffle = 0;
    }

    //Método para mostrar la primera carta.

    public  int[] getHead() {
        System.out.println("La carta es: " + carta[0]);
        carta.remove(0); //Se elimina del maso.
        return (int[]) carta;
    }

    //Método para elegir una carta al azar.

    public int getPick() {
        Random rand = new Random();
        int r = rand.nextInt(52 );
        System.out.println("la carta es:" + r + "Quedan:" + carta + "cartas." );
        r.remove;
        return r;
    }

    //Método para mostrar 5 cartas.

    public int[] getHand() {
        System.out.println("Las cartas son:" + carta[1, 2, 3, 4, 5]);
        carta.remove(1, 2, 3, 4, 5);
        return (int[]) carta;
    }

}
public class carta {
    String numeros [] = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    String palo [] = {"Espada", "Corazón", "Trebol", "Rombo"};
    String color [] = {"Rojo", "Negro"};
    String bajara [][][] = new String[numeros.length][palo.length][color.length];

    for (int i = 0; i < palo.length; i++){
        for (int j=0; j < numeros.length; j++){
            for (int j = 0; j <color.length; j++) {

                baraja[j][i][j] =numeros[j];
            }
        }
    }
    public void getCarta(){
        for (int i = 0; i < palo.length; i++){
            for (int j = 0; j < numeros.length; j++){
                for (int j = 0; j< color.length; j++){
                    System.out.println(numeros[j] + "de" + palo[i] + "color" + [j]);
                    public void  getCarta(numeros[arg0] + "de" + palo[arg1] + "color" + color[arg3]);
                }
            }
        }
    }

}
