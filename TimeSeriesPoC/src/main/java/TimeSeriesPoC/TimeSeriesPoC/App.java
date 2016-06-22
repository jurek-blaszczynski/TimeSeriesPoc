package TimeSeriesPoC.TimeSeriesPoC;

public class App 
{
    public static void main( String[] args )
    {
        try {
			PoC.exportArff();
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
