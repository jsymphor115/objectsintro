package p1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // array of balloons
        Balloon[] thing = new Balloon[5];

        // built a first balloon
        thing[0] = new Balloon();


        // built a balloon objects
        thing[1] = new Balloon(12, "white");

        // built a balloon objects
        thing[2] = new Balloon(6, "yellow");
        // print a number of balloons made today
        System.out.printf("Number of balloons made = %d%n ", Balloon.getQuantity());

        for(Balloon each : thing)
        // Show the balloon characteristics
        if (each != null) {
            System.out.printf("size = %d inches, color = %s%n",
                    each.getSize(), each.getColor());
        }

    }

}

class Balloon {

   private int size;
    private String color ;
   private static int quantity = 0;

    Balloon(){
        size = 10;
        color = "blue";
        quantity++;
    }

    Balloon(int arg1, String arg2)
    {
        size = arg1;
        color = arg2;
        quantity++;
    }

    // method return color
    String getColor()
    {
        return color;
    }

    // method return size
    int getSize()
    {
        return size;
    }

    static int getQuantity()
    {
        return quantity;
    }
}