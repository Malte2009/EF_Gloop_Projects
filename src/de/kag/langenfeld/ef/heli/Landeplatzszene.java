package de.kag.langenfeld.ef.heli;

import GLOOP.*;

public class Landeplatzszene{

    private GLKamera kamera;
    private GLLicht licht;
    private GLHimmel himmel;
    private GLBoden boden;
    private GLTastatur tastatur;

    private GLZylinder landeplatz;

    private GLKugel[] lights;

    public Landeplatzszene(){
        kamera  = new GLKamera(800, 600);
        kamera.setzePosition(0, 400, 800);
        kamera.setzeBlickpunkt(0, 0, 0);
        licht   = new GLLicht();
        himmel  = new GLHimmel("img/Himmel.jpg");
        boden   = new GLBoden("img/Gras.jpg");
        tastatur = new GLTastatur();

        //Landeplatz erstellen

        this.landeplatz = new GLZylinder(0, 0, 0, 300, 1);
        this.landeplatz.drehe(90, 0, 0);
        this.landeplatz.setzeTextur("img/Feld.jpg");

        //Lampen erstellen

        int lightAmount = 20;

        this.lights = new GLKugel[lightAmount];

        for (int i = 0; i < lightAmount; i++) {
            double x = Math.cos(2 * Math.PI / lightAmount * i) * 280;
            double z = Math.sin(2 * Math.PI / lightAmount * i) * 280;
            GLKugel light = new GLKugel(x, 5, z, 10);

            this.lights[i] = light;
        }
    }

    /*
     * Die Methode starte() führt das eigentliche Programm aus.
     * Hier wird eine Schleife durchlaufen, die abbricht, sobald
     * die Leertaste gedrückt wird.
     * Wird die Taste 1 gedrückt, so wird die Methode starteLauflichter1()
     * ausgeführt. Bei der Taste 2 wird die Methode starteLauflichter2() ausgeführt,
     * bei der Taste 3 die Methode starteBlinken().
     */
    public void starte() {
        while (!tastatur.istGedrueckt(' ')) {
            if (tastatur.istGedrueckt('1')) {
                starteLauflichter1();
            }
            if (tastatur.istGedrueckt('2')) {
                starteLauflichter2();
            }
            if (tastatur.istGedrueckt('3')) {
                starteBlinken();
            }
            Sys.warte();
        }
        Sys.beenden();
    }

    /*
     * Bei der Methode starteLauflichter1() sollen die
     * Lichter um der Helikopterlandeplatz der Reihe nach
     * erst an und dann wieder aus gehen.
     * Mit ESC soll die Methode starteLauflichter1() beendet werden.
     */
    private void starteLauflichter1(){

    }

    /*
     * Bei der Methode starteLauflichter2() sollen die
     * Lichter um der Helikopterlandeplatz der Reihe nach
     * an gehen. Geht eine Lampe an, so soll ihre Vorgängerlampe
     * automatisch wieder aus gehen, sodass immer nur eine
     * Lampe leuchtet.
     * Mit ESC soll die Methode starteLauflichter2() beendet werden.
     */
    private void starteLauflichter2(){

    }

    /*
     * Bei der Methode starteBlinken() sollen die
     * Lichter um der Helikopterlandeplatz alle gleichzeitig
     * im Wechsel an und wieder aus gehen, also blinken.
     * Mit ESC soll die Methode starteBlinken() beendet werden.
     */
    private void starteBlinken(){

    }
}