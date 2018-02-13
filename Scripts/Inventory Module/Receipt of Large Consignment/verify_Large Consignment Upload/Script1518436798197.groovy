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

CustomKeywords.'manifestUploads.largeConsignmentManifest.largeConsignmentManifest'()

WebUI.delay(20)

WebUI.callTestCase(findTestCase('Inventory Module/Receipt of Large Consignment/steps_Large Consignment Manifest Upload'), 
    [('itemType') : itemType, ('supplier') : supplier, ('manifestType') : manifestType, ('shippingDate') : shippingDate, ('loanDraw') : loanDraw
        , ('selectId') : selectId, ('consignmentNo') : consignmentNo], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.check(findTestObject('Inventory Module/Device Manifest Upload/radio_Close Consignment', [('condition') : condition]))

WebUI.click(findTestObject('Inventory Module/Device Manifest Upload/button_Save'))

WebUI.delay(2)

successMessage = WebUI.getText(findTestObject('Inventory Module/Device Manifest Upload/section_Manifest Details'))

WebUI.verifyTextPresent(successMessage, false)

WebUI.delay(2)

WebUI.closeBrowser()
