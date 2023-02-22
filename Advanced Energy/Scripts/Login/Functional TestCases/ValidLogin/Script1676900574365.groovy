import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import javax.xml.bind.annotation.XmlElementDecl.GLOBAL

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

import groovy.json.StringEscapeUtils
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//Open Browser & Maximize window
WebUI.openBrowser(GlobalVariable.Url)
WebUI.maximizeWindow()

//Verify login page opens
WebUI.verifyEqual(WebUI.getWindowTitle(), "Login - PowerInsight")


//Input Valid Data and Click on Login
String userName = 'Object Repository/loginPage/fieldUserName'
String password = 'Object Repository/loginPage/fieldPassword'
String login = 'Object Repository/loginPage/btnLogin'

WebUI.sendKeys(findTestObject(userName), GlobalVariable.userName)
WebUI.sendKeys(findTestObject(password), GlobalVariable.password)
WebUI.click(findTestObject(login))

//Verify user Loggedin Successfully

String logoutBtn= 'Object Repository/edgeUI_Dashboard/btnLogout'
WebUI.verifyElementVisible(findTestObject(logoutBtn))
WebUI.verifyEqual(WebUI.getUrl(), GlobalVariable.Url+'edgeui/dashboard')

