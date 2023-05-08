import com.sun.corba.se.impl.encoding.CodeSetConversion.BTCConverter

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import javax.xml.xpath.XPath

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement

WebUI.callTestCase(findTestCase('Test Cases/Gateway/Commons/Navigate to ConfigScreen'),null,FailureHandling.CONTINUE_ON_FAILURE)

String AdapterName = "Object Repository/Gateway_Configuration/Table_EachRow/adapterName"
WebUI.verifyElementVisible(findTestObject(AdapterName))
String GroupName = "Object Repository/Gateway_Configuration/Table_EachRow/group"
String communicationChannel ="Object Repository/Gateway_Configuration/Table_EachRow/Communication Channel"


String editAdapter = 'Object Repository/Gateway_Configuration/Table_EachRow/edit_action'
WebUI.verifyElementVisible(findTestObject(editAdapter))
WebUI.click(findTestObject(editAdapter))

String labelAdapterName = "Object Repository/Gateway_Configuration/Edit_Action_Popup/label_Adapter Name"
String labelGroupName = "Object Repository/Gateway_Configuration/Edit_Action_Popup/label_Group Name"
String labelIP = "Object Repository/Gateway_Configuration/Edit_Action_Popup/label_IP"
String labelPort = "Object Repository/Gateway_Configuration/Edit_Action_Popup/label_Port"
String labelSamplingRate = "Object Repository/Gateway_Configuration/Edit_Action_Popup/label_Sampling Rate"
String inputSamplingRate = "Object Repository/Gateway_Configuration/Edit_Action_Popup/Input_Sampling Rate"

TestObject checkboxFastDAQ = findTestObject("Object Repository/Gateway_Configuration/Edit_Action_Popup/FastDAQ/Checkbox_Enable FastDAQ")
String labelcheckbox = "Object Repository/Gateway_Configuration/Edit_Action_Popup/FastDAQ/label_Enable FastDAQ"
String labelHoldCaptureFor = "Object Repository/Gateway_Configuration/Edit_Action_Popup/FastDAQ/label_Hold Captures for"
String inputHoldCaptureFor = "Object Repository/Gateway_Configuration/Edit_Action_Popup/FastDAQ/input_Hold Capture For"
String labelMemoryType = "Object Repository/Gateway_Configuration/Edit_Action_Popup/FastDAQ/label_Memory Type"
String inputMemoryType = "Object Repository/Gateway_Configuration/Edit_Action_Popup/FastDAQ/input_Memory Type"
String labelTrigger = "Object Repository/Gateway_Configuration/Edit_Action_Popup/FastDAQ/label_TriggerType"
String inputTrigger = "Object Repository/Gateway_Configuration/Edit_Action_Popup/FastDAQ/input_TriggerType"
String labelThresholdV = "Object Repository/Gateway_Configuration/Edit_Action_Popup/FastDAQ/label_Threshold V"
String inputThresholdV = "Object Repository/Gateway_Configuration/Edit_Action_Popup/FastDAQ/input_Threshold V"
String labelThresholdCrossing = "Object Repository/Gateway_Configuration/Edit_Action_Popup/FastDAQ/label_Threshold Crossing"
String inputThresholdCrossing = "Object Repository/Gateway_Configuration/Edit_Action_Popup/FastDAQ/input_Threshold Crossing"
String labelTimeInterval = "Object Repository/Gateway_Configuration/Edit_Action_Popup/FastDAQ/label_Time Interval"
String inputTimeInterval = "Object Repository/Gateway_Configuration/Edit_Action_Popup/FastDAQ/input_Time Interval"
String labelTriggerPosition = "Object Repository/Gateway_Configuration/Edit_Action_Popup/FastDAQ/label_TriggerPosition"
String inputTriggerPosition = "Object Repository/Gateway_Configuration/Edit_Action_Popup/FastDAQ/input_TriggerValue"
String labelSampleRateFastDAQ = "Object Repository/Gateway_Configuration/Edit_Action_Popup/FastDAQ/label_Sampling Rate (Hz)"
String inputSampleRateFastDAQ = "Object Repository/Gateway_Configuration/Edit_Action_Popup/FastDAQ/input_Sample Rate"
String labelHourlyCaptureLimit = "Object Repository/Gateway_Configuration/Edit_Action_Popup/FastDAQ/label_Hourly Capture Limit"
String inputHourlyCaptureLimit = "Object Repository/Gateway_Configuration/Edit_Action_Popup/FastDAQ/input_Hourly Capture Limit"

