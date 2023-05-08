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

//Web Objects of headings and values
String addAdapter = 'Object Repository/Gateway_Configuration/Tab_ActionsAndSearchBar/button_Add'
String powerInsight = 'Object Repository/Gateway_Configuration/Tab Header/About/h2_PowerInsight'
String buildInfoVlaue = 'Object Repository/Gateway_Configuration/Tab Header/About/span_buildInfo'
String serialNumber = 'Object Repository/Gateway_Configuration/Tab Header/About/h2_Serial Number'
String serialNumberValue = 'Object Repository/Gateway_Configuration/Tab Header/About/span_serialNumInfo'
String aboutText= 'Object Repository/Gateway_Configuration/Tab Header/About/a_About'
String aboutIcon= 'Object Repository/Gateway_Configuration/Tab Header/About/clockIcon'

//verify Last PowerInsight heading and value is displayed
WebUI.verifyElementNotVisible(findTestObject(powerInsight))

// Verify that About text and icon is displayed and user able to click About
WebUI.waitForElementVisible(findTestObject(powerInsight), 5)
WebUI.verifyElementVisible(findTestObject(aboutText))
WebUI.verifyElementVisible(findTestObject(aboutIcon))
WebUI.verifyEqual(WebUI.getText(findTestObject(aboutText)), 'About')
WebUI.mouseOver(findTestObject(aboutText))

//verify Last PowerInsight heading and value is displayed
WebUI.waitForElementVisible(findTestObject(powerInsight), 2)
WebUI.verifyElementVisible(findTestObject(powerInsight))
WebUI.verifyEqual(WebUI.getText(findTestObject(powerInsight)), 'POWERINSIGHT')
WebUI.verifyElementVisible(findTestObject(buildInfoVlaue))
WebUI.verifyEqual(WebUI.getText(findTestObject(buildInfoVlaue)), GlobalVariable.AppVersion)

//verify Last Serial Number heading and value is displayed
WebUI.verifyElementVisible(findTestObject(serialNumber))
WebUI.verifyEqual(WebUI.getText(findTestObject(serialNumber)), 'SERIAL NUMBER')
WebUI.verifyElementVisible(findTestObject(serialNumberValue))
WebUI.verifyEqual(WebUI.getText(findTestObject(serialNumberValue)), GlobalVariable.SerialNumber)

//verify Last PowerInsight heading and value is displayed
WebUI.mouseOver(findTestObject(addAdapter))
WebUI.verifyElementNotVisible(findTestObject(powerInsight))

