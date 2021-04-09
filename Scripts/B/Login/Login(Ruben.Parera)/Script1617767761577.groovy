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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.comment('Proses Login')

WebUI.openBrowser('')

WebUI.navigateToUrl('http://127.0.0.1:8000/login')

WebUI.maximizeWindow()

WebUI.comment('Jika username atau password salah')

WebUI.setText(findTestObject('Login/input_e-PROCUREMENT_username'), 'ruben.parera')

WebUI.setEncryptedText(findTestObject('Login/input_e-PROCUREMENT_password'), 'qeJ0sjJnwEs=')

WebUI.click(findTestObject('Login/label_Remember Me'))

WebUI.sendKeys(findTestObject('Login/button_Sign In'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('Login/div_These credentials do not match our records'), 0)

WebUI.comment('Username dan Password sdh Sesuai')

WebUI.setText(findTestObject('Login/input_e-PROCUREMENT_username'), 'ruben.parera')

WebUI.setEncryptedText(findTestObject('Login/input_e-PROCUREMENT_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Login/label_Remember Me'))

WebUI.click(findTestObject('Login/button_Sign In'))

