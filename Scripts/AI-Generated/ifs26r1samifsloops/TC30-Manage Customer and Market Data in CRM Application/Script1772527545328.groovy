import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.ifs26r1samifsloops.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(2048, 966)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /auth/realms/*/protocol/openid-connect/auth with params (client id, nonce, redirect uri, response type, scope, state)"

TrueTestScripts.navigate("auth/realms/${realms_id}/protocol/openid-connect/auth", ["client_id": auth_client_id, "nonce": auth_nonce, "redirect_uri": auth_redirect_uri, "response_type": auth_response_type, "scope": auth_scope, "state": auth_state])

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Navigate to /main/ifsapplications/web/page/CrmCustomer/*"

TrueTestScripts.navigate("main/ifsapplications/web/page/CrmCustomer/${CrmCustomer_id}")

"Step 4: Click on button new"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_new'))

"Step 5: Click on input name"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_name'))

"Step 6: Enter input value in input name2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_name2'), input_name2)

"Step 7: Click on input category"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_category'))

"Step 8: Enter input value in input category2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_category2'), input_category2)

"Step 9: Click on item customerOption"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/item_customerOption'))

"Step 10: Click on input defaultLanguage"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_defaultLanguage'))

"Step 11: Enter input value in input defaultLanguage2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_defaultLanguage2'), input_defaultLanguage2)

"Step 12: Click on item languageOption"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/item_languageOption'))

"Step 13: Click on input country"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_country'))

"Step 14: Enter input value in input country2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_country2'), input_country2)

"Step 15: Click on item option"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/item_option'))

"Step 16: Click on button save -> Navigate to page '/main/ifsapplications/web/page/SalesMarkets/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_save'))

"Step 17: Click on button new"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_SalesMarkets/button_new'))

"Step 18: Enter input value in input marketCode"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_SalesMarkets/input_marketCode'), input_marketCode)

"Step 19: Click on input description"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_SalesMarkets/input_description'))

"Step 20: Enter input value in input description2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_SalesMarkets/input_description2'), input_description2)

"Step 21: Click on button save -> Navigate to page '/main/ifsapplications/web/page/BusinessOpportunity/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_SalesMarkets/button_save'))

"Step 22: Click on button new"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/button_new'))

"Step 23: Click on input description"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/input_description'))

"Step 24: Enter input value in input description2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/input_description2'), input_description2_1)

"Step 25: Click on input account"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/input_account'))

"Step 26: Enter input value in input account2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/input_account2'), input_account2)

"Step 27: Click on item crmAcc1234"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/item_crmAcc1234'))

"Step 28: Click on input market"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/input_market'))

"Step 29: Enter input value in input market2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/input_market2'), input_market2)

"Step 30: Click on item crmMl1234"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/item_crmMl1234'))

"Step 31: Click on input currencyCode"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/input_currencyCode'))

"Step 32: Enter input value in input currencyCode2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/input_currencyCode2'), input_currencyCode2)

"Step 33: Click on item currency"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/item_currency'))

"Step 34: Click on button save"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/button_save'))

"Step 35: Click on input mainRepresentative"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/input_mainRepresentative'))

"Step 36: Click on input mainRepresentative2"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/input_mainRepresentative2'))

"Step 37: Enter input value in input mainRepresentative2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/input_mainRepresentative2'), input_mainRepresentative2)

"Step 38: Click on item customerRepresentative"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/item_customerRepresentative'))

"Step 39: Click on button save"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/button_save'))

"Step 40: Click on button status"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/button_status'))

"Step 41: Click on button confirm -> Navigate to page '/main/ifsapplications/web/page/SalesContractTypes/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/button_confirm'))

"Step 42: Click on button new"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_SalesContractTypes/button_new'))

"Step 43: Click on button save"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_SalesContractTypes/button_save'))

"Step 44: Click on input contractType"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_SalesContractTypes/input_contractType'))

"Step 45: Enter input value in input contractType2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_SalesContractTypes/input_contractType2'), input_contractType2)

"Step 46: Click on input typeDescription"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_SalesContractTypes/input_typeDescription'))

"Step 47: Enter input value in input typeDescription2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_SalesContractTypes/input_typeDescription2'), input_typeDescription2)

"Step 48: Click on button save2 -> Navigate to page '/main/ifsapplications/web/page/BusinessOpportunity/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_SalesContractTypes/button_save2'))

"Step 49: Click on graniteChip searchPanel"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/graniteChip_searchPanel'))

"Step 50: Click on graniteChip search"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/graniteChip_search'))

"Step 51: Click on graniteChip advanced"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/graniteChip_advanced'))

"Step 52: Click on textarea advancedSearch"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/textarea_advancedSearch'))

"Step 53: Enter input value in textarea advancedSearch"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/textarea_advancedSearch'), textarea_advancedSearch)

"Step 54: Click on button search"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/button_search'))

"Step 55: Click on div involvedParties"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/div_involvedParties'))

"Step 56: Click on button new2"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/button_new2'))

"Step 57: Enter input value in input competitor"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/input_competitor'), input_competitor)

"Step 58: Click on item customerRepresentative2"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/item_customerRepresentative2'))

"Step 59: Click on input competitiveAdvantage"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/input_competitiveAdvantage'))

"Step 60: Click on button picker"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/button_picker'))

"Step 61: Enter input value in input competitiveAdvantage2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/input_competitiveAdvantage2'), input_competitiveAdvantage2)

"Step 62: Click on item service"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/item_service'))

"Step 63: Click on button save2"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/button_save2'))

"Step 64: Click on button delete"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/button_delete'))

"Step 65: Click on button delete2"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/button_delete2'))

"Step 66: Click on graniteChip advanced"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/graniteChip_advanced'))

"Step 67: Click on textarea advancedSearch"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/textarea_advancedSearch'))

"Step 68: Enter input value in textarea advancedSearch"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/textarea_advancedSearch'), textarea_advancedSearch_1)

"Step 69: Click on button search"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/button_search'))

"Step 70: Click on button deleteRecord"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/button_deleteRecord'))

"Step 71: Click on button delete2 -> Navigate to page '/main/ifsapplications/web/page/SalesMarkets/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/button_delete2'))

"Step 72: Click on graniteChip search"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_SalesMarkets/graniteChip_search'))

"Step 73: Click on graniteChip advanced"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_SalesMarkets/graniteChip_advanced'))

"Step 74: Click on textarea advancedSearch"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_SalesMarkets/textarea_advancedSearch'))

"Step 75: Enter input value in textarea advancedSearch"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_SalesMarkets/textarea_advancedSearch'), textarea_advancedSearch_2)

"Step 76: Click on button search"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_SalesMarkets/button_search'))

"Step 77: Click on input checkbox"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_SalesMarkets/input_checkbox'))

"Step 78: Click on button deleteRecord"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_SalesMarkets/button_deleteRecord'))

"Step 79: Click on button delete -> Navigate to page '/main/ifsapplications/web/page/CrmCustomer/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_SalesMarkets/button_delete'))

"Step 80: Click on graniteChip advanced"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/graniteChip_advanced'))

"Step 81: Click on textarea advancedSearch"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/textarea_advancedSearch'))

"Step 82: Enter input value in textarea advancedSearch"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/textarea_advancedSearch'), textarea_advancedSearch_3)

"Step 83: Click on button search"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_search'))

"Step 84: Click on button delete"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_delete'))

"Step 85: Click on button delete2"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_delete2'))

"Step 86: Click on button userDropdown"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_userDropdown'))

"Step 87: Click on button logout -> Navigate to page '/landing-page'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_logout'))

"Step 88: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC30-Manage Customer and Market Data in CRM Application_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}