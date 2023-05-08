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
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//Check Adapter count from pagination
String adapterCountElement = 'Object Repository/Gateway_Configuration/Pagination/AdapterCount'
WebUI.verifyElementVisible(findTestObject(adapterCountElement))
int adapterCount = Integer.parseInt(WebUI.getText(findTestObject(adapterCountElement)))
println(adapterCount)


String selectAllCheckbox = 'Object Repository/Gateway_Configuration/Table_Header/selectAll'
String deleteAll = 'Object Repository/Gateway_Configuration/Tab_ActionsAndSearchBar/button_DeleteAll'
String deleteAll_Yes = 'Object Repository/Gateway_Configuration/DeleteAll_popUp/button_Yes'
String noRowMessage = 'Object Repository/Gateway_Configuration/Table_EachRow/noRow_message'

if (adapterCount >= 1){
	// If there's one or more adapters, select all and delete
	WebUI.click(findTestObject(selectAllCheckbox))
	WebUI.click(findTestObject(deleteAll))
	WebUI.click(findTestObject(deleteAll_Yes))
	
	// Verify that the adapter has been deleted
	// Verify that the adapter row is not visible
	if (WebUI.verifyElementVisible(findTestObject(noRowMessage))){
		KeywordUtil.markPassed('PASS: Adapters Deleted Successfully')
	}else {
		KeywordUtil.markFailed('FAIL:Not able to delete all adapters')
	}

}else {
	// If there are no target elements, mark the test case as passed
	KeywordUtil.markPassed('PASS: No Adapter Found')
} 