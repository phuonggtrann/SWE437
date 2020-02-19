package Converter.Model;

/**
 * Change all method from private to public static for global access without creating object
 */

public class Converter {
    public static float convertF2C (String FAsStr, int point)
    {  // Convert farenheit to celsius
        float num1, num2; // temporary variables
        // Round to n decimal point
        num1 = roundTo(FAsStr,point);
        // Convert
        num2 = (float) ( ( (num1-32.0) * 5.0) / 9.0);
        // Back to n decimal point
        num2 = roundTo(String.valueOf(num2), point);
        return (num2);
    }

    public static float convertC2F (String CAsStr, int point)
    {  // Convert celsius to farenheit
        float num1, num2; // temporary variables
        // Round to n decimal point
        num1 = roundTo(CAsStr,point);
        // Convert
        num2 = (float) ( (num1 * 9.0 / 5.0) + 32.0);
        // Back to n decimal point
        num2 = roundTo(String.valueOf(num2), point);
        return(num2);
    }

    // small distance
    public static float convertIn2Cm (String inAsStr, int point)
    {  // Convert inches to centimeters
        float num1, num2; // temporary variables
        // Round to n decimal point
        num1 = roundTo(inAsStr,point);
        // Convert
        num2 = (float) (num1 * 2.54);
        // Back to n decimal point
        num2 = roundTo(String.valueOf(num2), point);
        return(num2);
    }

    public static float convertCm2In (String cmAsStr, int point)
    {  // Convert centimeters to inches
        float num1, num2; // temporary variables
        // Round to n decimal point
        num1 = roundTo(cmAsStr,point);
        // Convert
        num2 = (float) (num1 * 0.3937);
        // Back to n decimal point
        num2 = roundTo(String.valueOf(num2), point);
        return(num2);
    }

    // medium distance
    public static float convertF2M (String ftAsStr, int point)
    {  // Convert feet to meters
        float num1, num2; // temporary variables
        // Round to n decimal point
        num1 = roundTo(ftAsStr,point);
        // Convert
        num2 = (float) (num1 * 0.3048);
        // Back to n decimal point
        num2 = roundTo(String.valueOf(num2), point);
        return(num2);
    }

    public static float convertM2F (String mAsStr, int point)
    {  // Convert meters to feet
        float num1, num2; // temporary variables
        // Round to n decimal point
        num1 = roundTo(mAsStr,point);
        // Convert
        num2 = (float) (num1 / 0.3048);
        // Back to n decimal point
        num2 = roundTo(String.valueOf(num2), point);
        return(num2);
    }

    // large distance
    public static float convertM2K (String miAsStr, int point)
    {  // Convert miles to kilometers
        float num1, num2; // temporary variables
        // Round to n decimal point
        num1 = roundTo(miAsStr,point);
        // Convert
        num2 = (float) (num1 * 1.609);
        // Back to n decimal point
        num2 = roundTo(String.valueOf(num2), point);
        return(num2);
    }

    public static float convertK2M (String kmAsStr, int point)
    {  // Convert kilometers to miles
        float num1, num2; // temporary variables
        // Round to n decimal point
        num1 = roundTo(kmAsStr,point);
        // Convert
        num2 = (float) (num1 * 0.6214);
        // Back to n decimal point
        num2 = roundTo(String.valueOf(num2), point);
        return(num2);
    }

    // volume
    public static float convertG2L (String galAsStr, int point)
    {  // Convert gallons to liters
        float num1, num2; // temporary variables
        // Round to n decimal point
        num1 = roundTo(galAsStr,point);
        // Convert
        num2 = (float) (num1 * 3.785);
        // Back to n decimal point
        num2 = roundTo(String.valueOf(num2), point);
        return num2;
    }

    public static float convertL2G (String LAsStr, int point)
    {  // Convert liters to gallons
        float num1, num2; // temporary variables
        // Round to 2 digits past decimal
        num1 = roundTo(LAsStr,point);
        // Convert
        num2 = (float) (num1 / 3.785);
        // Back to n decimal point
        num2 = roundTo(String.valueOf(num2), point); //this
        return(num2);
    }

    // small weight
    public static float convertOz2G (String ozAsStr, int point)
    {  // Convert ounces to grams
        float num1, num2; // temporary variables
        // Round to n decimal point
        num1 = roundTo(ozAsStr,point);
        // Convert
        num2 = (float) (num1 * 28.35);
        // Back to n decimal point
        num2 = roundTo(String.valueOf(num2), point);
        return(num2);
    }

    public static float convertG2Oz (String gAsStr, int point)
    {  // Convert grams to ounces
        float num1, num2; // temporary variables
        // Round to n decimal point
        num1 = roundTo(gAsStr,point);
        // Convert
        num2 = (float) (num1 / 28.35);
        // Back to n decimal point
        num2 = roundTo(String.valueOf(num2), point);
        return(num2);
    }

    // medium weight
    public static float convertLb2K (String lbAsStr, int point)
    {  // Convert pounds to kilograms
        float num1, num2; // temporary variables
        // Round to n decimal point
        num1 = roundTo(lbAsStr,point);
        // Convert
        num2 = (float) (num1 * 0.4536);
        // Back // Round to n decimal point
        num2 = roundTo(String.valueOf(num2), point);
        return(num2);
    }

    public static float convertK2Lb (String kgAsStr, int point)
    {  // Convert kilograms to pounds
        float num1, num2; // temporary variables
        // Round to n decimal point
        num1 = roundTo(kgAsStr, point);
        // Convert
        num2 = (float) (num1 * 2.205);
        // Back  to n decimal point
        num2 = roundTo(String.valueOf(num2), point);
        return(num2);
    }
    
    public static float convertMph2Kmh (String mphAsStr, int )
    {
    	float num1, num2;
        // Round to n decimal point
        num1 = roundTo(AsStr, point);
        // Convert
        num2 = (float) (num1 * 1.609344);
        // Back to n decimal point
        num2 = roundTo(String.valueOf(num2), point);
		return num2;
    }
    
    public static float convertKmh2Mph (String mphAsStr, point)
    {
        float num1, num2;
        // Round to n decimal point
        num1 = roundTo(AsStr, point);
        // Convert
        num2 = (float) (num1 * 0.621371);
        // Back to n decimal point
        num2 = roundTo(String.valueOf(num2), point);
        return num2;
    }
    
    public static float roundTo (String value, int point) {
    	float decimal = (float) 100.0, num1; 
    	int n;
		if (point == 0)
		{
			decimal = (float) 1.0;
		}
		else if (point ==1)
		{
			decimal = (float) 10.0;
		}
		else if (point ==2)
		{
			decimal = (float) 100.0;
		}
		else if (point ==3)
		{
			decimal = (float) 1000.0;
		}
		else if (point ==4)
		{
			decimal = (float) 10000.0;
		}
		
		num1 = (Float.valueOf (value).floatValue ());
		if (decimal == 1.0) {
			n = Math.round(num1);
			return n;
		}
		else {
			n = Math.round(num1 * decimal);
			num1 = (float) (n / decimal);
			return num1;
		}
    }
    
    
   
}
