import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

String logoutBtn= 'Object Repository/EdgeUI/Sidebar Buttons/btnLogout'

// Start the timer
def startTime = System.currentTimeMillis()

// Wait for the next object to load, with a timeout of 5 seconds
if (WebUI.waitForElementVisible(findTestObject(logoutBtn), 7)) {
    // Stop the timer and calculate the elapsed time
    def endTime = System.currentTimeMillis()
    def elapsedTime = endTime - startTime
    
    // If the elapsed time is less than 5 seconds, the test case passes
    if (elapsedTime < 5000) {
        // Page loaded within 5 seconds, test case passed
    } else {
        // Page took more than 5 seconds to load, test case failed
        KeywordUtil.markFailed('Page took more than 5 seconds to load')
    }
} else {
    // Element did not become visible within 5 seconds, test case failed
    throw new Exception('Element did not become visible within 5 seconds')
}

//Verify user Loggedin Successfully
WebUI.verifyEqual(WebUI.getUrl(), GlobalVariable.Url+'edgeui/dashboard')
WebUI.callTestCase(findTestCase('Test Cases/EdgeUI/Funtional TestCases/Stats/Get Stats Values'), null)