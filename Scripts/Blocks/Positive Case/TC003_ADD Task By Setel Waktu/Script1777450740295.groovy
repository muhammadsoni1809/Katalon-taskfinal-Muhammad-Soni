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

Mobile.startApplication('/Users/macbookpro/Downloads/Todo_2.0_APKPure.apk', true)

Mobile.tap(findTestObject('Object Repository/ADD Task 2/btn_ADD'), 0)

Mobile.setText(findTestObject('Object Repository/ADD Task 2/text_task_title'), 'Jam Kerja', 0)

Mobile.setText(findTestObject('Object Repository/ADD Task 2/text_whatistobedone'), 'Kerja Jam 08:00 WIB', 0)

Mobile.tap(findTestObject('Object Repository/ADD Task 2/btn_date'), 0)

Mobile.tap(findTestObject('Object Repository/ADD Task 2/btn_tgl_29'), 0)

Mobile.tap(findTestObject('Object Repository/ADD Task 2/btn_oke'), 0)

Mobile.tap(findTestObject('Object Repository/ADD Task 2/btn_time'), 0)

Mobile.tap(findTestObject('Object Repository/ADD Task 2/btn_setel_waktu'), 0)

Mobile.setText(findTestObject('ADD Task 2/text_jam1'), '8', 0)

Mobile.setText(findTestObject('ADD Task 2/text_menit1'), '00', 0)

Mobile.tap(findTestObject('Object Repository/ADD Task 2/dropdown_waktu'), 0)

Mobile.tap(findTestObject('Object Repository/ADD Task 2/btn_AM'), 0)

Mobile.tap(findTestObject('Object Repository/ADD Task 2/btn_oke_time'), 0)

Mobile.tap(findTestObject('Object Repository/ADD Task 2/dropdown_category'), 0)

Mobile.tap(findTestObject('Object Repository/ADD Task 2/btn_category'), 0)

Mobile.tap(findTestObject('Object Repository/ADD Task 2/btn_centang'), 0)

Mobile.tap(findTestObject('Object Repository/ADD Task 2/btn_detail_task'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/ADD Task 2/text_detail_task'), 'Jam Kerja')

Mobile.closeApplication()