String advancedSettingsIcon = "Object Repository/Gateway_Configuration/Edit_Action_Popup/Advanced Configs/advanceConfigs_dropdown"
String labelCommunicationMode = "Object Repository/Gateway_Configuration/Edit_Action_Popup/Advanced Configs/label_Communication Mode"
String radioButtonMoxa = "Object Repository/Gateway_Configuration/Edit_Action_Popup/Advanced Configs/radioButton_Moxa"
String labelMoxa = "Object Repository/Gateway_Configuration/Edit_Action_Popup/Advanced Configs/label_Moxa NPort"
String radioButtonAEBusGateway = "Object Repository/Gateway_Configuration/Edit_Action_Popup/Advanced Configs/radioButton_AEBus Gateway"
String labelAEBusGateway = "Object Repository/Gateway_Configuration/Edit_Action_Popup/Advanced Configs/label_AEBus Gateway"
String radioButtonEthernet = "Object Repository/Gateway_Configuration/Edit_Action_Popup/Advanced Configs/radioButton_Ethernet"
String labelEthernet = "Object Repository/Gateway_Configuration/Edit_Action_Popup/Advanced Configs/label_Ethernet"
String radioButtonSerial = "Object Repository/Gateway_Configuration/Edit_Action_Popup/Advanced Configs/radioButton_Serial"
String labelSerial = "Object Repository/Gateway_Configuration/Edit_Action_Popup/Advanced Configs/label_Serial"
String labelDisableSlowSpeed = "Object Repository/Gateway_Configuration/Edit_Action_Popup/Advanced Configs/label_DisableSlowSpeed"
String inputDisableSlowSpeed = "Object Repository/Gateway_Configuration/Edit_Action_Popup/Advanced Configs/checkbox_Enable Disable Slow Speed"
String labelCommands = "Object Repository/Gateway_Configuration/Edit_Action_Popup/Advanced Configs/label_Commands"

String commandsSettingsIcon = "Object Repository/Gateway_Configuration/Edit_Action_Popup/Advanced Configs/Commands_Icon"
String commandsCountObject = "Object Repository/Gateway_Configuration/Edit_Action_Popup/Commands popup/Command Count"

WebUI.verifyEqual(WebUI.getText(findTestObject(labelAdapterName)), 'Adapter Name')
WebUI.verifyEqual(WebUI.getText(findTestObject(labelGroupName)), 'Group Name')
WebUI.verifyEqual(WebUI.getText(findTestObject(labelIP)), 'IP')
WebUI.verifyEqual(WebUI.getText(findTestObject(labelPort)), 'Port')
WebUI.verifyEqual(WebUI.getText(findTestObject(labelSamplingRate)), 'Sampling Rate')


WebUI.verifyEqual(WebUI.getText(findTestObject(AdapterName)), 'Ascent AP 10 Adapter 1')
WebUI.verifyEqual(WebUI.getText(findTestObject(GroupName)), '')

String communication = WebUI.getText(findTestObject(communicationChannel))
//println("Port and IP:"+ communication)
String[] Split = communication.split(":")
String IP = Split[0]
//println("IP:"+ IP)
String Port = Split[1]

WebUI.verifyEqual(IP, 'aedevicesimulatorcontainer')
WebUI.verifyEqual(Port, '1600')
WebUI.verifyEqual(WebUI.getText(findTestObject(inputSamplingRate)), '10 Hz')

WebUI.verifyEqual(WebUI.getText(findTestObject(labelcheckbox)), 'Enable FastDAQ')

WebUI.verifyEqual(CustomKeywords.'customKeywords.customKeywordClass.verifyBackgroundColor'(checkboxFastDAQ), 'false', FailureHandling.CONTINUE_ON_FAILURE)
WebUI.click(checkboxFastDAQ)

