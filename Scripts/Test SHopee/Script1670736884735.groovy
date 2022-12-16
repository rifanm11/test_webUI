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

Mobile.startApplication('/Users/rifan.meldiana/Katalon Studio/Rifan_Android/androidapp/shopee_713.apk', true)

Mobile.tapAndHold(findTestObject('Object Repository/Application/Shopee/android.widget.ImageView'), 0, 0)

Mobile.scrollToText('Enter the url')

Mobile.setText(findTestObject('Object Repository/Application/Shopee/android.widget.EditText - Enter the url you want to navigate to'), 
    'https://games.test.shopee.co.id/word-puzzle-fe/?activity=ff4992060d17508e', 0)

Mobile.tap(findTestObject('Object Repository/Application/Shopee/android.widget.Button - GO'), 0)

Mobile.closeApplication()

