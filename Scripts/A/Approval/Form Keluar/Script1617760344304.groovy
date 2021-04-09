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

WebUI.click(findTestObject('Object Repository/Approval/a_Form Keluar'))

WebUI.click(findTestObject('Object Repository/Approval/a_Disetujui'))

WebUI.click(findTestObject('Object Repository/Approval/a_Ditolak'))

WebUI.click(findTestObject('Object Repository/Approval/a_Dibatalkan'))

WebUI.comment('Search by SBU data belum tampil')

WebUI.click(findTestObject('Object Repository/Approval/a_Dalam Proses'))

WebUI.setText(findTestObject('Approval/search masuk tab dlm proses'), 'PPKS')

WebUI.setText(findTestObject('Approval/search masuk tab dlm proses'), 'Barunang')

WebUI.setText(findTestObject('Approval/search masuk tab dlm proses'), '00002')

WebUI.setText(findTestObject('Approval/search masuk tab dlm proses'), 'markis')

WebUI.setText(findTestObject('Approval/search masuk tab dlm proses'), '22/03')

WebUI.click(findTestObject('Object Repository/Approval/button_Detail'))

WebUI.click(findTestObject('Object Repository/Approval/a_Generate Xls'))

WebUI.click(findTestObject('Object Repository/Approval/button_'))

