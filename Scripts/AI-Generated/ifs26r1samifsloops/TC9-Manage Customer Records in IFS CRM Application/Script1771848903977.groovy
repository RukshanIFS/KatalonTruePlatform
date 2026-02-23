import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.ifs26r1samifsloops.common.deleteCustomerAndSearchGraniteChip
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

"Step 4: Click on input findPage"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web/input_findPage'))

"Step 5: Enter input value in input findPage"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web/input_findPage'), input_findPage)

"Step 6: Click on link relationshipManagement -> Navigate to page '/main/ifsapplications/web/page/CrmCustomer/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web/link_relationshipManagement'))

"Step 7: Click on button new"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_new'))

"Step 8: Click on input name"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_name'))

"Step 9: Enter input value in input name2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_name2'), input_name2)

"Step 10: Click on input category"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_category'))

"Step 11: Enter input value in input category2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_category2'), input_category2)

"Step 12: Click on item customer"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/item_customer'))

"Step 13: Click on input defaultLanguage"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_defaultLanguage'))

"Step 14: Enter input value in input defaultLanguage2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_defaultLanguage2'), input_defaultLanguage2)

"Step 15: Click on item businessDetails (english)"

// Bind values to the variables in the locators of "AI-Generated/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_CrmCustomer/item_businessDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_CrmCustomer/item_businessDetails', ['item_businessDetails_css_value_1': item_businessDetails_css_value_1]))

"Step 16: Click on inputField dynamicObject (country)"

// Bind values to the variables in the locators of "AI-Generated/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_CrmCustomer/inputField_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_CrmCustomer/inputField_dynamicObject', ['inputField_dynamicObject_css_value_1': inputField_dynamicObject_css_value_1]))

"Step 17: Click on input country"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_country'))

"Step 18: Enter input value in input country2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_country2'), input_country2)

"Step 19: Click on item afghanistan"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/item_afghanistan'))

"Step 20: Click on button crmActions (save)"

// Bind values to the variables in the locators of "AI-Generated/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_CrmCustomer/button_crmAction"
WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_CrmCustomer/button_crmAction', ['button_crmAction_ButtonTitle_1': button_crmAction_ButtonTitle_1, 'button_crmAction_css_value_1': button_crmAction_css_value_1]))

"Step 21: Click on fndTabHeader involvedParties"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/fndTabHeader_involvedParties'))

"Step 22: Click on button newContact"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_newContact'))

"Step 23: Click on button picker4"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_picker4'))

"Step 24: Enter input value in input contact"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_contact'), input_contact)

"Step 25: Click on item noNora"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/item_noNora'))

"Step 26: Click on button ok3"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_ok3'))

"Step 27: Click on button newBusinessActivity2"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_newBusinessActivity2'))

"Step 28: Click on input subject2"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_subject2'))

"Step 29: Enter input value in input subject2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_subject2'), input_subject2)

"Step 30: Click on input mainRepresentative7"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_mainRepresentative7'))

"Step 31: Enter input value in input mainRepresentative8"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_mainRepresentative8'), input_mainRepresentative8)

"Step 32: Click on item mainRepresentativeOption"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/item_mainRepresentativeOption'))

"Step 33: Click on button ok"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_ok'))

"Step 34: Click on button no"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_no'))

"Step 35: Click on fndTabHeader references"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/fndTabHeader_references'))

"Step 36: Click on input checkbox"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_checkbox'))

"Step 37: Click on link goToDetails -> Navigate to page '/main/ifsapplications/web/page/BusinessActivity/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/link_goToDetails'))

"Step 38: Click on button deleteSelectedRecord"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessActivity/button_deleteSelectedRecord'))

"Step 39: Delete customer and perform a search for granite chip."

deleteCustomerAndSearchGraniteChip.execute(textarea_search)

"Step 40: Click on div search"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/div_search'))

"Step 41: Click on textarea advancedSearch"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/textarea_advancedSearch'))

"Step 42: Enter input value in textarea advancedSearch"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/textarea_advancedSearch'), textarea_advancedSearch)

"Step 43: Click on button search"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_search'))

"Step 44: Click on button deleteRecord"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_deleteRecord'))

"Step 45: Click on button delete -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_delete2'))

"Step 46: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC9-Manage Customer Records in IFS CRM Application_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}