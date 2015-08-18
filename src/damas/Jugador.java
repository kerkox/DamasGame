
package damas;

/**
 *
 * @author KerKox
 */
public class Jugador {
    //aqui se define la ficha del jugador
    char ficha;
    int CantFichas =12;

    public Jugador(char ficha) {
        this.ficha = ficha;
    }

    public char getFicha() {
        return ficha;
    }
    
    public void FichaLost(){
        CantFichas--;
    }
    
    
    
}
