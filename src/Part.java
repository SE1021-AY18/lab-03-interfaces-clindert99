/*
 * SE 1011-061
 * Fall 2017
 * File purpose: This contains the Part Class
 * Name: lindertcm
 * Created: 12/14/2017
 */

/**
 * SE 1011-061 2017
 * Purpose: The main class that constructs the others
 *
 * @author lindertcm
 * @version 1.0 Created on 12/14/2017 on 3:13 PM.
 */
public interface Part {

    /**
     * Gets the cost
     * @return cost
     */
     double getCost();

    /**
     * Gets the name
     * @return name
     */
     String getName();

    /**
     * Gets the weight
     * @return weight
     */
     double getWeight();

    /**
     * Prints off the parts details
     */
     void printBillOfMaterials();

}