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

Mobile.tap(findTestObject('Object Repository/ADD Task/btn_add'), 0)

Mobile.setText(findTestObject('Object Repository/ADD Task/text_task title'), tasktitle, 0)

Mobile.setText(findTestObject('Object Repository/ADD Task/text_whatistobedone'), description, 0)

if (UseCustomDate) {
    Mobile.tap(findTestObject('Object Repository/ADD Task/btn_date'), 0)

    Mobile.tap(findTestObject('Object Repository/ADD Task/btn_tgl_29'), 0)

    Mobile.tap(findTestObject('Object Repository/ADD Task/btn_oke_date'), 0)
} else {
    Mobile.tap(findTestObject('Object Repository/ADD Task/btn_date'), 0)

    Mobile.tap(findTestObject('Object Repository/ADD Task/btn_oke_date'), 0)
}

Mobile.tap(findTestObject('Object Repository/ADD Task/btn_time'), 0)

Mobile.tap(findTestObject('Object Repository/ADD Task/btn_jam'), 0)

Mobile.tap(findTestObject('Object Repository/ADD Task/btn_menit'), 0)

Mobile.tap(findTestObject('Object Repository/ADD Task/btn_oke_time'), 0)

Mobile.tap(findTestObject('Object Repository/ADD Task/dropdown_category'), 0)

switch (category) {
    case 'Banking':
        Mobile.tap(findTestObject('Object Repository/Add Category/text_banking'), 0)

        break
    case 'Business':
        Mobile.tap(findTestObject('Object Repository/Add Category/text_business'), 0)

        break
    case 'Insurance':
        Mobile.tap(findTestObject('Object Repository/Add Category/text_insurance'), 0)

        break
    case 'Personal':
        Mobile.tap(findTestObject('Object Repository/Add Category/text_personal'), 0)

        break
    case 'Shopping':
        Mobile.tap(findTestObject('Object Repository/Add Category/text_shopping'), 0)

        break
    default:
        break
}

Mobile.tap(findTestObject('Object Repository/ADD Task/btn_centang'), 0)

Mobile.verifyElementText(findTestObject('ADD Task/text_titleverificator'), tasktitle)

