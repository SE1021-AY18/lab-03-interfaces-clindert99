/*
 * SE 1011-061
 * Fall 2017
 * File purpose: This contains the SheetMetal Class
 * Name: lindertcm
 * Created: 12/14/2017
 */

import java.text.DecimalFormat;

/**
 * SE 1011-061 2017
 * Purpose: The base construction for a sheet
 *
 * @author lindertcm
 * @version 1.0 Created on 12/14/2017 on 3:14 PM.
 */
public class SheetMetal implements Part{
    public static final double LBS_MULTIPLIER = 0.1;
    private double lengthInches;
    private double thicknessInches;
    public static final double USD_MULTIPLIER = 0.50;
    private double widthInches;
    private DecimalFormat costFormat = new DecimalFormat("$0.00");
    private DecimalFormat weightFormat = new DecimalFormat("0.###");


    /**
     * Returns the cost of a sheet
     * @return cost of a sheet
     */
    public double getCost(){
        return USD_MULTIPLIER * thicknessInches * widthInches * lengthInches;
    }

    /**
     * Returns the name of a sheet
     * @return name of a sheet
     */
    public String getName(){
        return lengthInches + "x" + widthInches + "x" + thicknessInches + "sheet";
    }

    /**
     * Returns the weight of a sheet
     * @return weight of a sheet
     */
    public double getWeight(){
        return LBS_MULTIPLIER * thicknessInches * widthInches * lengthInches;
    }

    /**
     *  Prints the output for a sheet
     */
    public void printBillOfMaterials(){
        System.out.println("==========================");
        System.out.println(getName());
        System.out.println("==========================");
        System.out.println("Length: " + lengthInches + " inches");
        System.out.println("Width: " + widthInches + " inches");
        System.out.println("Thickness " + thicknessInches + " inches");
        System.out.println("Cost: " + costFormat.format(getCost()));
        System.out.println("Weight: " + weightFormat.format(getWeight()) + " lbs");
        System.out.println("");
    }

    /**
     * Default constructor
     * @param lengthInches
     * @param widthInches
     * @param thicknessInches
     */
    public SheetMetal(double lengthInches, double widthInches, double thicknessInches){
        this.lengthInches = lengthInches;
        this.widthInches = widthInches;
        this.thicknessInches = thicknessInches;
    }

}

