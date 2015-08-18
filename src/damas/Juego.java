package damas;

/**
 *
 * @author KerKox 
 * Esta Clase sera la que contendra la logica del juego
 */
public class Juego {

    public char[][] tablero;
    Jugador j1;
    Jugador j2;

    public Movimiento mov;

    public Juego(int ancho, int largo) {

        //aqui se definen en blanco todas las casillas
        this.tablero = new char[ancho][largo];
        boolean white=true;
        for (int x = 0; x < ancho; x++) {
            for (int y = 0; y < largo; y++) {
                if(white){
                this.tablero[x][y] = 'w';    //white casilla blanca
                }else{
                this.tablero[x][y] = 'b';    //black casilla negra
                }

            }

        }

    }

    /**
     *
     * @param j1 Jugador 1
     * @param j2 Jugador 2 Aqui se inicializa el juego posicionando las fichas
     * de cada jugador
     */
    public void inicio(Jugador j1, Jugador j2) {

        //Primero se colocan las fichas del jugador 1 en el orden correcto
        /*
         0 j 0 j 0 j 0 j
         j 0 j 0 j 0 j 0
         0 j 0 j 0 j 0 j
         0 0 0 0 0 0 0 0
         0 0 0 0 0 0 0 0
         j 0 j 0 j 0 j 0
         0 j 0 j 0 j 0 j
         j 0 j 0 j 0 j 0
        
         */
        boolean put = false;
        char f1 = j1.getFicha();
        char f2 = j2.getFicha();
        int y = 0;
        int x;
        // Posicionando las fichas de jugador 1
        for (x = 0; x < 3; x++) {

            if (x % 2 == 0) {
                put = false;
            }
            for (y = 0; y < 8; y++) {
                if (put) {
                    this.tablero[x][y] = f1;
                    put = false;
                } else {
                    put = true;
                }

            }
            put = true;

        }

        //posicionando las fichas del jugador 2
        put = true; // para al iniciar coloque la ficha invertido al otro jugador
        x = 5; // fila donde debe de colocar las fichas
        for (x = 5; x < 8; x++) {

            if (x % 2 == 0) {
                put = false;
            }
            for (y = 0; y < 8; y++) {
                if (put) {
                    this.tablero[x][y] = f2;
                    put = false;
                } else {
                    put = true;
                }

            }
            put = true;

        }

    }

    public String showTablero() {
        String tab = "";
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                tab += this.tablero[x][y] + " ";

            }
            tab += "\n";

        }

        return tab;
    }

}
