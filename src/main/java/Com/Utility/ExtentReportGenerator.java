package Com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {

	//ExtentSparkReporter
	//ExtentReports
	public static ExtentReports extent;
	public static ExtentReports getReport() {
		
		String path="C:\\Users\\lenovo\\Maven_Project_FrameWork\\Reports\\Index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Test report");
		reporter.config().setReportName("Batch 6 Report Report");
		reporter.config().setTheme(Theme.DARK);
		
		 extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Project Name","Regression_Batch_6");
		extent.setSystemInfo("Browser", "Chrome");
		extent.setSystemInfo("Version_Build", "3.1.0");
		extent.setSystemInfo("QA","Pawan Dalvi");
		return extent;
		
	}
}
 