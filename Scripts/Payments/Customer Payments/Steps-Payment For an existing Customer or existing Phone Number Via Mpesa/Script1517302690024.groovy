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

WebUI.callTestCase(findTestCase('Common/Login'), [('Email') : 'Kennedy.Mwangi@m-kopa.com', ('Password') : 'Ken0726//'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Common/Step_SearchSpecificCustomer'), [('customerToSearch') : account], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Customer Module/Customer List/link_DeviceSerial', [('deviceSerial') : deviceSerial]))

WebUI.switchToWindowTitle('Inventory item details | M-KOPAnet')

WebUI.click(findTestObject('Customer Module/Customer List/button_CreditsSent'))

WebUI.closeBrowser()

WebUI.callTestCase(findTestCase('Common/steps_Upload Payments File'), [('Amount') : amount, ('Account') : account
        , ('Phone') : phone, ('filePath') : 'C:\\Users\\dennis.gituto\\git\\MKOPA-REGRESSION-REPOSITORY\\Payment Files\\payments.csv'
        , ('Comment') : 'Nice and paid on time', ('tagged') : '', ('blankComment') : '', ('blankTag') : ''], FailureHandling.STOP_ON_FAILURE)

