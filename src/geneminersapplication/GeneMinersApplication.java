/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package geneminersapplication;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author pfolkertsma & ngnodde
 */
public class GeneMinersApplication {
    /**
     * @param args the command line arguments
     */
    public static void main(final String[] args) {
        GeneMinersApplication gma = new GeneMinersApplication();
        gma.start();
    }
    /**
     * This function starts the functions of the application.
     */
    public void start() {
    }
    /**
     * This function returns true if the user exists in the database and false
     * if it does not.
     * @param userName the username of the user
     * @param userPassword the password of the user
     * @return boolean
     */
    public final boolean loginUser(
            final String userName,
            final String userPassword) {
        HashMap<String, String> database = new HashMap();
        database.put("Zaphod", "president");
        database.put("Arthur", "thea");
        database.put("Ford", "beetlejuice");
        database.put("Trillian", "madagascar");
        database.put("Marvin", "iamdepressed");
        if (database.containsKey(userName)) {
            return database.get(userName).equals(userPassword);
        }
        return false;
    }
    /**
     * This function creates a gene object if the given gene name is found and
     * returns a message, else it returns an error message.
     * @param geneName the gene name
     * @return String
     */
    public final String searchGene(final String geneName) {
        ArrayList<String> genes = new ArrayList<>();
        genes.add("BRCA1");
        genes.add("CD28");
        genes.add("BRCA2");
        genes.add("APC");
        genes.add("BDNF");
        genes.add("CRH");
        genes.add("RHO");
        if (genes.contains(geneName)) {
            Gene gene = new Gene();
            return "Gene found.";
        } else {
            return "Gene not found.";
        }
    }
    /**
     * This function creates an Experiment object, if Experiment creation fails
     * an exception is thrown.
     * @param dataset a dataset
     * @return boolean
     */
    public final boolean loadExpressionDataset(final String dataset) {
        try {
            Experiment exp = new Experiment();
            if (dataset.equals("failDataset")) {
                throw new Exception();
            }
            return true;
        } catch (Exception e) {
            System.err.println("Failed to create experiment dataset.");
            return false;
        }
    }
    /**
     * This function creates a Plot object.
     * @param genes an ArrayList with genes.
     * @return boolean
     */
    public final boolean createPlot(final ArrayList genes) {
        try {
            Plot plot = new Plot();
            if (genes == null) {
                throw new Exception();
            }
            return true;
        } catch (Exception e) {
            System.err.println("Failed to create plot.");
            return false;
        }
    }
    /**
     * This function creates a Cluster object.
     * @param genes an ArrayList with genes.
     * @return boolean
     */
    public final boolean createCluster(final ArrayList genes) {
        try {
            Cluster cluster = new Cluster();
            if (genes == null) {
                throw new Exception();
            }
            return true;
        } catch (Exception e) {
            System.err.println("Failed to create cluster.");
            return false;
        }
    }
}