WebUI.scrollToElement(findTestObject(labelHourlyCaptureLimit), 1)
WebUI.verifyEqual(WebUI.getText(findTestObject(labelHoldCaptureFor)), 'Hold Captures for')
WebUI.verifyEqual(WebUI.getText(findTestObject(inputHoldCaptureFor)), '10 secs')
WebUI.verifyEqual(WebUI.getText(findTestObject(labelMemoryType)), 'Memory Type')
WebUI.verifyEqual(WebUI.getText(findTestObject(inputMemoryType)), 'FPGA RAM')
WebUI.verifyEqual(WebUI.getText(findTestObject(labelTrigger)), 'Trigger')
WebUI.verifyEqual(WebUI.getText(findTestObject(inputTrigger)), 'Micro Arc')
WebUI.verifyEqual(WebUI.getText(findTestObject(labelThresholdV)), 'Threshold V/I')
WebUI.verifyEqual(WebUI.getText(findTestObject(inputThresholdV)), 'Voltage')
WebUI.verifyEqual(WebUI.getText(findTestObject(labelThresholdCrossing)), 'Threshold Crossing')
WebUI.verifyEqual(WebUI.getText(findTestObject(inputThresholdCrossing)), 'Above Threshold Setpoint')
WebUI.verifyEqual(WebUI.getText(findTestObject(labelTimeInterval)), 'Time Interval')
WebUI.verifyEqual(WebUI.getText(findTestObject(inputTimeInterval)), '1 hour')
WebUI.verifyEqual(WebUI.getText(findTestObject(labelSampleRateFastDAQ)), 'Sampling Rate (Hz)')
WebUI.verifyEqual(WebUI.getText(findTestObject(inputSampleRateFastDAQ)), '1 us [1 MHz]')
WebUI.verifyEqual(WebUI.getText(findTestObject(labelHourlyCaptureLimit)), 'Hourly Capture Limit')
//WebUI.verifyEqual(WebUI.getText(findTestObject(inputHourlyCaptureLimit)), '5')

WebUI.verifyElementClickable(findTestObject(advancedSettingsIcon))
WebUI.click(findTestObject(advancedSettingsIcon))
WebUI.verifyEqual(WebUI.getText(findTestObject(labelCommunicationMode)), 'Communication Mode')
WebUI.verifyEqual(CustomKeywords.'customKeywords.customKeywordClass.verifyBackgroundColor'(radioButtonMoxa), 'false', FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyEqual(WebUI.getText(findTestObject(labelMoxa)), 'Moxa NPort')
WebUI.verifyEqual(CustomKeywords.'customKeywords.customKeywordClass.verifyBackgroundColor'(radioButtonAEBusGateway), 'false', FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyEqual(WebUI.getText(findTestObject(labelAEBusGateway)), 'AEBus Gateway')
WebUI.verifyEqual(CustomKeywords.'customKeywords.customKeywordClass.verifyBackgroundColor'(radioButtonEthernet), 'true', FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyEqual(WebUI.getText(findTestObject(labelEthernet)), 'Ethernet')
WebUI.verifyEqual(CustomKeywords.'customKeywords.customKeywordClass.verifyBackgroundColor'(radioButtonSerial), 'false', FailureHandling.CONTINUE_ON_FAILURE)
WebUI.verifyEqual(WebUI.getText(findTestObject(labelSerial)), 'Serial')

WebUI.click(findTestObject(commandsSettingsIcon))
WebUI.callTestCase(findTestCase('Test Cases/Gateway/Adapter(s) Configuration/Verify Default Commands'),null,FailureHandling.STOP_ON_FAILURE)

//findTestData(data).getRowNumbers()
//for(def rowNum=1;rowNum<=findTestData(data).getRowNumbers();rowNum++) {
//	GlobalVariable.Date = findTestData(data).getValue(1, rowNum)
//	//WebUI.comment("Start Date is -> " + GlobalVariable.Date)
//	GlobalVariable.logType = findTestData(data).getValue(2, rowNum)
//	GlobalVariable.startTime = findTestData(data).getValue(3, rowNum)
//	GlobalVariable.endTime = findTestData(data).getValue(4, rowNum)
//		
//	WebUI.callTestCase(findTestCase('Test Cases/Attendance/Functional/Search MissingData Date'), null, FailureHandling.STOP_ON_FAILURE)
//	WebUI.callTestCase(findTestCase('Test Cases/Attendance/Functional/Add Time Log'), null, FailureHandling.STOP_ON_FAILURE)
//
//}
//
//List<WebElement> allElements = WebUI.findWebElements(findTestObject('Object Repository/Gateway_Configuration/Edit_Action_Popup/Commands popup/Command Count'),2)
//// Get the count of the elements
//int elementCount = allElements.size()
//// Print the count to the console
//println("There are ${elementCount} elements on the page.")