package TimeSeriesPoC.TimeSeriesPoC;

import pl.poznan.put.TimeSeries.Classifying.BasicNgramClassifier;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        BasicNgramClassifier bc = new BasicNgramClassifier();
        System.out.println(bc.hashCode());
        
    }
}
