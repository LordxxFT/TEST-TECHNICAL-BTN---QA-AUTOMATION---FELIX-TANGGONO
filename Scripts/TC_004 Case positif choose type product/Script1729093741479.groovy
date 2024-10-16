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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://practice.automationtesting.in/shop/')

WebUI.click(findTestObject('Object Repository/Page_Products  Automation Practice Site/a_HTML'))

WebUI.click(findTestObject('Object Repository/Page_HTML  Automation Practice Site/a_Add to basket (HTML5 Form)'))

WebUI.click(findTestObject('Object Repository/Page_HTML  Automation Practice Site/a_Add to basket (HTML 5 Web Development)'))

WebUI.click(findTestObject('Object Repository/Page_HTML  Automation Practice Site/a_Add to basket (Thinking in HTML)'))

WebUI.click(findTestObject('Object Repository/Page_HTML  Automation Practice Site/i_Demo Site_wpmenucart-icon-shopping-cart-0'))

WebUI.click(findTestObject('Page_Basket  Automation Practice Site/a_Proceed to Checkout2'))

WebUI.setText(findTestObject('Page_Checkout  Automation Practice Site/input__billing_first_name'), First_name)

WebUI.setText(findTestObject('Page_Checkout  Automation Practice Site/input__billing_last_name'), Last_name)

WebUI.setText(findTestObject('Page_Checkout  Automation Practice Site/input_Company Name_billing_company'), Company_name)

WebUI.setText(findTestObject('Page_Checkout  Automation Practice Site/input__billing_email'), Email)

WebUI.setText(findTestObject('Page_Checkout  Automation Practice Site/input__billing_phone'), Phone)

WebUI.setText(findTestObject('Page_Checkout  Automation Practice Site/input__billing_address_1'), Address1)

WebUI.setText(findTestObject('Page_Checkout  Automation Practice Site/input__billing_address_2'), Address2)

WebUI.setText(findTestObject('Page_Checkout  Automation Practice Site/input__billing_city'), City)

WebUI.setText(findTestObject('Page_Checkout  Automation Practice Site/input__billing_postcode'), Postcode)

WebUI.click(findTestObject('Page_Checkout  Automation Practice Site/input_PayPal Express Checkout_woocommerce_c_e63d9c'))

WebUI.delay(4)

WebUI.closeBrowser()

