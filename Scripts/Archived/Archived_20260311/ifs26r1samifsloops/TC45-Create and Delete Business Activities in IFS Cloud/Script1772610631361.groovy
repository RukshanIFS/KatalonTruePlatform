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

"Step 3: Navigate to /main/ifsapplications/web/page/BusinessActivity/*"

TrueTestScripts.navigate("main/ifsapplications/web/page/BusinessActivity/${BusinessActivity_id}")

"Step 4: Click on button new"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessActivity/button_new'))

"Step 5: Click on input subject"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessActivity/input_subject'))

"Step 6: Enter input value in input subject2"

WebUI.setText(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessActivity/input_subject2'), input_subject2)

"Step 7: Click on input connection"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessActivity/input_connection'))

"Step 8: Enter input value in input connection2"

WebUI.setText(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessActivity/input_connection2'), input_connection2)

"Step 9: Click on item internalCustomer"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessActivity/item_internalCustomer'))

"Step 10: Click on input mainRepresentative"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessActivity/input_mainRepresentative'))

"Step 11: Enter input value in input mainRepresentative2"

WebUI.setText(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessActivity/input_mainRepresentative2'), input_mainRepresentative2)

"Step 12: Click on item selectedRepresentative"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessActivity/item_selectedRepresentative'))

"Step 13: Click on button save -> Navigate to page '/main/ifsapplications/web/page/BusinessOpportunity/*'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessActivity/button_save'))

"Step 14: Click on button new"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/button_new'))

"Step 15: Click on input description"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/input_description'))

"Step 16: Enter input value in input description2"

WebUI.setText(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/input_description2'), input_description2)

"Step 17: Click on input account"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/input_account'))

"Step 18: Enter input value in input account2"

WebUI.setText(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/input_account2'), input_account2)

"Step 19: Click on item internalCustomer"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/item_internalCustomer'))

"Step 20: Click on input mainRepresentative"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/input_mainRepresentative_1'))

"Step 21: Enter input value in input mainRepresentative2"

WebUI.setText(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/input_mainRepresentative2'), input_mainRepresentative2_1)

"Step 22: Click on item stephenJeffsWatts"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/item_stephenJeffsWatts'))

"Step 23: Click on input currencyCode"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/input_currencyCode_1'))

"Step 24: Enter input value in input currencyCode2"

WebUI.setText(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/input_currencyCode2_1'), input_currencyCode2)

"Step 25: Click on item currency"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/item_currency'))

"Step 26: Click on button save -> Navigate to page '/main/ifsapplications/web/page/BusinessActivity/*'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/button_save'))

"Step 27: Click on graniteChip advanced"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessActivity/graniteChip_advanced'))

"Step 28: Click on textarea advancedSearch"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessActivity/textarea_advancedSearch'))

"Step 29: Enter input value in textarea advancedSearch"

WebUI.setText(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessActivity/textarea_advancedSearch'), textarea_advancedSearch)

"Step 30: Click on button search"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessActivity/button_search'))

"Step 31: Click on button connectBusinessOpportunity"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessActivity/button_connectBusinessOpportunity'))

"Step 32: Click on button filterPanel2"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessActivity/button_filterPanel2'))

"Step 33: Click on div description"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessActivity/div_description'))

"Step 34: Enter input value in input filter2"

WebUI.setText(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessActivity/input_filter2'), input_filter2)

"Step 35: Click on button apply"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessActivity/button_apply'))

"Step 36: Click on input object2"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessActivity/input_object2'))

"Step 37: Click on button ok -> Navigate to page '/main/ifsapplications/web/page/BusinessOpportunity/*'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessActivity/button_ok'))

"Step 38: Click on graniteChip advanced"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/graniteChip_advanced'))

"Step 39: Click on textarea advancedSearch"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/textarea_advancedSearch'))

"Step 40: Enter input value in textarea advancedSearch"

WebUI.setText(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/textarea_advancedSearch'), textarea_advancedSearch_1)

"Step 41: Click on button search"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/button_search'))

"Step 42: Click on button deleteRecord"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/button_deleteRecord'))

"Step 43: Click on button delete -> Navigate to page '/main/ifsapplications/web/page/BusinessActivity/*'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessOpportunity/button_delete2'))

"Step 44: Click on graniteChip advanced"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessActivity/graniteChip_advanced'))

"Step 45: Click on textarea advancedSearch"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessActivity/textarea_advancedSearch'))

"Step 46: Enter input value in textarea advancedSearch"

WebUI.setText(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessActivity/textarea_advancedSearch'), textarea_advancedSearch_2)

"Step 47: Click on button search"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessActivity/button_search'))

"Step 48: Click on button delete3"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessActivity/button_delete3'))

"Step 49: Click on button delete2 -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessActivity/button_delete2'))

"Step 50: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC45-Create and Delete Business Activities in IFS Cloud_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}