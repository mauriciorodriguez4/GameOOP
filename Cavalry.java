package gameoop;

/**
 *
 * @author amand
 */
public class Cavalry extends GameUtil{
    public Cavalry()
    {
        name = "Caballero";
        life = 80;
        attack =15;
        defense =12;
        hr=0.75;
    }

    @Override
    public void esquivarAtaque() {
        System.out.println(this.name +" se inclino y escapo del ataque del oponente!!"); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
