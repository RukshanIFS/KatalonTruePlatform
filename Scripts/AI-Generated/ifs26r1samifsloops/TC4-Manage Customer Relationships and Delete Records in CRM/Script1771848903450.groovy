import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.ifs26r1samifsloops.common.deleteCustomerAndSearchGraniteChip
import truetest.ifs26r1samifsloops.common.setDefaultLanguageAndBusinessDetails
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

"Step 10: Click on button picker"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_picker'))

"Step 11: Click on item customer"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/item_customer'))

"Step 12: Set default language and input business country details."

setDefaultLanguageAndBusinessDetails.execute(input_country2, input_defaultLanguage2, item_businessDetails_css_value_1)

"Step 13: Click on item afghanistan"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/item_afghanistan'))

"Step 14: Click on button crmActions (save)"

// Bind values to the variables in the locators of "AI-Generated/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_CrmCustomer/button_crmAction"
WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_CrmCustomer/button_crmAction', ['button_crmAction_ButtonTitle_1': button_crmAction_ButtonTitle_1, 'button_crmAction_css_value_1': button_crmAction_css_value_1]))

"Step 15: Click on button crmActions (newBusinessActivity)"

// Bind values to the variables in the locators of "AI-Generated/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_CrmCustomer/button_crmActions"
WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_CrmCustomer/button_crmActions', ['button_crmActions_ButtonTitle_4': button_crmActions_ButtonTitle_4, 'button_crmActions_css_value_2': button_crmActions_css_value_2]))

"Step 16: Enter input value in input subject"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_subject'), input_subject)

"Step 17: Click on input mainRepresentative"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_mainRepresentative'))

"Step 18: Enter input value in input mainRepresentative2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_mainRepresentative2'), input_mainRepresentative2)

"Step 19: Click on item mainRepresentativeOption"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/item_mainRepresentativeOption'))

"Step 20: Click on button ok"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_ok'))

"Step 21: Click on button no"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_no'))

"Step 22: Click on button deleteRecord"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_deleteRecord'))

"Step 23: Click on button delete"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_delete2'))

"Step 24: Click on div address"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/div_address'))

"Step 25: Click on fndTabHeader commMethods"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/fndTabHeader_commMethods'))

"Step 26: Click on div involvedParties"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/div_involvedParties'))

"Step 27: Click on button refresh"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_refresh'))

"Step 28: Click on fndTabHeader references"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/fndTabHeader_references'))

"Step 29: Click on fndSelectCell selectRow"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/fndSelectCell_selectRow'))

"Step 30: Click on div menuTrigger"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/div_menuTrigger'))

"Step 31: Click on div menuTrigger"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/div_menuTrigger'))

"Step 32: Click on label selectRow"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/label_selectRow'))

"Step 33: Click on fndSelectCell selectRow"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/fndSelectCell_selectRow'))

"Step 34: Click on link goToDetails -> Navigate to page '/main/ifsapplications/web/page/BusinessActivity/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/link_goToDetails'))

"Step 35: Click on button deleteSelectedRecords"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessActivity/button_deleteSelectedRecords'))

"Step 36: Delete customer and perform a search for granite chip."

deleteCustomerAndSearchGraniteChip.execute(textarea_search)

"Step 37: Click on button deleteRecord"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_deleteRecord'))

"Step 38: Click on button delete -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_delete2'))

"Step 39: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Manage Customer Relationships and Delete Records in CRM_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}