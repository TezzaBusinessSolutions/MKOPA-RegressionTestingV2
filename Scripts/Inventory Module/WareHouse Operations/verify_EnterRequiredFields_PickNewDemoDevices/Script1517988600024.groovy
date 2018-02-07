import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Common/UserLogin'), [('Email') : 'Kennedy.Mwangi@m-kopa.com', ('Password') : 'Ken0726//'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Inventory Module/Common/step_DemoDevices'), [('request_Notes') : 'QA Testing', ('delay') : '5'
        , ('serial_Number') : '0416010902-000005', ('code') : 'PRD-LINE'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Inventory Module/Demo Devices List/link_PickNewDemoDevice'))

WebUI.setText(findTestObject('Inventory Module/Pick New Demo Devices/input_Request Notes'), request_Notes)

WebUI.click(findTestObject('Inventory Module/Pick New Demo Devices/dropdown_DeviceType'))

WebUI.delay(delay)

WebUI.click(findTestObject('Inventory Module/Pick New Demo Devices/select_DeviceType', [('device_type') : device_type]))

WebUI.delay(delay)

WebUI.click(findTestObject('Inventory Module/Pick New Demo Devices/dropdown_Packaging'))

WebUI.delay(delay)

WebUI.click(findTestObject('Inventory Module/Pick New Demo Devices/select_Packaging', [('packaging') : packaging]))

WebUI.delay(10)

WebUI.sendKeys(findTestObject('Inventory Module/Pick New Demo Devices/input_SerialNumber'), serial_Number)

WebUI.delay(delay)

WebUI.click(findTestObject('Inventory Module/Pick New Demo Devices/button_LoadDevice'))

WebUI.delay(delay)

WebUI.click(findTestObject('Inventory Module/Pick New Demo Devices/select_AvailableDevices'))

WebUI.click(findTestObject('Inventory Module/Pick New Demo Devices/button_AddDeviceToRequest'))

WebUI.verifyAlertPresent(delay)

