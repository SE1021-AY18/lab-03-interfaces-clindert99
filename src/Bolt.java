/*
 * SE 1011-061
 * Fall 2017
 * File purpose: This contains the Bolt Class
 * Name: lindertcm
 * Created: 12/14/2017
 */

import java.text.DecimalFormat;

/**
 * SE 1011-061 2017
 * Purpose: The base construction for a bolt
 *
 * @author lindertcm
 * @version 1.0 Created on 12/14/2017 on 3:14 PM.
 */
public class Bolt implements Part{
    private double diameterInches;
    public static final double LBS_MULTIPLIER = 0.05;
    private double lengthInches;
    public static final double USD_MULTIPLIER = 1.00;
    private DecimalFormat costFormat = new DecimalFormat("$0.00");
    private DecimalFormat weightFormat = new DecimalFormat("0.###");

    /**
     * Default Constructor
     * @param diameterInches
     * @param lengthInches
     */
    public Bolt(double diameterInches, double lengthInches){
        this.diameterInches = diameterInches;
        this.lengthInches = lengthInches;
    }

    /**
     * Returns the cost of the bolt
     * @return cost of the bolt
     */
    public double getCost(){
        return USD_MULTIPLIER * diameterInches * lengthInches;
    }

    /**
     * Returns the name of the bolt
     * @return name of the bolt
     */
    public String getName(){
        return diameterInches + "x" + lengthInches + "bolt";
    }

    /**
     * Returns the weight of the bolt
     * @return weight of the bolt
     */
    public double getWeight(){
        return LBS_MULTIPLIER * (diameterInches * diameterInches * lengthInches);
    }

    /**
     * Prints the output for a bolt
     */
    public void printBillOfMaterials(){
        System.out.println("==========================");
        System.out.println(getName());
        System.out.println("==========================");
        System.out.println("Diameter: " + diameterInches + " inches");
        System.out.println("Length: " + lengthInches + " inches");
        System.out.println("Cost: " + costFormat.format(getCost()));
        System.out.println("Weight: " + weightFormat.format(getWeight()) + " lbs");
        System.out.println("");
    }
}