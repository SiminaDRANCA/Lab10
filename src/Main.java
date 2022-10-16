public class Main {
    public static void main(String[] args) {

        //Cerinta 2 Tema Lab 10//

        Calculator brain = new Calculator();
        int x = 9;
        int y = 3;


        int a = brain.sum(x, y);
        System.out.println(a);
        float b = brain.substract(x, y);
        System.out.println(b);
        float c = brain.multiplication(x, y);
        System.out.println(c);
        float d = brain.divide(x, y);
        System.out.println(d);


//Cerinta 3 Tema Lab 10//


        System.out.println("   J    a   V     V  a");
        System.out.println("   J   a a   V   V  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");


        //Cerinta 4 Tema Lab 10//

        int j = 18;
        int jj = 28;
        int jjj = 45;
        int sumj = j + jj + jjj;
        float avgj = sumj / 3;
        System.out.println(+avgj);


        // Cerinta 5 Tema Lab 10//

        System.out.println("  +'' '' '' ''+  ");
        System.out.println("[ |   o   o   | ]");
        System.out.println("  |     ^     | ");
        System.out.println("  |    '-'    | ");
        System.out.println("  +'' '' '' ''+");

        // Cerinta 6 Tema Lab 10//

        int m = 13;
        int mm = 3;
        int result = m / mm;
        int reminder = m - (result * mm);
        System.out.println(reminder);

        //Cerinta 7 Tema Lab 10//

        float farenheit = -375;
        float g = 5;
        float h = 9;
        float gh = g / h;
        float celsius = gh * (farenheit - 32);
        System.out.println(celsius);

        //Cerinta 8 Tema Lab 10//
        int inch = 800;
        double meter;
        meter = inch * 0.0254;
        System.out.println(meter);


        //Cerinta 9 Tema Lab 10//

        int distanceMeters = 150000;
        float hour = 2;
        float minutes = 15;
        float seconds = 43;
        float timeSec, mps, kph, mph;
        timeSec = (3600 * hour) + (60 * minutes) + seconds;
        mps = distanceMeters / timeSec;
        kph = (distanceMeters / 1000) / (timeSec / 3600);
        mph = kph / 1609;

        System.out.println("m/s=" + mps);
        System.out.println("km/h=" + kph);
        System.out.println("miles/hour=" + mph);

    }

    }

