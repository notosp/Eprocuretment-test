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

WebUI.comment('Tampilan Dashboard')

WebUI.click(findTestObject('Dashboard/a_Tidak ada pemberitahuan saat ini_nav-link'))

WebUI.comment('Nama object icon garis 3 masih sama dengan icon Notif lonceng')

WebUI.click(findTestObject('Dashboard/a_Tidak ada pemberitahuan saat ini_nav-link'))

WebUI.click(findTestObject('Object Repository/Dashboard/button_Today'))

WebUI.click(findTestObject('Object Repository/Dashboard/button_Last 7 Days'))

WebUI.click(findTestObject('Object Repository/Dashboard/button_This Month'))

WebUI.click(findTestObject('Object Repository/Dashboard/button_This Year'))

WebUI.click(findTestObject('Dashboard/a_Tidak ada pemberitahuan saat ini_nav-link'))

