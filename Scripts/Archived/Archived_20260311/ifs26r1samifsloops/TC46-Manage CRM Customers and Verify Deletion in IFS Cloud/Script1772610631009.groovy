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

"Step 3: Navigate to /main/ifsapplications/web/page/CrmCustomer/*"

TrueTestScripts.navigate("main/ifsapplications/web/page/CrmCustomer/${CrmCustomer_id}")

"Step 4: Click on button new"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_new'))

"Step 5: Click on input name3"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_name'))

"Step 6: Enter input value in input name4"

WebUI.setText(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_name2'), input_name4)

"Step 7: Click on input category3"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_category'))

"Step 8: Enter input value in input category4"

WebUI.setText(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_category2'), input_category4)

"Step 9: Click on item customerOption"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/item_customerOption'))

"Step 10: Click on input defaultLanguage3"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_defaultLanguage'))

"Step 11: Enter input value in input defaultLanguage4"

WebUI.setText(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_defaultLanguage2'), input_defaultLanguage4)

"Step 12: Click on item languageOption"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/item_languageOption'))

"Step 13: Click on input country3"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_country'))

"Step 14: Enter input value in input country4"

WebUI.setText(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_country2'), input_country4)

"Step 15: Click on item australia"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/item_australia'))

"Step 16: Click on button save"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_save'))

"Step 17: Click on button new2"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_new2'))

"Step 18: Click on input mainRepresentative"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_mainRepresentative'))

"Step 19: Enter input value in input mainRepresentative2"

WebUI.setText(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_mainRepresentative2'), input_mainRepresentative2)

"Step 20: Click on item stephenJeffsWattsCrm"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/item_stephenJeffsWattsCrm'))

"Step 21: Click on button save2"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_save2'))

"Step 22: Click on button new"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_new'))

"Step 23: Click on input name5"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_name5'))

"Step 24: Enter input value in input name6"

WebUI.setText(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_name6'), input_name6)

"Step 25: Click on input category5"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_category5'))

"Step 26: Enter input value in input category6"

WebUI.setText(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_category6'), input_category6)

"Step 27: Click on item customerOption"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/item_customerOption'))

"Step 28: Click on input defaultLanguage5"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_defaultLanguage5'))

"Step 29: Enter input value in input defaultLanguage6"

WebUI.setText(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_defaultLanguage6'), input_defaultLanguage6)

"Step 30: Click on item languageOption"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/item_languageOption'))

"Step 31: Click on input country5"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_country5'))

"Step 32: Enter input value in input country6"

WebUI.setText(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_country6'), input_country6)

"Step 33: Click on item australia"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/item_australia'))

"Step 34: Click on button save"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_save'))

"Step 35: Click on button new2"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_new2'))

"Step 36: Click on input mainRepresentative3"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_mainRepresentative3'))

"Step 37: Enter input value in input mainRepresentative4"

WebUI.setText(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_mainRepresentative4'), input_mainRepresentative4)

"Step 38: Click on item stephenJeffsWattsCrm"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/item_stephenJeffsWattsCrm'))

"Step 39: Click on button save2"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_save2'))

"Step 40: Click on graniteChip advanced"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/graniteChip_advanced'))

"Step 41: Click on textarea advancedSearch"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/textarea_advancedSearch'))

"Step 42: Enter input value in textarea advancedSearch"

WebUI.setText(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/textarea_advancedSearch'), textarea_advancedSearch)

"Step 43: Click on button search2"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_search'))

"Step 44: Click on button new3"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_new3'))

"Step 45: Enter input value in input accountLead"

WebUI.setText(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_accountLead'), input_accountLead)

"Step 46: Click on item customer"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/item_customer'))

"Step 47: Click on button save3"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_save3'))

"Step 48: Click on link accountStructure -> Navigate to page '/main/ifsapplications/web/page/CrmCompanyHierarchy/*'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/link_accountStructure'))

"Step 49: Click on div object"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCompanyHierarchy/div_object'))

"Step 50: Click on link details -> Navigate to page '/main/ifsapplications/web/page/CrmCustomer/*'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCompanyHierarchy/link_details'))

"Step 51: Click on button delete"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_delete'))

"Step 52: Click on button delete3"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_delete3'))

"Step 53: Click on graniteChip search"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/graniteChip_search'))

"Step 54: Click on graniteChip advanced"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/graniteChip_advanced'))

"Step 55: Click on textarea advancedSearch2"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/textarea_advancedSearch2'))

"Step 56: Enter input value in textarea advancedSearch2"

WebUI.setText(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/textarea_advancedSearch2'), textarea_advancedSearch2)

"Step 57: Click on button search2"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_search'))

"Step 58: Click on button delete"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_delete'))

"Step 59: Click on button delete2 -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_delete2'))

"Step 60: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC46-Manage CRM Customers and Verify Deletion in IFS Cloud_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}