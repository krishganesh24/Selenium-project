package reports;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Html_Reports {

	public static void main(String[] args) throws IOException {
		
		ExtentHtmlReporter html = new ExtentHtmlReporter("./report/result.html");
		html.setAppendExisting(true);
		ExtentReports extent= new ExtentReports();
		extent.attachReporter(html);
		ExtentTest test = extent.createTest("Create Testlead", "Create test lead in leaf taps Application");
		test.assignCategory("sanity Tcs");
		test.assignAuthor("Ganesh");
		test.pass("The data Demosalesmanager entered successfully",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png").build());
		test.pass("The data crmfsa entered successfully",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img2.png").build());
		test.pass("The button login clicked successfully",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img3.png").build());
		extent.flush();
		
		
		

	}

}
