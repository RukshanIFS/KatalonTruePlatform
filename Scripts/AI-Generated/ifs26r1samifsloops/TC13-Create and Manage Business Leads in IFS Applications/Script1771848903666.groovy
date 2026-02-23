import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.ifs26r1samifsloops.common.inputLeadDetailsAndLanguageSelection
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

"Step 3: Navigate to /main/ifsapplications/web/page/BusinessLead/*"

TrueTestScripts.navigate("main/ifsapplications/web/page/BusinessLead/${BusinessLead_id}")

"Step 4: Click on button new"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_new'))

"Step 5: Input lead description and select language and country."

inputLeadDetailsAndLanguageSelection.execute(input_country2, input_defaultLanguage4, input_description2, input_leadCompany2)

"Step 6: Click on item argentinaOption"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/item_argentinaOption'))

"Step 7: Click on button businessLeadActions (save)"

// Bind values to the variables in the locators of "AI-Generated/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_BusinessLead/button_businessLeadActions"
WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_BusinessLead/button_businessLeadActions', ['button_businessLeadActions_ButtonTitle_1': button_businessLeadActions_ButtonTitle, 'button_businessLeadActions_css_value_1': button_businessLeadActions_css_value]))

"Step 8: Click on div involvedPartiesTab"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/div_involvedPartiesTab'))

"Step 9: Click on button createLeadContact"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_createLeadContact'))

"Step 10: Click on div closeDialog"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/div_closeDialog'))

"Step 11: Click on button new2"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_new2'))

"Step 12: Click on input name"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_name'))

"Step 13: Enter input value in input name2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_name2'), input_name2)

"Step 14: Click on item mainRepresentative"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/item_mainRepresentative'))

"Step 15: Click on button dynamicObject (save2)"

// Bind values to the variables in the locators of "AI-Generated/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_BusinessLead/button_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_BusinessLead/button_dynamicObject', ['button_dynamicObject_ButtonTitle_1': button_dynamicObject_ButtonTitle, 'button_dynamicObject_css_value_1': button_dynamicObject_css_value]))

"Step 16: Click on div menuTrigger"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/div_menuTrigger'))

"Step 17: Click on button main"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_main'))

"Step 18: Click on button businessLeadActions (convertLead)"

// Bind values to the variables in the locators of "AI-Generated/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_BusinessLead/button_businessLeadActions"
WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_BusinessLead/button_businessLeadActions', ['button_businessLeadActions_ButtonTitle_1': button_businessLeadActions_ButtonTitle_1, 'button_businessLeadActions_css_value_1': button_businessLeadActions_css_value_1]))

"Step 19: Click on label customer"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/label_customer'))

"Step 20: Click on button leadCompletion (finish)"

// Bind values to the variables in the locators of "AI-Generated/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_BusinessLead/button_leadCompletion"
WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_BusinessLead/button_leadCompletion', ['button_leadCompletion_ButtonTitle_1': button_leadCompletion_ButtonTitle, 'button_leadCompletion_css_value_1': button_leadCompletion_css_value]))

"Step 21: Click on button no"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_no'))

"Step 22: Click on button deleteSelected"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_deleteSelected'))

"Step 23: Click on button delete -> Navigate to page '/landing-page'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_delete'))

"Step 24: Click on link ifsiCloud -> Navigate to page '/auth/realms/*/protocol/openid-connect/auth'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_landing_page/link_ifsiCloud'))

"Step 25: Login into Application"

TrueTestScripts.login()

"Step 26: Navigate to /main/ifsapplications/web/page/BusinessLead/*"

TrueTestScripts.navigate("main/ifsapplications/web/page/BusinessLead/${BusinessLead_id}")

"Step 27: Click on button new"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_new'))

"Step 28: Click on input description"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_description'))

"Step 29: Enter input value in input description2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_description2'), input_description2_1)

"Step 30: Click on input leadCompany"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_leadCompany'))

"Step 31: Enter input value in input leadCompany2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_leadCompany2'), input_leadCompany2_1)

"Step 32: Click on button businessLeadActions (save)"

// Bind values to the variables in the locators of "AI-Generated/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_BusinessLead/button_businessLeadActions"
WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_BusinessLead/button_businessLeadActions', ['button_businessLeadActions_ButtonTitle_1': button_businessLeadActions_ButtonTitle_2, 'button_businessLeadActions_css_value_1': button_businessLeadActions_css_value_2]))

"Step 33: Click on button status"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_status'))

"Step 34: Click on button leadStatus (qualified)"

// Bind values to the variables in the locators of "AI-Generated/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_BusinessLead/button_leadStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_BusinessLead/button_leadStatus', ['button_leadStatus_ButtonTitle_1': button_leadStatus_ButtonTitle, 'button_leadStatus_css_value_1': button_leadStatus_css_value]))

"Step 35: Click on button status"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_status'))

"Step 36: Click on button leadStatus (parked)"

// Bind values to the variables in the locators of "AI-Generated/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_BusinessLead/button_leadStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_BusinessLead/button_leadStatus', ['button_leadStatus_ButtonTitle_1': button_leadStatus_ButtonTitle_1, 'button_leadStatus_css_value_1': button_leadStatus_css_value_1]))

"Step 37: Click on textarea note"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/textarea_note'))

"Step 38: Enter input value in textarea note2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/textarea_note2'), textarea_note2)

"Step 39: Click on button ok"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_ok'))

"Step 40: Click on button status"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_status'))

"Step 41: Click on button leadStatus (unqualified)"

// Bind values to the variables in the locators of "AI-Generated/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_BusinessLead/button_leadStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_BusinessLead/button_leadStatus', ['button_leadStatus_ButtonTitle_1': button_leadStatus_ButtonTitle_2, 'button_leadStatus_css_value_1': button_leadStatus_css_value_2]))

"Step 42: Click on button status"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_status'))

"Step 43: Click on button leadStatus (setRejected)"

// Bind values to the variables in the locators of "AI-Generated/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_BusinessLead/button_leadStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_BusinessLead/button_leadStatus', ['button_leadStatus_ButtonTitle_1': button_leadStatus_ButtonTitle_3, 'button_leadStatus_css_value_1': button_leadStatus_css_value_3]))

"Step 44: Click on button status"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_status'))

"Step 45: Click on button leadStatus (unqualified)"

// Bind values to the variables in the locators of "AI-Generated/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_BusinessLead/button_leadStatus"
WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_BusinessLead/button_leadStatus', ['button_leadStatus_ButtonTitle_1': button_leadStatus_ButtonTitle_4, 'button_leadStatus_css_value_1': button_leadStatus_css_value_4]))

"Step 46: Click on button deleteSelectedRecords"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_deleteSelectedRecords'))

"Step 47: Click on button delete -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_delete'))

"Step 48: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC13-Create and Manage Business Leads in IFS Applications_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}