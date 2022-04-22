package gameoop;

/**
 *
 * @author amand
 */
public class Soldier extends GameUtil{
    public Soldier()
    {
        name = "Guerrero";
        life = 100;
        attack =10;
        defense =12;
        hr=0.7;
    }

    @Override
    public void esquivarAtaque() {
        System.out.println(this.name+" realizo un salto y escapo!"); 
    }
    
}
