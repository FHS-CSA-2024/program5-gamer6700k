

//Your code here
public class Program5 {
    public static void main(String[] args) {

        int royaleMiles = 286;
        int royaleGallons = 9;
        int royaleMPG = 0;
        int koopakingMiles = 412;
        int koopakingGallons = 40;
        int koopakingMPG = 0;
        int pipeframeMiles = 361;
        int pipeframeGallons = 18;
        int pipeframeMPG = 0;
        int badwagonMiles = 161;
        int badwagonGallons = 11;
        int badwagonMPG = 0;

        System.out.println("Mushroom Cup Prix Racer Average Miles/Per Gallon: \n");

        double mpg = (double) royaleMiles/royaleGallons;
        mpg = mpg * 10;
        mpg = Math.round(mpg);
        mpg = mpg/10;
        System.out.println("Royale averaged " + mpg + " m/g \n");


        mpg = (double) koopakingMiles/koopakingGallons;
        mpg = mpg * 10;
        mpg = Math.round(mpg);
        mpg = mpg/10;
        System.out.println("Koopaking averaged " + mpg + "m/g \n");


        mpg = (double) pipeframeMiles/pipeframeGallons;
        mpg = mpg * 10;
        mpg = Math.round(mpg);
        mpg = mpg/10;
        System.out.println("Pipeframe averaged " + mpg + "m/g \n");


        mpg = (double) badwagonMiles/badwagonGallons;
        mpg = mpg * 10;
        mpg = Math.round(mpg);
        mpg = mpg/10;
        System.out.println("Badwagon averaged " + mpg + "m/g \n");






    }





}
//Paste console output below:
/*
Mushroom Cup Prix Racer Average Miles/Per Gallon:

Royale averaged 31.8 m/g

Koopaking averaged 10.3m/g

Pipeframe averaged 20.1m/g

Badwagon averaged 14.6m/g

 */
