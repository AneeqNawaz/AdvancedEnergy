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

//Navigate to Stats Screen
WebUI.callTestCase(findTestCase('Test Cases/EdgeUI/Commons/Navigate to StatsScreen'), null)

//All Objects of different Headings
String statsHeading= 'Object Repository/Stats Screen/h2_StatsTopHeading'
String lastRestarted = 'Object Repository/Stats Screen/strong_LastRestarted'
String osVersion = 'Object Repository/Stats Screen/strong_OSVersion'
String appVersion = 'Object Repository/Stats Screen/strong_AppVersion'
String serialNumber = 'Object Repository/Stats Screen/strong_SerialNumber'
String description = 'Object Repository/Stats Screen/strong_Description'

//All Objects of different Values
String lastRestartedValue = 'Object Repository/Stats Screen/span_LastRestartedValue'
String osVersionValue = 'Object Repository/Stats Screen/span_OSVersionValue'
String appVersionValue = 'Object Repository/Stats Screen/span_AppVersionValue'
String serialNumberValue = 'Object Repository/Stats Screen/strong_SerialNumber'
String descriptionValue = 'Object Repository/Stats Screen/input_DescriptionFieldValue'


// Verify Stats Screen Loaded correctly and stats heading displayed
WebUI.verifyEqual(WebUI.getUrl(),GlobalVariable.Url+'edgeui/stats')
WebUI.verifyElementVisible(findTestObject(statsHeading))
WebUI.verifyEqual(WebUI.getText(findTestObject(statsHeading)), 'Stats')

//******** Pending thing here is to verify colons(:) are displayed

//verify Last Restarted heading and value displayed
WebUI.verifyElementVisible(findTestObject(lastRestarted))
WebUI.verifyEqual(WebUI.getText(findTestObject(lastRestarted)), 'Last Restarted')
WebUI.verifyElementVisible(findTestObject(lastRestartedValue))
WebUI.verifyNotEqual(WebUI.getText(findTestObject(lastRestartedValue)), '')

//verify Last Restarted heading and value displayed
WebUI.verifyElementVisible(findTestObject(lastRestarted))
WebUI.verifyEqual(WebUI.getText(findTestObject(lastRestarted)), 'Last Restarted')
WebUI.verifyElementVisible(findTestObject(lastRestartedValue))
WebUI.verifyNotEqual(WebUI.getText(findTestObject(lastRestartedValue)), '')

//verify OS Version heading and value displayed
WebUI.verifyElementVisible(findTestObject(osVersion))
WebUI.verifyEqual(WebUI.getText(findTestObject(osVersion)), 'OS Version')
WebUI.verifyElementVisible(findTestObject(osVersionValue))
WebUI.verifyNotEqual(WebUI.getText(findTestObject(osVersionValue)), '')

//verify App Version heading and value displayed
WebUI.verifyElementVisible(findTestObject(appVersion))
WebUI.verifyEqual(WebUI.getText(findTestObject(appVersion)), 'App Version')
WebUI.verifyElementVisible(findTestObject(appVersionValue))
WebUI.verifyNotEqual(WebUI.getText(findTestObject(appVersionValue)), '')

//verify Serial Number heading and value displayed
WebUI.verifyElementVisible(findTestObject(serialNumber))
WebUI.verifyEqual(WebUI.getText(findTestObject(serialNumber)), 'Serial Number')
WebUI.verifyElementVisible(findTestObject(serialNumberValue))
WebUI.verifyNotEqual(WebUI.getText(findTestObject(serialNumberValue)), '')

//verify Description heading and value displayed
WebUI.verifyElementVisible(findTestObject(description))
WebUI.verifyEqual(WebUI.getText(findTestObject(description)), 'Description')
WebUI.verifyElementVisible(findTestObject(descriptionValue))
WebUI.verifyEqual(WebUI.getText(findTestObject(descriptionValue)), '')


//WebUI.verifyElementVisible(findTestObject(serialNum))
//String valueSerial = WebUI.getText(findTestObject(serialNum))
//KeywordUtil.logInfo('Serial Number:' + valueSerial )
