import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.AfterTestCase
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
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.sun.jna.platform.win32.WinNT.OSVERSIONINFO

import internal.GlobalVariable
import jdk.jfr.internal.settings.CutoffSetting

import org.apache.xmlbeans.impl.xb.xsdschema.Public
import org.openqa.selenium.Keys as Keys

//****PRECONDITIONS****
//Verify Stats Screen Loaded Correctly
//WebUI.callTestCase(findTestCase('Test Cases/EdgeUI/Funtional TestCases/Stats/Verify Stats Screen'), null)

//Navigate to Stats Screen
//WebUI.callTestCase(findTestCase('Test Cases/EdgeUI/Commons/Navigate to StatsScreen'), null)

//All Objects of different Values
String lastRestartedValue = 'Object Repository/Stats Screen/span_LastRestartedValue'
String osVersionValue = 'Object Repository/Stats Screen/span_OSVersionValue'
String appVersionValue = 'Object Repository/Stats Screen/span_AppVersionValue'
String serialNumberValue = 'Object Repository/Stats Screen/span_SerialNumberValue'


WebUI.verifyElementVisible(findTestObject(lastRestartedValue))
GlobalVariable.LastRestarted = WebUI.getText(findTestObject(lastRestartedValue))
KeywordUtil.logInfo('Last Restarted:' + GlobalVariable.LastRestarted)

WebUI.verifyElementVisible(findTestObject(osVersionValue))
GlobalVariable.OSVersion = WebUI.getText(findTestObject(osVersionValue))
KeywordUtil.logInfo('OS Version:' + GlobalVariable.OSVersion  )

WebUI.verifyElementVisible(findTestObject(appVersionValue))
GlobalVariable.AppVersion = WebUI.getText(findTestObject(appVersionValue))
KeywordUtil.logInfo('App Version:' + GlobalVariable.AppVersion)

WebUI.verifyElementVisible(findTestObject(serialNumberValue))
GlobalVariable.SerialNumber = WebUI.getText(findTestObject(serialNumberValue))
KeywordUtil.logInfo('Serial Number:' + GlobalVariable.SerialNumber )


