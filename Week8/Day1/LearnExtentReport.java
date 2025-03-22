package week8.day1;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {

	public static void main(String[] args) throws IOException {
		
        //Step1: Set the path
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./reports/result.html");
		
		//Step2:Creating the html report
		ExtentReports extent=new ExtentReports();
		
		//Step3: attach the data to the html file
		extent.attachReporter(reporter);
		
		//Ste4:Create the testcase and assign the details
		ExtentTest test = extent.createTest("CreateLead", "CreateLead with multiple data");
		
		//Step5:Assigning details to test
		test.pass("Username entered successfully",MediaEntityBuilder.createScreenCaptureFromPath(".././Photo/Username.jpeg").build());
		
		//Stet6: To close the report
		extent.flush();
		
		System.out.println("Done");
		
	}

}
