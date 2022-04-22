package gameoop;

/**
 *
 * @author amand
 */
public class Magician extends GameUtil {

    public Magician() {
        name = "Mago";
        life = 50;
        attack = 25;
        defense = 15;
        hr = 0.75;
    }

    @Override
    public void esquivarAtaque() {
        System.out.println(this.name + " uso su varita magica y logro desviaar el ataque!!"); 
    }

}
