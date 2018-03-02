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

WebUI.callTestCase(findTestCase('Common/step_SearchCustomer'), [('customerToSearch') : customerToSearch], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Customer Module/Customer List/hamburger-Hamburger Menu'))

WebUI.delay(2)

WebUI.click(findTestObject('Customer Module/Customer Profile/button_Direct Swap'))

if (WebUI.verifyElementVisible(findTestObject('Customer Module/Initiate Direct Swap/dropdown_Select Item To Swap'), FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Customer Module/Initiate Direct Swap/dropdown_Select Item To Swap'))

    WebUI.delay(2)

    WebUI.click(findTestObject('Customer Module/Initiate Direct Swap/label_Item to Swap', [('itemToSwap') : itemToSwap]))
}

WebUI.setText(findTestObject('Customer Module/Initiate Direct Swap/input_Enter Reason'), Reason)

WebUI.click(findTestObject('Customer Module/Initiate Direct Swap/button_Initiate'))

