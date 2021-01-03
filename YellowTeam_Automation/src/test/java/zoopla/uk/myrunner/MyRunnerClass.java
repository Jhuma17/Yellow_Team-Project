   package zoopla.uk.myrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

    @CucumberOptions(   
		
      // read the console easily or removed markers
    	monochrome = true,
    	 
      // check the feature files written correctly or not
       
        dryRun = false,
       
      // we generate the report & specify the location
    	
        plugin= {"pretty","html:target/cucumber-reports/cucumber.json", "json:target/cucumber.json"},
    	
      // location of feature folder
    	
        features = "Cucumber_Features/LoginTestCases.feature",  
		
      // location of step definition	  
	    
        glue = "zoopla.uk.stepdefinition",
		
	    
      //Check all feature steps are correctly corresponding   
        
        strict = true
        
        
	                         )
	  
	   public class MyRunnerClass extends AbstractTestNGCucumberTests{


    }
