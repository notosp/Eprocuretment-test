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

WebUI.click(findTestObject('Approval/a_Approval'))

WebUI.click(findTestObject('Approval/a_Form Masuk'))

WebUI.click(findTestObject('Approval/a_Purchase Order'))

WebUI.click(findTestObject('Approval/a_Receiving'))

WebUI.click(findTestObject('Approval/a_Issuance'))

WebUI.click(findTestObject('Approval/a_Purchase Request'))

WebUI.setText(findTestObject('Approval/search form masuk'), '008')

WebUI.click(findTestObject('Approval/a_Persetujuan_btn btn-sm btn-success btnEdit tooltips'))

WebUI.click(findTestObject('B/Approval/input_Tanggal PR_form-control text-center'))

WebUI.doubleClick(findTestObject('B/Approval/span_SIS - Surya Inti Sawit Kahuripan'))

WebUI.doubleClick(findTestObject('B/Approval/span_ESBMR - Barunang Miri'))

WebUI.doubleClick(findTestObject('B/Approval/span_002 - CONSUMABLE MATERIALS AND SUPPLIES'))

WebUI.doubleClick(findTestObject('B/Approval/span_00013 - GENERAL CONSUMABLE MATERIAL AN_8cead0'))

WebUI.setText(findTestObject('B/Approval/textarea_keterangan pr'), 'keterangan pr testing')

WebUI.setText(findTestObject('B/Approval/input_EA - EACH_qty'), '2')

WebUI.click(findTestObject('B/Approval/span_EA - EACH'))

WebUI.click(findTestObject('B/Approval/input_EA - EACH_price'))

//WebUI.comment('Jika PR Di Tolak')
//
//WebUI.click(findTestObject('Object Repository/B/Approval/button_Tolak'))
//
//WebUI.setText(findTestObject('Object Repository/B/Approval/textarea_Catatan Penolakan_remarks_revisi_cancel'), 'pr ini ditolak (test)')
//
//WebUI.waitForElementPresent(findTestObject('B/Approval/button_Proses'), 5)
WebUI.comment('Jika PR di setujui')

WebUI.click(findTestObject('B/Approval/button_Setuju'))

WebUI.click(findTestObject('B/Approval/span_Silahkan pilih Penyetuju'))

WebUI.click(findTestObject('B/Approval/li_Hartono Hartono'))

WebUI.setText(findTestObject('B/Approval/textarea_Catatan Persetujuan_remarks'), 'testing setujui pr')

WebUI.click(findTestObject('B/Approval/icon_close'))

