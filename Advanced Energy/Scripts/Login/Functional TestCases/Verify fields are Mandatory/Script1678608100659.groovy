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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

String userName = 'Object Repository/Login Page/fieldUsername'
String password = 'Object Repository/Login Page/fieldPassword'
String ErrorMessages = 'Object Repository/Login Page/errorMessages'

//****PRECONDITIONS****
//Open Browser
//WebUI.callTestCase(findTestCase('Test Cases/Browser/Open Browser'), null)


//Verify if user clicks on login if both fields are empty
WebUI.callTestCase(findTestCase('Test Cases/Login/Lookups/Click on Login Button'), null)
WebUI.verifyElementVisible(findTestObject(ErrorMessages))
WebUI.verifyEqual(WebUI.getText(findTestObject(ErrorMessages)), 'Please fill Username field')

//Verify if user clicks on login with empty Password field
WebUI.sendKeys(findTestObject(userName), 'Test')
WebUI.callTestCase(findTestCase('Test Cases/Login/Lookups/Click on Login Button'), null)
WebUI.verifyElementVisible(findTestObject(ErrorMessages))
WebUI.verifyEqual(WebUI.getText(findTestObject(ErrorMessages)), 'Please fill Password field')

//Verify if user clicks on login with empty username field
WebUI.clearText(findTestObject(userName))
WebUI.sendKeys(findTestObject(password), 'Test')
WebUI.callTestCase(findTestCase('Test Cases/Login/Lookups/Click on Login Button'), null)
WebUI.verifyElementVisible(findTestObject(ErrorMessages))
WebUI.verifyEqual(WebUI.getText(findTestObject(ErrorMessages)), 'Please fill Username field')

//Verify when both fields are filled no message displayed
WebUI.sendKeys(findTestObject(userName), 'Test')
WebUI.verifyElementNotVisible(findTestObject(ErrorMessages),FailureHandling.CONTINUE_ON_FAILURE)

//Clear both fields
WebUI.clearText(findTestObject(userName))
WebUI.clearText(findTestObject(password))

