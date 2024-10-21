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

Mobile.startApplication('C:\\Users\\VedantKumarSharma\\Downloads\\google-chrome-130-0-6723-40.apk', true)

Mobile.tap(findTestObject('Object Repository/dip2go/android.widget.TextView - Chrome'), 0)

Mobile.swipe(0, 0, 0, 0)

Mobile.tap(findTestObject('Object Repository/dip2go/android.widget.EditText - Search or type web address'), 0)

Mobile.setText(findTestObject('Object Repository/dip2go/android.widget.EditText - Search or type web address'), 'https://www.pits2go.com/', 
    0)

Mobile.tap(findTestObject('Object Repository/dip2go/android.view.ViewGroup'), 0)

Mobile.swipe(0, 0, 0, 0)

Mobile.setText(findTestObject('Object Repository/dip2go/android.widget.EditText'), 'kselvaraj@kognivera.com\n', 0)

Mobile.setText(findTestObject('Object Repository/dip2go/android.widget.EditText (2)'), 'Test@12345\n', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/dip2go/android.widget.Button - Inicia sesin (1)'), 0)

Mobile.swipe(0, 0, 0, 0)

Mobile.tap(findTestObject('Object Repository/dip2go/android.view.View -'), 0)

Mobile.tap(findTestObject('Object Repository/dip2go/android.widget.Button - Categoras'), 0)

Mobile.swipe(0, 0, 0, 0)

Mobile.tap(findTestObject('Object Repository/dip2go/android.view.View (6)'), 0)

Mobile.swipe(0, 0, 0, 0)

Mobile.tap(findTestObject('Object Repository/dip2go/android.widget.Button - Agregar al Carrito (1)'), 0)

Mobile.swipe(0, 0, 0, 0)

Mobile.swipe(0, 0, 0, 0)

Mobile.scrollToText('lr al carrito')

Mobile.tap(findTestObject('Object Repository/dip2go/android.widget.Button - ESPECIFICACIONES DEL PRODUCTO'), 0)

Mobile.swipe(0, 0, 0, 0)

Mobile.tap(findTestObject('Object Repository/dip2go/android.widget.Button - Continuar'), 0)

Mobile.tap(findTestObject('Object Repository/dip2go/android.widget.Button - Aplicar'), 0)

Mobile.tap(findTestObject('Object Repository/dip2go/android.view.View (8)'), 0)

Mobile.tap(findTestObject('Object Repository/dip2go/android.widget.TextView -  2024 Pits2GO. Todos los derechos reservados'), 
    0)

Mobile.swipe(0, 0, 0, 0)

Mobile.tap(findTestObject('Object Repository/dip2go/android.widget.Button - Continuar (1)'), 0)

Mobile.tap(findTestObject('Object Repository/dip2go/android.widget.Button - Continuar (2)'), 0)

Mobile.swipe(0, 0, 0, 0)

Mobile.scrollToText('Pago en Efectivo')

Mobile.swipe(0, 0, 0, 0)

Mobile.tap(findTestObject('Object Repository/dip2go/android.view.View - Pago en Efectivo Pago en Efectivo'), 0)

Mobile.tap(findTestObject('Object Repository/dip2go/android.widget.Button - Continuar (3)'), 0)

Mobile.swipe(0, 0, 0, 0)

Mobile.tap(findTestObject('Object Repository/dip2go/android.widget.RadioButton - Bancos Negocios'), 0)

Mobile.tap(findTestObject('Object Repository/dip2go/android.widget.Button - Continuar (4)'), 0)

Mobile.closeApplication()

