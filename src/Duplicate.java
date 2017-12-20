/*
 * SE 1011-061
 * Fall 2017
 * File purpose: This contains the Duplicate Class
 * Name: lindertcm
 * Created: 12/14/2017
 */

import java.text.DecimalFormat;

/**
 * SE 1011-061 2017
 * Purpose: Records duplicate parts
 *
 * @author lindertcm
 * @version 1.0 Created on 12/14/2017 on 3:14 PM.
 */
public class Duplicate implements Part{
    private DecimalFormat costFormat = new DecimalFormat("$0.00");
    private Part identicalPart;
    private int numDuplicates;
    public static final double REDUCTION_FACTOR1 = 0.95;
    public static final double REDUCTION_FACTOR2 = 0.9;
    public static final int USD_THRESHOLD1 = 5;
    public static final int USD_THRESHOLD2 = 10;
    private DecimalFormat weightFormat = new DecimalFormat("0.###");

    /**
     * Default constructor
     * @param identicalPart
     * @param numDuplicates
     */
    public Duplicate(Part identicalPart, int numDuplicates){
        this.identicalPart = identicalPart;
        this.numDuplicates = numDuplicates;
    }

    /**
     * Returns the cost of a duplicate
     * @return cost
     */
    public double getCost(){
        if(numDuplicates < USD_THRESHOLD1){
            return identicalPart.getCost() * numDuplicates;
        }else if(numDuplicates < USD_THRESHOLD2){
            return identicalPart.getCost() * REDUCTION_FACTOR1 * numDuplicates;
        }else{
            return identicalPart.getCost() * REDUCTION_FACTOR2 * numDuplicates;
        }
    }

    /**
     * Returns the name of a duplicate
     * @return name
     */
    public String getName(){
        return numDuplicates + " " + identicalPart.getName() + "s";
    }

    /**
     * Returns the weight of a duplicate
     * @return weight
     */
    public double getWeight(){
        return identicalPart.getWeight() * numDuplicates;
    }

    /**
     * Prints off the assembly of duplicated parts
     */
    public void printBillOfMaterials(){
        System.out.println("==========================");
        System.out.println(getName());
        System.out.println("==========================");
        System.out.println("Duplicate part: " + identicalPart.getName());
        System.out.println("Copies: " + numDuplicates);
        System.out.println("Individual Cost: " + costFormat.format(identicalPart.getCost()));
        System.out.println("Individual Weight: " + weightFormat.format(identicalPart.getWeight()) + " lbs");
        System.out.println("");
        System.out.println("Total cost: " + costFormat.format(getCost()));
        System.out.println("Total weight: " + weightFormat.format(getWeight()) + " lbs");
        System.out.println("");
        identicalPart.printBillOfMaterials();
    }

}