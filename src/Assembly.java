/*
 * SE 1011-061
 * Fall 2017
 * File purpose: This contains the Assembly Class
 * Name: lindertcm
 * Created: 12/14/2017
 */

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 * SE 1011-061 2017
 * Purpose: Assembles the parts together
 *
 * @author lindertcm
 * @version 1.0 Created on 12/14/2017 on 3:13 PM.
 */
public class Assembly implements Part {
    private DecimalFormat costFormat = new DecimalFormat("$0.00");
    private String name;
    private ArrayList<Part> subList = new ArrayList();
    public static final double USD_PER_SUB_PART = 0.25;
    private DecimalFormat weightFormat = new DecimalFormat("0.###");


    /**
     * Adds a new part to the ArrayList
     * @param part
     */
    public void addPart(Part part) {
        subList.add(part);
    }

    /**
     * Default constructor
     * @param name
     */
    public Assembly(String name) {
        this.name = name;
    }

    /**
     * Returns the cost of a sheet
     * @return cost of a sheet
     */
    public double getCost() {
        double cost = subList.size() * USD_PER_SUB_PART;
        for (Part part : subList) {
            cost += part.getCost();
        }
        return cost;
    }

    /**
     * Returns the name of a sheet
     * @return name of a sheet
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the weight of a sheet
     * @return weight of a sheet
     */
    public double getWeight() {
        double weight = 0.0;
        for (Part part : subList) {
            weight += part.getWeight();
        }
        return weight;
    }

    /**
     * Prints of a list for an item assembly
     */
    public void printBillOfMaterials() {
        System.out.println("=======================");
        System.out.println(getName());
        System.out.println("=======================");
        for (Part part : subList) {
            System.out.println("Part: " + part.getName());
            System.out.println("Cost: " + costFormat.format(part.getCost()));
            System.out.println("Weight: " + weightFormat.format(part.getWeight()) + " lbs");
            System.out.println("");
        }
        System.out.println("Total cost: " + costFormat.format(getCost()));
        System.out.println("Total weight: " + weightFormat.format(getWeight()) + " lbs");
        System.out.println("");
        for (Part part : subList) {
            part.printBillOfMaterials();
        }
    }
}