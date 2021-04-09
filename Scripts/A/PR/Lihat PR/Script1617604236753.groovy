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

WebUI.click(findTestObject('PR/Lihat PR/a_Purchase Request'))

WebUI.click(findTestObject('PR/Lihat PR/a_Lihat PR'))

WebUI.setText(findTestObject('PR/Lihat PR/input_Search_form-control form-control-sm'), '01')

WebUI.setText(findTestObject('PR/Lihat PR/input_Search_form-control form-control-sm'), 'sis')

WebUI.setText(findTestObject('PR/Lihat PR/input_Search_form-control form-control-sm'), 'mark')

WebUI.setText(findTestObject('PR/Lihat PR/input_Search_form-control form-control-sm'), 'ruben')

WebUI.click(findTestObject('PR/Lihat PR/button_Detail'))

//WebUI.click(findTestObject('PR/Lihat PR/a_Print'))

WebUI.click(findTestObject('PR/Lihat PR/a_Generate Xls'))

//WebUI.click(findTestObject('PR/Lihat PR/a_Generate PDF'))

WebUI.click(findTestObject('PR/Lihat PR/button_icon_close'))

WebUI.click(findTestObject('PR/Lihat PR/button_Buat Request'))


WebUI.click(findTestObject('PR/Buat PR/a_PR Barang'))

WebUI.comment('Form Purchase Request')

WebUI.click(findTestObject('PR/Buat PR/span_Silahkan pilih PT'))

WebUI.click(findTestObject('PR/Buat PR/list dropdown/li_SIS - Surya Inti Sawit Kahuripan'))

WebUI.click(findTestObject('PR/Buat PR/span_Silahkan pilih SBUDept'))

WebUI.setText(findTestObject('Object Repository/PR/Buat PR/input_concat(id(, , select2-selectCompany-c_a98544'), 'es')

WebUI.click(findTestObject('PR/Buat PR/list dropdown/li_ESBMR - Barunang Miri'))

WebUI.click(findTestObject('PR/Buat PR/span_Silahkan pilih Group'))

//WebUI.setText(findTestObject('Object Repository/PR/Buat PR/input_concat(id(, , select2-selectCompany-c_a98544'), '002')
WebUI.click(findTestObject('PR/Buat PR/list dropdown/li_002 - CONSUMABLE MATERIALS AND SUPPLIES'))

WebUI.click(findTestObject('PR/Buat PR/span_Silahkan pilih Subgroup'))

//WebUI.setText(findTestObject('Object Repository/PR/Buat PR/input_concat(id(, , select2-selectCompany-c_a98544'), 'ge')
WebUI.click(findTestObject('PR/Buat PR/list dropdown/li_GENERAL CONSUMABLE MATERIAL AND SUPPLIES'))

WebUI.click(findTestObject('PR/Buat PR/span_Silahkan pilih Peminta'))

//WebUI.setText(findTestObject('Object Repository/PR/Buat PR/input_concat(id(, , select2-selectCompany-c_a98544'), 'ru')
WebUI.click(findTestObject('PR/Buat PR/list dropdown/li_Ruben Parera'))

WebUI.setText(findTestObject('PR/Buat PR/textarea_Keterangan PR_descr'), ' keterangan pr')

WebUI.comment('Tambah Daftar Barang')

WebUI.scrollToElement(findTestObject('PR/Buat PR/Div_daftarBarang'), 3)

WebUI.click(findTestObject('PR/Buat PR/button_Daftar Barang'))

WebUI.click(findTestObject('PR/Buat PR/span_Nama Barang'))

WebUI.click(findTestObject('PR/Buat PR/list dropdown/li_Nama Barang'))

WebUI.setText(findTestObject('PR/Buat PR/input_Kata Kunci_keyword'), 'kaitan')

WebUI.click(findTestObject('PR/Buat PR/button_Cari'))

WebUI.click(findTestObject('PR/Buat PR/span_Kode Barang'))

WebUI.click(findTestObject('PR/Buat PR/list dropdown/li_Kode Barang'))

WebUI.setText(findTestObject('PR/Buat PR/input_Kata Kunci_keyword'), '00011816')

WebUI.click(findTestObject('PR/Buat PR/button_Cari'))

WebUI.click(findTestObject('PR/Buat PR/span_Part Number'))

WebUI.click(findTestObject('PR/Buat PR/list dropdown/li_Part Number'))

WebUI.setText(findTestObject('PR/Buat PR/input_Kata Kunci_keyword'), '123')

WebUI.click(findTestObject('PR/Buat PR/button_Cari'))

WebUI.click(findTestObject('PR/Buat PR/span_MerkTypeSize'))

WebUI.click(findTestObject('PR/Buat PR/list dropdown/li_MerkTypeSize'))

WebUI.setText(findTestObject('PR/Buat PR/input_Kata Kunci_keyword'), 'lori')

WebUI.click(findTestObject('PR/Buat PR/button_Cari'))

WebUI.click(findTestObject('PR/Buat PR/span_Nama Barang'))

WebUI.click(findTestObject('PR/Buat PR/list dropdown/li_Semua Kategori'))

WebUI.setText(findTestObject('PR/Buat PR/input_Kata Kunci_keyword'), 'steam')

WebUI.click(findTestObject('PR/Buat PR/button_Cari'))

WebUI.click(findTestObject('PR/Buat PR/button_Part Number_btn btn-sm btn-danger to_9870c4'))

WebUI.click(findTestObject('PR/Buat PR/button_Keluar'))




