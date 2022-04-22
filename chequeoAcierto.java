package gameoop;

import java.util.Random;

/**
 *
 * @author MauriRod
 */
public class chequeoAcierto {
    // maneja la tasa de aciertos entre los ataques
    public static boolean tasaAciertos(double hr)
    {
        Random w = new Random();
        int rndA = w.nextInt(100);
        boolean flag =(rndA< (int)(hr*100));
        return flag;
    }
}
