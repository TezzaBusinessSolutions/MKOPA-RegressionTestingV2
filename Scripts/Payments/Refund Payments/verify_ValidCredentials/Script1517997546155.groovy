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

WebUI.setText(findTestObject('Customer Module/Customer List/input_Amount'), inputAmount)

WebUI.setText(findTestObject('Customer Module/Customer List/input_Notes'), input_Notes)

WebUI.click(findTestObject('Customer Module/Customer List/button_SubmitRefund'))

WebUI.delay(delay)

WebUI.getText(findTestObject('Customer Module/Customer List/message_RefundSuccessfull'))

String success = 'A refund of KES 10.00 has been queued for approval'

WebUI.verifyElementText(findTestObject('Customer Module/Customer List/message_RefundSuccessfull'), success)

WebUI.callTestCase(findTestCase('Payments/Refund Payments/verify_Customer Refund Approved'), [('accountNumber') : '24323310', ('approvalStatus') : 'Approved'
        , ('approvalNotes') : 'Account Approved', ('delay') : '5'], FailureHandling.STOP_ON_FAILURE)

