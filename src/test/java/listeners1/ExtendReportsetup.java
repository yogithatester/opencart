package listeners1;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportsetup {
	public static ExtentReports  entend;
 public static ExtentReports setup()
 {
	 ExtentSparkReporter  spark=new ExtentSparkReporter(".\\opencart1\\reports");
	 entend.attachReporter(spark);
 }
}
