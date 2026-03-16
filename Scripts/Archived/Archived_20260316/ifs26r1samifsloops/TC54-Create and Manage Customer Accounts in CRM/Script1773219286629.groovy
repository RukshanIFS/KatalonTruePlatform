import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.ifs26r1samifsloops.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(2048, 1018)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /auth/realms/*/protocol/openid-connect/auth with params (client id, nonce, redirect uri, response type, scope, state)"

TrueTestScripts.navigate("auth/realms/${realms_id}/protocol/openid-connect/auth", ["client_id": auth_client_id, "nonce": auth_nonce, "redirect_uri": auth_redirect_uri, "response_type": auth_response_type, "scope": auth_scope, "state": auth_state])

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Navigate to /main/ifsapplications/web/*"

TrueTestScripts.navigate("main/ifsapplications/web/${web_id}")

"Step 4: Click on input search"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web/input_search'))

"Step 5: Enter input value in input search"

WebUI.setText(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web/input_search'), input_search)

"Step 6: Click on link account -> Navigate to page '/main/ifsapplications/web/page/CrmCustomer/*'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web/link_account'))

"Step 7: Click on button new"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_new'))

"Step 8: Click on input name"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_name'))

"Step 9: Enter input value in input name2"

WebUI.setText(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_name2'), input_name2)

"Step 10: Click on input category"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_category'))

"Step 11: Enter input value in input category2"

WebUI.setText(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_category2'), input_category2)

"Step 12: Click on item customerOption"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/item_customerOption'))

"Step 13: Click on input defaultLanguage"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_defaultLanguage'))

"Step 14: Enter input value in input defaultLanguage2"

WebUI.setText(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_defaultLanguage2'), input_defaultLanguage2)

"Step 15: Click on item languageOption"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/item_languageOption'))

"Step 16: Click on input country"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_country'))

"Step 17: Enter input value in input country2"

WebUI.setText(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_country2'), input_country2)

"Step 18: Click on item australia"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/item_australia'))

"Step 19: Click on button save"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_save'))

"Step 20: Click on button new2"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_new2'))

"Step 21: Click on input mainRepresentative"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_mainRepresentative'))

"Step 22: Enter input value in input mainRepresentative2"

WebUI.setText(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_mainRepresentative2'), input_mainRepresentative2)

"Step 23: Click on item stephenJeffsWattsCrm"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/item_stephenJeffsWattsCrm'))

"Step 24: Click on button save2"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_save2'))

"Step 25: Click on button new"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_new'))

"Step 26: Click on input name3"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_name3'))

"Step 27: Enter input value in input name4"

WebUI.setText(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_name4'), input_name4)

"Step 28: Click on input category3"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_category3'))

"Step 29: Enter input value in input category4"

WebUI.setText(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_category4'), input_category4)

"Step 30: Click on item endCustomer"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/item_endCustomer'))

"Step 31: Click on input defaultLanguage3"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_defaultLanguage3'))

"Step 32: Enter input value in input defaultLanguage4"

WebUI.setText(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_defaultLanguage4'), input_defaultLanguage4)

"Step 33: Click on item languageOption"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/item_languageOption'))

"Step 34: Click on input country3"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_country3'))

"Step 35: Enter input value in input country4"

WebUI.setText(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_country4'), input_country4)

"Step 36: Click on item australia"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/item_australia'))

"Step 37: Click on button save"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_save'))

"Step 38: Click on button new2"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_new2'))

"Step 39: Click on input mainRepresentative"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_mainRepresentative'))

"Step 40: Enter input value in input mainRepresentative2"

WebUI.setText(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_mainRepresentative2'), input_mainRepresentative2_1)

"Step 41: Click on item stephenJeffsWattsCrm"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/item_stephenJeffsWattsCrm'))

"Step 42: Click on button save2"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_save2'))

"Step 43: Click on graniteChip advanced"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/graniteChip_advanced'))

"Step 44: Click on textarea search"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/textarea_search'))

"Step 45: Enter input value in textarea search"

WebUI.setText(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/textarea_search'), textarea_search)

"Step 46: Click on button search"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_search'))

"Step 47: Click on button new3"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_new3'))

"Step 48: Enter input value in input accountLead"

WebUI.setText(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_accountLead'), input_accountLead)

"Step 49: Click on item customerCategory"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/item_customerCategory'))

"Step 50: Click on button save3"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_save3'))

"Step 51: Click on link accountStructure -> Navigate to page '/main/ifsapplications/web/page/CrmCompanyHierarchy/*'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/link_accountStructure'))

"Step 52: Click on div object"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCompanyHierarchy/div_object'))

"Step 53: Click on link details -> Navigate to page '/main/ifsapplications/web/page/CrmCustomer/*'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCompanyHierarchy/link_details'))

"Step 54: Click on button delete"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_delete'))

"Step 55: Click on button delete2"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_delete2'))

"Step 56: Click on graniteChip search"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/graniteChip_search'))

"Step 57: Click on graniteChip advanced"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/graniteChip_advanced'))

"Step 58: Click on textarea search2"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/textarea_search2'))

"Step 59: Enter input value in textarea search2"

WebUI.setText(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/textarea_search2'), textarea_search2)

"Step 60: Click on button search"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_search'))

"Step 61: Click on button delete"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_delete'))

"Step 62: Click on button delete3"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_delete3'))

"Step 63: Click on button userDropdown"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_userDropdown'))

"Step 64: Click on button logout -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_logout'))

"Step 65: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC54-Create and Manage Customer Accounts in CRM_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}