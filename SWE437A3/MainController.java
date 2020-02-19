
package Converter.Controller;
import javafx.fxml.FXML;
import javafx.scene.control.*;

/* import all method from Converter in View */
import static Converter.Model.Converter.*;

import java.util.Properties;

public class MainController {
    /* initialize tags */
    @FXML Button convert;
    @FXML Button clear;
    @FXML TextField Gal;
    @FXML TextField Oz;
    @FXML TextField Ft;
    @FXML TextField Mi;
    @FXML TextField Lb;
    @FXML TextField In;
    @FXML TextField F;
    @FXML TextField Kg;
    @FXML TextField G;
    @FXML TextField L;
    @FXML TextField Km;
    @FXML TextField M;
    @FXML TextField Cm;
    @FXML TextField C;
    @FXML TextField Mph;
    @FXML TextField Kmh;
    @FXML Slider Dbar;

    /* Handle onClick */
    public void handleConvertButton() {
    	Properties newvals = new Properties();
    	int point = (int) Dbar.getValue();
    	// temperature
    	// Convert farenheit to celsius
        if (F.getText() != null && F.getLength() > 0) {
            newvals.put("C",Float.toString(convertF2C(F.getText(), point)));
        }
        // Convert celsius to farenheit
        if (C.getText() != null && C.getLength() > 0) {
            newvals.put("F",Float.toString(convertC2F(C.getText(), point)));
        }
        
        // small distance
        // Convert inches to centimeters
        if (In.getText() != null && In.getLength() > 0) {
            newvals.put("Cm",Float.toString(convertIn2Cm(In.getText(), point)));
        }
        if (Cm.getText() != null && Cm.getLength() > 0) {
            newvals.put("In",Float.toString(convertCm2In(Cm.getText(), point)));
        }
        
        // medium distance
        // Convert feet to meters
        if (Ft.getText() != null && Ft.getLength() > 0) {
            newvals.put("M",Float.toString(convertF2M(Ft.getText(), point)));
        }
        // Convert meters to feet
        if (M.getText() != null && M.getLength() > 0) {
            newvals.put("Ft",Float.toString(convertM2F(M.getText(), point)));
        }
        
        // large distance
        // Convert miles to kilometers
        if (Mi.getText() != null && Mi.getLength() > 0) {
            newvals.put("Km",Float.toString(convertM2K(Mi.getText(), point)));
        }
        // Convert kilometers to miles
        if (Km.getText() != null && Km.getLength() > 0) {
            newvals.put("Mi",Float.toString(convertK2M(Km.getText(), point)));
        }
        
        // volume
        // Convert gallons to liters
        if (Gal.getText() != null && Gal.getLength() > 0) {
            newvals.put("L",Float.toString(convertG2L(Gal.getText(), point)));    
        }
        // Convert liters to gallons
        if (L.getText() != null && L.getLength() > 0) {
            newvals.put("Gal",Float.toString(convertL2G(L.getText(), point)));
            
        }
        
        // small weight
        // Convert ounces to grams
        if (Oz.getText() != null && Oz.getLength() > 0) {
            newvals.put("G",Float.toString(convertOz2G(Oz.getText(), point)));
        }
        if (G.getText() != null && G.getLength() > 0) {
            newvals.put("Oz",Float.toString(convertG2Oz(G.getText(), point)));
        }
        
        // medium weight
        // Convert pounds to kilograms
        if (Lb.getText() != null && Lb.getLength() > 0) {
            newvals.put("Kg",Float.toString(convertLb2K(Lb.getText(), point)));
        }
        if (Kg.getText() != null && Kg.getLength() > 0) {
            newvals.put("Lb",Float.toString(convertK2Lb(Kg.getText(), point)));
        }
        
        
        printForm(newvals);
        
    }
   
	private void printForm(Properties newvals) {
    	//Print to the UI all result at the same time 
    	
    	//Set text field of Farenheit clear Celsius
    	if (newvals.getProperty ("F") != null)
    	{
    	    F.setText(newvals.getProperty ("F"));
    	    C.setText(null);
    	}
    	
    	//Set text field of Celsius clear Farenheit
    	if (newvals.getProperty ("C") != null) 
    	{
    		C.setText(newvals.getProperty ("C"));
    		F.setText(null);
    	}
    	
    	//Set text field of Inch clear Centimeter
    	if (newvals.getProperty ("In") != null)
    	{
    		In.setText(newvals.getProperty ("In"));
    		Cm.setText(null);
    	}
    	
    	//Set text field of Centimeter clear Inch
    	if (newvals.getProperty ("Cm") != null)
    	{
    		Cm.setText(newvals.getProperty ("Cm"));
    		In.setText(null);
    	}
    	
    	//Set text field of Feet clear Meter
    	if (newvals.getProperty ("Ft") != null)
    	{
    		Ft.setText(newvals.getProperty ("Ft"));
    		M.setText(null);
    	}
    	
    	//Set text field of Meter clear Feet
    	if (newvals.getProperty ("M") != null)
    	{
    		M.setText(newvals.getProperty ("M"));
    		Ft.setText(null);
    	}
    	
    	//Set text field of Mile clear Kilometer
    	if (newvals.getProperty ("Mi") != null)
    	{
    		Mi.setText(newvals.getProperty ("Mi"));
    		Km.setText(null);
    	}
    	
    	//Set text field of Kilometer clear Mile
    	if (newvals.getProperty ("Km") != null)
    	{
    		Km.setText(newvals.getProperty ("Km"));
    		Mi.setText(null);
    	}
    	
    	//Set text field of Gallon clear Liter
    	if (newvals.getProperty ("Gal") != null)
    	{
    		Gal.setText(newvals.getProperty ("Gal"));
    		L.setText(null);
    	}
    	
    	//Set text field of Liter clear Gallon
    	if (newvals.getProperty ("L") != null)
    	{
    		L.setText(newvals.getProperty ("L"));
    		Gal.setText(null);
    	}
    	
    	//Set text field of Ounce clear Gram
    	if (newvals.getProperty ("Oz") != null)
    	{
    		Oz.setText(newvals.getProperty ("Oz"));
    		G.setText(null);
    	}
    	
    	//Set text field of Gram clear Ounce
    	if (newvals.getProperty ("G") != null)
    	{
    		G.setText(newvals.getProperty ("G"));
    		Oz.setText(null);
    	}
    	
    	//Set text field of Pound clear Kilogram
    	if (newvals.getProperty ("Lb") != null)
    	{
    		Lb.setText(newvals.getProperty ("Lb"));
    		Kg.setText(null);
    	}
    	
    	//Set text field of Kilogram clear Pound
    	if (newvals.getProperty ("Kg") != null)
    	{
    		Kg.setText(newvals.getProperty ("Kg"));	
    		Lb.setText(null);
    	}
    }
	public void handleClearButton() {
		
		//Clear out all text fields
        Gal.setText(null);
        Oz.setText(null);
        Ft.setText(null);
        Mi.setText(null);
        Lb.setText(null);
        In.setText(null);
        F.setText(null);
        Kg.setText(null);
        G.setText(null);
        L.setText(null);
        Km.setText(null);
        M.setText(null);
        Cm.setText(null);
        C.setText(null);
    }
}
