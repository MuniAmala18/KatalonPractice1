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

WebUI.click(findTestObject('Object Repository/Product_Navigation/Page_Swag Labs/div_Sauce Labs Backpack'))

WebUI.navigateToUrl('https://www.saucedemo.com/v1/inventory-item.html?id=4')

WebUI.verifyElementVisible(findTestObject('Object Repository/Product_Navigation/Page_Swag Labs/img_- Back_inventory_details_img'))

WebUI.verifyElementText(findTestObject('Object Repository/Product_Navigation/Page_Swag Labs/div_Sauce Labs Backpack'), 'Sauce Labs Backpack')

WebUI.click(findTestObject('Object Repository/Product_Navigation/Page_Swag Labs/div_Swag Labs'))

WebUI.click(findTestObject('Object Repository/Product_Navigation/Page_Swag Labs/button_Open Menu'))

WebUI.click(findTestObject('Object Repository/Product_Navigation/Page_Swag Labs/a_All Items'))

WebUI.click(findTestObject('Object Repository/Product_Navigation/Page_Swag Labs/div_Sauce Labs Fleece JacketIts not every d_e9a1b2'))

WebUI.click(findTestObject('Object Repository/Product_Navigation/Page_Swag Labs/img_ADD TO CART_inventory_item_img'))

WebUI.click(findTestObject('Object Repository/Product_Navigation/Page_Swag Labs/button_Open Menu'))

WebUI.click(findTestObject('Object Repository/Product_Navigation/Page_Swag Labs/a_Logout'))

WebUI.closeBrowser()

