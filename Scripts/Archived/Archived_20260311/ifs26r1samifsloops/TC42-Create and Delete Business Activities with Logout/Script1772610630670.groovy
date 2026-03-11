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

"Step 13: Click on button save"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessActivity/button_save'))

"Step 14: Click on button new2"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessActivity/button_new2'))

"Step 15: Enter input value in input name"

WebUI.setText(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessActivity/input_name'), input_name)

"Step 16: Click on item internalCustomer"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessActivity/item_internalCustomer'))

"Step 17: Click on button save2"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessActivity/button_save2'))

"Step 18: Click on button filterPanel"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessActivity/button_filterPanel'))

"Step 19: Click on i dropdown"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessActivity/i_dropdown'))

"Step 20: Enter input value in input filter"

WebUI.setText(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessActivity/input_filter'), input_filter)

"Step 21: Click on item internalCustomer2"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessActivity/item_internalCustomer2'))

"Step 22: Click on input object"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessActivity/input_object'))

"Step 23: Click on button delete"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessActivity/button_delete'))

"Step 24: Click on button delete2"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessActivity/button_delete2'))

"Step 25: Click on button delete3"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessActivity/button_delete3'))

"Step 26: Click on button delete2 -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260311/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessActivity/button_delete2'))

"Step 27: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC42-Create and Delete Business Activities with Logout_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}