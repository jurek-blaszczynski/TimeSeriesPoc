package TimeSeriesPoC.TimeSeriesPoC;

import pl.poznan.put.TimeSeries.Classifying.Datasets;
import pl.poznan.put.TimeSeries.Constants.DivisionOptions;
import pl.poznan.put.TimeSeries.Workflows.DominantWorkflow;
import pl.poznan.put.TimeSeries.Workflows.WorkflowBase;

public class PoC {
	
	public static void exportArff() throws Exception{
		System.out.println("Arff export has started.");
		
		Datasets dataset = Datasets.PATIENTS;
		boolean isGlaucoma = dataset == Datasets.PATIENTS;
		
		WorkflowBase workflow = new DominantWorkflow(DivisionOptions.Regular, isGlaucoma);
		
		String path = workflow.saveArff(null, "Exported arff file.arff");
		System.out.println("Arff for " + dataset.name() + " has been exported to " + path);
	}
}