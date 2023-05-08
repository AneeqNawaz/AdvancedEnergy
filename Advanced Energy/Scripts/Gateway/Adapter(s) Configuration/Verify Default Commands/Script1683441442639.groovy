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
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement

String data = 'Data Files/Adapter Files/AscentAP10'

List<WebElement> commandsCount = WebUI.findWebElements(findTestObject('Object Repository/Gateway_Configuration/Edit_Action_Popup/Commands popup/Command Count'),1)
//def totalCount = commandsCount.size()
// Print the count to the console
//println("There are ${elementCount} elements on the page.")

for(def rowNum=1;rowNum<=commandsCount.size()-60;rowNum++) {
	
	//println("There are ${commandsCount.size()} elements on the page.")
	
	TestObject checkbox = findTestObject("Object Repository/Gateway_Configuration/Edit_Action_Popup/Commands popup/checkboxIndex")
	checkbox = WebUI.modifyObjectProperty(findTestObject("Object Repository/Gateway_Configuration/Edit_Action_Popup/Commands popup/checkboxIndex"), 'xpath', 'equals', "(//input[contains(@id,'chk')]//following-sibling::div[@class='control__indicator'])[$rowNum]", true)
	TestObject command = findTestObject("Object Repository/Gateway_Configuration/Edit_Action_Popup/Commands popup/commandIndex")
	command = WebUI.modifyObjectProperty(findTestObject("Object Repository/Gateway_Configuration/Edit_Action_Popup/Commands popup/commandIndex"), 'xpath', 'equals', "(//div[@class='control__indicator']//following-sibling::label[contains(@id,'lbl_')])[$rowNum]", true)
	TestObject commandSampleRate = findTestObject("Object Repository/Gateway_Configuration/Edit_Action_Popup/Commands popup/sampleRateIndex")
	commandSampleRate = WebUI.modifyObjectProperty(findTestObject("Object Repository/Gateway_Configuration/Edit_Action_Popup/Commands popup/commandIndex"), 'xpath', 'equals', "(//span[contains(@id,'rfselect')]//span[@class='ui-selectmenu-text'])[$rowNum]", true)
	TestObject commandName = findTestObject("Object Repository/Gateway_Configuration/Edit_Action_Popup/Commands popup/commandName")
	commandName = WebUI.modifyObjectProperty(findTestObject("Object Repository/Gateway_Configuration/Edit_Action_Popup/Commands popup/commandName"), 'xpath', 'equals', "(//label[@class='cmd-description'])[${rowNum}]", true)
	
	println("Verifying default values of Command: ${WebUI.getText(command)}")
	WebUI.scrollToElement(command,1)
	
	WebUI.verifyEqual(CustomKeywords.'customKeywords.customKeywordClass.verifyBackgroundColor'(checkbox), findTestData(data).getValue(1, rowNum), FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.verifyEqual(WebUI.getText(command),findTestData(data).getValue(2, rowNum), FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.verifyEqual(WebUI.getText(commandSampleRate),findTestData(data).getValue(3, rowNum), FailureHandling.CONTINUE_ON_FAILURE)
	WebUI.verifyEqual(WebUI.getText(commandName),findTestData(data).getValue(4, rowNum), FailureHandling.CONTINUE_ON_FAILURE)

}