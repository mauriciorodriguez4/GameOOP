package gameoop;

/**
 *
 * @author MauriRod
 */
public class GamePVP {

    public static void Start(String battle) {
        //Variables inicializadas para la creación de personajes
        Soldier solado = new Soldier();
        Cavalry caballero = new Cavalry();
        Magician mago = new Magician();
        Computadora computadora = new Computadora();

        //Acá se encuentran cada una de las batallas de los personajes
        switch (battle) {
            case "AD": {
                System.out.println("");
                System.out.println("Guerrero vs Computadora");
                int num = 0;
                while (computadora.EstadoVida() && solado.EstadoVida()) {
                    num++;
                    System.out.println("Ronda #" + num);
                    if (chequeoAcierto.tasaAciertos(solado.getHr())) {
                        computadora.danhoRecibido(solado.getAttack());
                    } else {
                        computadora.esquivarAtaque();
                    }

                    if (chequeoAcierto.tasaAciertos(computadora.getHr())) {
                        solado.danhoRecibido(computadora.getAttack());
                    } else {
                        solado.esquivarAtaque();
                    }
                }
                break;
            }

            case "BD": {
                System.out.println("");
                System.out.println("Caballero vs Computadora");
                int num = 0;
                while (computadora.EstadoVida() && caballero.EstadoVida()) {
                    num++;
                    System.out.println("Ronda #" + num);
                    if (chequeoAcierto.tasaAciertos(caballero.getHr())) {
                        computadora.danhoRecibido(caballero.getAttack());
                    } else {
                        computadora.esquivarAtaque();
                    }

                    if (chequeoAcierto.tasaAciertos(computadora.getHr())) {
                        caballero.danhoRecibido(computadora.getAttack());
                    } else {
                        caballero.esquivarAtaque();
                    }
                }
                break;
            }

            case "CD": {
                System.out.println("");
                System.out.println("Mago vs Computadora");
                int num = 0;
                while (computadora.EstadoVida() && mago.EstadoVida()) {
                    num++;
                    System.out.println("Ronda #" + num);
                    if (chequeoAcierto.tasaAciertos(mago.getHr())) {
                        computadora.danhoRecibido(mago.getAttack());
                    } else {
                        computadora.esquivarAtaque();
                    }

                    if (chequeoAcierto.tasaAciertos(computadora.getHr())) {
                        mago.danhoRecibido(computadora.getAttack());
                    } else {
                        mago.esquivarAtaque();
                    }
                }
                break;
            }

            case "BA": {
                System.out.println("");
                System.out.println("Caballero vs Guerrero");
                int num = 0;
                while (solado.EstadoVida() && caballero.EstadoVida()) {
                    num++;
                    System.out.println("Ronda #" + num);
                    if (chequeoAcierto.tasaAciertos(caballero.getHr())) {
                        solado.danhoRecibido(caballero.getAttack());
                    } else {
                        solado.esquivarAtaque();
                    }

                    if (chequeoAcierto.tasaAciertos(solado.getHr())) {
                        caballero.danhoRecibido(solado.getAttack());
                    } else {
                        caballero.esquivarAtaque();
                    }
                }
                break;
            }

            case "CA": {
                System.out.println("");
                System.out.println("Mago vs Guerrero");
                int num = 0;
                while (solado.EstadoVida() && mago.EstadoVida()) {
                    num++;
                    System.out.println("Ronda #" + num);
                    if (chequeoAcierto.tasaAciertos(mago.getHr())) {
                        solado.danhoRecibido(mago.getAttack());
                    } else {
                        solado.esquivarAtaque();
                    }

                    if (chequeoAcierto.tasaAciertos(solado.getHr())) {
                        mago.danhoRecibido(solado.getAttack());
                    } else {
                        mago.esquivarAtaque();
                    }
                }
                break;
            }

            case "AB": {
                System.out.println("");
                System.out.println("Guerrero vs Caballero");
                int num = 0;
                while (caballero.EstadoVida() && solado.EstadoVida()) {
                    num++;
                    System.out.println("Ronda #" + num);
                    if (chequeoAcierto.tasaAciertos(solado.getHr())) {
                        caballero.danhoRecibido(solado.getAttack());
                    } else {
                        caballero.esquivarAtaque();
                    }

                    if (chequeoAcierto.tasaAciertos(caballero.getHr())) {
                        solado.danhoRecibido(caballero.getAttack());
                    } else {
                        solado.esquivarAtaque();
                    }
                }
                break;
            }

            case "CB": {
                System.out.println("");
                System.out.println("Mago vs Caballero");
                int num = 0;
                while (caballero.EstadoVida() && mago.EstadoVida()) {
                    num++;
                    System.out.println("Ronda #" + num);
                    if (chequeoAcierto.tasaAciertos(mago.getHr())) {
                        caballero.danhoRecibido(mago.getAttack());
                    } else {
                        caballero.esquivarAtaque();
                    }

                    if (chequeoAcierto.tasaAciertos(caballero.getHr())) {
                        mago.danhoRecibido(caballero.getAttack());
                    } else {
                        mago.esquivarAtaque();
                    }
                }
                break;
            }

            case "AC": {
                System.out.println("");
                System.out.println("Guerrero vs Mago");
                int num = 0;
                while (mago.EstadoVida() && solado.EstadoVida()) {
                    num++;
                    System.out.println("Ronda #" + num);
                    if (chequeoAcierto.tasaAciertos(solado.getHr())) {
                        mago.danhoRecibido(solado.getAttack());
                    } else {
                        mago.esquivarAtaque();
                    }

                    if (chequeoAcierto.tasaAciertos(mago.getHr())) {
                        solado.danhoRecibido(mago.getAttack());
                    } else {
                        solado.esquivarAtaque();
                    }
                }
                break;
            }

            case "BC": {
                System.out.println("");
                System.out.println("Caballero vs Mago");
                int num = 0;
                while (mago.EstadoVida() && caballero.EstadoVida()) {
                    num++;
                    System.out.println("Ronda #" + num);
                    if (chequeoAcierto.tasaAciertos(caballero.getHr())) {
                        mago.danhoRecibido(caballero.getAttack());
                    } else {
                        mago.esquivarAtaque();
                    }

                    if (chequeoAcierto.tasaAciertos(mago.getHr())) {
                        caballero.danhoRecibido(mago.getAttack());
                    } else {
                        caballero.esquivarAtaque();
                    }
                }
                break;
            }

        }

    }
}
