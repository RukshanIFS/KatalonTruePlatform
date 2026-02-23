import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.ifs26r1samifsloops.common.setDefaultLanguageAndBusinessDetails
import truetest.ifs26r1samifsloops.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(2048, 1018)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /landing-page"

TrueTestScripts.navigate("landing-page")

"Step 2: Click on link ifsiCloud -> Navigate to page '/auth/realms/*/protocol/openid-connect/auth'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_landing_page/link_ifsiCloud'))

"Step 3: Login into Application"

TrueTestScripts.login()

"Step 4: Navigate to /main/ifsapplications/web/*"

TrueTestScripts.navigate("main/ifsapplications/web/${web_id}")

"Step 5: Click on input findPage"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web/input_findPage'))

"Step 6: Enter input value in input findPage"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web/input_findPage'), input_findPage)

"Step 7: Click on link relationshipManagement -> Navigate to page '/main/ifsapplications/web/page/CrmCustomer/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web/link_relationshipManagement'))

"Step 8: Click on button new"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_new'))

"Step 9: Click on inputField dynamicObject (defaultLanguage)"

// Bind values to the variables in the locators of "AI-Generated/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_CrmCustomer/inputField_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_CrmCustomer/inputField_dynamicObject', ['inputField_dynamicObject_css_value_1': inputField_dynamicObject_css_value]))

"Step 10: Click on input name"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_name'))

"Step 11: Enter input value in input name2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_name2'), input_name2)

"Step 12: Click on input category"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_category'))

"Step 13: Enter input value in input category2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_category2'), input_category2)

"Step 14: Click on item customer"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/item_customer'))

"Step 15: Set default language and input business country details."

setDefaultLanguageAndBusinessDetails.execute(input_country2, input_defaultLanguage2, item_businessDetails_css_value)

"Step 16: Click on item afghanistan"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/item_afghanistan'))

"Step 17: Click on button crmActions (save)"

// Bind values to the variables in the locators of "AI-Generated/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_CrmCustomer/button_crmAction"
WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_CrmCustomer/button_crmAction', ['button_crmAction_ButtonTitle_1': button_crmAction_ButtonTitle, 'button_crmAction_css_value_1': button_crmAction_css_value]))

"Step 18: Click on button crmActions (newBusinessOpportunity)"

// Bind values to the variables in the locators of "AI-Generated/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_CrmCustomer/button_crmActions"
WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_CrmCustomer/button_crmActions', ['button_crmActions_ButtonTitle_4': button_crmActions_ButtonTitle, 'button_crmActions_css_value_2': button_crmActions_css_value]))

"Step 19: Enter input value in input opportunityDescription"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_opportunityDescription'), input_opportunityDescription)

"Step 20: Click on input currency"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_currency'))

"Step 21: Enter input value in input currency2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_currency2'), input_currency2)

"Step 22: Click on item currencyRepresentative (usdCurrency)"

// Bind values to the variables in the locators of "AI-Generated/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_CrmCustomer/item_currencyRepresentative"
WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_CrmCustomer/item_currencyRepresentative', ['item_currencyRepresentative_Id_1': item_currencyRepresentative_Id, 'item_currencyRepresentative_css_value_1': item_currencyRepresentative_css_value]))

"Step 23: Click on input mainRepresentative3"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_mainRepresentative3'))

"Step 24: Enter input value in input mainRepresentative4"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_mainRepresentative4'), input_mainRepresentative4)

"Step 25: Click on item currencyRepresentative (mainRepresentative)"

// Bind values to the variables in the locators of "AI-Generated/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_CrmCustomer/item_currencyRepresentative"
WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_CrmCustomer/item_currencyRepresentative', ['item_currencyRepresentative_Id_1': item_currencyRepresentative_Id_1, 'item_currencyRepresentative_css_value_1': item_currencyRepresentative_css_value_1]))

"Step 26: Click on button ok2"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_ok2'))

"Step 27: Click on button no"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_no'))

"Step 28: Click on fndTabHeader involvedParties"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/fndTabHeader_involvedParties'))

"Step 29: Click on div pageContent"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/div_pageContent'))

"Step 30: Click on fndTabHeader references"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/fndTabHeader_references'))

"Step 31: Click on div businessOpportunities"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/div_businessOpportunities'))

"Step 32: Click on input checkbox"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_checkbox'))

"Step 33: Click on div menuTrigger"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/div_menuTrigger'))

"Step 34: Click on link details -> Navigate to page '/main/ifsapplications/web/page/BusinessOpportunity/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/link_details'))

"Step 35: Click on button deleteSelectedRecord"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/button_deleteSelectedRecord'))

"Step 36: Click on button deleteRecord -> Navigate to page '/main/ifsapplications/web/page/CrmCustomer/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/button_deleteRecord'))

"Step 37: Click on button deleteRecord"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_deleteRecord'))

"Step 38: Click on button delete2 -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_delete2_1'))

"Step 39: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Create Business Opportunities and Manage Customer Records_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}