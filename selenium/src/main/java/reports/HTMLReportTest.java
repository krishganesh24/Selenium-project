package reports;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class HTMLReportTest {
	
	public static void main(String[] args) throws IOException {

	
	ExtentHtmlReporter html = new ExtentHtmlReporter("./report/result1.html");
	html.setAppendExisting(true);
	ExtentReports extent = new ExtentReports();

	extent.attachReporter(html);
	
	ExtentTest test = extent.createTest("Test leaf", "Testing Application");
	
	test.assignAuthor("Ganesh").assignCategory("Regression");
	test.pass("Entered data successfylly", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png").build());
	test.fail("Data not entered", MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img2.png").build());
	extent.flush();
}
}
