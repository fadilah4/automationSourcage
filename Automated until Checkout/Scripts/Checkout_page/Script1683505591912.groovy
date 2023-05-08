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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.navigateToUrl('https://staging-demo-marketplace.sourcesage.co/')

WebUI.setText(findTestObject('Object Repository/Page_Login  Demo/input_Please login with your username and p_96afab'), 'tester1@sourcesage.co')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login  Demo/input_Please login with your username and p_8ee08b'), 
    'p4y+y39Ir5O++RH4jAhtiA==')

WebUI.click(findTestObject('Object Repository/Page_Login  Demo/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Demo/span_View All Products'))

WebUI.click(findTestObject('Object Repository/Page_Demo/button_Sort By_ant-btn ant-tooltip-open ant_857359'))

WebUI.click(findTestObject('Object Repository/Page_Demo/svg'))

WebUI.click(findTestObject('Object Repository/Page_Cart  Demo/button_Create Purchase Request'))

WebUI.click(findTestObject('Object Repository/Page_Cart  Demo/button_OK'))

