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


WebUI.openBrowser('https://qa.bento-tools.org/#/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Test_BentoDemo/Page_Bento/a_cases'))

WebUI.click(findTestObject('Test_BentoDemo/Page_Bento/svg_Diagnosis_MuiSvgIcon-root'))

WebUI.check(findTestObject('Test_BentoDemo/Page_Bento/div_Mucinous (colloid) Carcinoma(70)'))

WebUI.verifyElementText(findTestObject('Test_BentoDemo/Page_Bento/div_70'), '70')

WebUI.check(findTestObject('Test_BentoDemo/Page_Bento/td_Age (years)_MuiTableCell-root-9497 MuiTableCell-body-9499 jss9486 jss9488 MuiTableCell-paddingCheckbox-9502'))

WebUI.click(findTestObject('Test_BentoDemo/Page_Bento/button_Add Selected Files'))

WebUI.closeBrowser()

