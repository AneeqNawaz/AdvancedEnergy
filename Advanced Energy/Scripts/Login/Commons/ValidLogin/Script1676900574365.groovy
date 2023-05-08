import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import javax.xml.bind.annotation.XmlElementDecl.GLOBAL as GLOBAL
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
import groovy.json.StringEscapeUtils as StringEscapeUtils
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


//****PRECONDITIONS****
//Open Browser
WebUI.callTestCase(findTestCase('Test Cases/Browser/Open Browser'), null)
//Verify login page opens
//WebUI.verifyEqual(WebUI.getWindowTitle(), 'Login - PowerInsight', FailureHandling.STOP_ON_FAILURE)

//Input Valid Data and Click on Login
String userName = 'Object Repository/Login Page/fieldUsername'
String password = 'Object Repository/Login Page/fieldPassword'

WebUI.sendKeys(findTestObject(userName), GlobalVariable.userName)
WebUI.sendKeys(findTestObject(password), GlobalVariable.password)

WebUI.callTestCase(findTestCase('Test Cases/Login/Lookups/Click on Login Button'), null)

//****POSTCONDITIONS****
WebUI.callTestCase(findTestCase('Test Cases/Login/Functional TestCases/Verify User Logged-in Successfully'),null,FailureHandling.CONTINUE_ON_FAILURE)



//adasd
WebUI.callTestCase(findTestCase('Test Cases/Gateway/Adapter(s) Configuration/Ascent AP10'),null,FailureHandling.CONTINUE_ON_FAILURE)
