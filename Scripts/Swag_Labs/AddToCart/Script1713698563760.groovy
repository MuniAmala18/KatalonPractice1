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

WebUI.callTestCase(findTestCase('Swag_Labs/Swag_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Swag_AddToCart/Page_Swag Labs/button_ADD TO CART'), 0)

WebUI.click(findTestObject('Object Repository/Swag_AddToCart/Page_Swag Labs/button_ADD TO CART'))

WebUI.click(findTestObject('Object Repository/Swag_AddToCart/Page_Swag Labs/svg_Open Menu_svg-inline--fa fa-shopping-ca_f4ec0f'))

WebUI.navigateToUrl('https://www.saucedemo.com/v1/cart.html')

WebUI.rightClick(findTestObject('Object Repository/Swag_AddToCart/Page_Swag Labs/path'))

WebUI.click(findTestObject('Object Repository/Swag_AddToCart/Page_Swag Labs/div_Sauce Labs Backpack'))

WebUI.click(findTestObject('Object Repository/Swag_AddToCart/Page_Swag Labs/path'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Swag_AddToCart/Page_Swag Labs/span_1'), 0)

WebUI.click(findTestObject('Object Repository/Swag_AddToCart/Page_Swag Labs/a_Continue Shopping'))

WebUI.click(findTestObject('Object Repository/Swag_AddToCart/Page_Swag Labs/button_Open Menu'))

WebUI.click(findTestObject('Object Repository/Swag_AddToCart/Page_Swag Labs/a_Logout'))

WebUI.closeBrowser()

