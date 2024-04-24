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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://petstore.octoperf.com/')

WebUI.click(findTestObject('Object Repository/JpetLogin/Page_JPetStore Demo/a_Enter the Store'))

WebUI.click(findTestObject('Object Repository/JpetLogin/Page_JPetStore Demo/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/JpetLogin/Page_JPetStore Demo/input_Need a user name and password_username'), 
    'raj1')

WebUI.setEncryptedText(findTestObject('Object Repository/JpetLogin/Page_JPetStore Demo/input_Need a user name and password_password'), 
    'qPDWtMYEx+8=')

WebUI.click(findTestObject('Object Repository/JpetLogin/Page_JPetStore Demo/p_UsernamesetTimeout(function()tryvar zdocu_67db2e'))

WebUI.setEncryptedText(findTestObject('Object Repository/JpetLogin/Page_JPetStore Demo/input_Need a user name and password_password'), 
    'F1QkgKVvKLQ=')

WebUI.click(findTestObject('Object Repository/JpetLogin/Page_JPetStore Demo/input_Need a user name and password_signon'))

WebUI.verifyElementPresent(findTestObject('Object Repository/JpetLogin/Page_JPetStore Demo/div_Welcome raj1'), 0)
