/*
 * SE 1011-061
 * Fall 2017
 * File purpose: This contains the Nut Class
 * Name: lindertcm
 * Created: 12/14/2017
 */

import java.text.DecimalFormat;

/**
 * SE 1011-061 2017
 * Purpose: The base construction for a nut
 *
 * @author lindertcm
 * @version 1.0 Created on 12/14/2017 on 3:14 PM.
 */
public class Nut implements Part{
    private double diameterInches;
    public static final double LBS_MULTIPLIER = 0.01;
    public static final double USD_MULTIPLIER = 0.5;
    private DecimalFormat costFormat = new DecimalFormat("$0.00");
    private DecimalFormat weightFormat = new DecimalFormat("0.###");

    /**
     * Returns the cost of the nut
     * @return cost of the nut
     */
    public double getCost(){
        return USD_MULTIPLIER * diameterInches * diameterInches;
    }

    /**
     * Returns the name of the nut
     * @return name of the nut
     */
    public String getName(){
        return diameterInches + "inch nut";
    }

    /**
     * Returns the weight of the nut
     * @return weight of the nut
     */
    public double getWeight(){
        return LBS_MULTIPLIER * diameterInches * diameterInches;
    }

    /**
     * Default Constructor
     * @param diameterInches
     */
    public Nut(double diameterInches){
        this.diameterInches = diameterInches;
    }

    /**
     * Prints the output for a nut
     */
    public void printBillOfMaterials(){
        System.out.println("==========================");
        System.out.println(getName());
        System.out.println("==========================");
        System.out.println("Diameter: " + diameterInches + " inches");
        System.out.println("Cost: " + costFormat.format(getCost()));
        System.out.println("Weight: " + weightFormat.format(getWeight()) + " lbs");
        System.out.println("");
    }

}