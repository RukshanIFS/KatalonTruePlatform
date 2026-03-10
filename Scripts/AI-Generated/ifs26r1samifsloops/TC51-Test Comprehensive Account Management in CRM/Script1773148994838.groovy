import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.ifs26r1samifsloops.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 945)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /auth/realms/*/protocol/openid-connect/auth with params (client id, nonce, redirect uri, response type, scope, state)"

TrueTestScripts.navigate("auth/realms/${realms_id}/protocol/openid-connect/auth", ["client_id": auth_client_id, "nonce": auth_nonce, "redirect_uri": auth_redirect_uri, "response_type": auth_response_type, "scope": auth_scope, "state": auth_state])

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Navigate to /main/ifsapplications/web/*"

TrueTestScripts.navigate("main/ifsapplications/web/${web_id}")

"Step 4: Click on input search"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web/input_search'))

"Step 5: Enter input value in input search"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web/input_search'), input_search)

"Step 6: Click on link account -> Navigate to page '/main/ifsapplications/web/page/CrmCustomer/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web/link_account'))

"Step 7: Click on button new"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_new'))

"Step 8: Click on input name"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_name_1'))

"Step 9: Enter input value in input name2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_name2_1'), input_name2)

"Step 10: Click on input category"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_category_1'))

"Step 11: Enter input value in input category2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_category2_1'), input_category2)

"Step 12: Click on label customer"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/label_customer'))

"Step 13: Click on input defaultLanguage"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_defaultLanguage_1'))

"Step 14: Enter input value in input defaultLanguage2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_defaultLanguage2_1'), input_defaultLanguage2)

"Step 15: Click on item languageOption2"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/item_languageOption'))

"Step 16: Click on input country"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_country_1'))

"Step 17: Enter input value in input country2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_country2_1'), input_country2)

"Step 18: Click on item australia"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/item_australia'))

"Step 19: Click on button save"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_save'))

"Step 20: Click on button new2"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_new2'))

"Step 21: Click on button picker"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_picker'))

"Step 22: Click on item medium"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/item_medium'))

"Step 23: Click on button picker2"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_picker2'))

"Step 24: Click on item medium"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/item_medium'))

"Step 25: Click on button picker3"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_picker3'))

"Step 26: Click on item other"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/item_other'))

"Step 27: Click on button picker4"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_picker4'))

"Step 28: Click on label lessThan10"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/label_lessThan10'))

"Step 29: Click on input yearEndPeriod"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_yearEndPeriod'))

"Step 30: Enter input value in input yearEndPeriod2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_yearEndPeriod2'), input_yearEndPeriod2)

"Step 31: Click on input annualRevenue"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_annualRevenue'))

"Step 32: Enter input value in input annualRevenue2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_annualRevenue2'), input_annualRevenue2)

"Step 33: Click on input mainRepresentative"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_mainRepresentative_1'))

"Step 34: Enter input value in input mainRepresentative2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_mainRepresentative2_1'), input_mainRepresentative2)

"Step 35: Click on item stephenJeffsWattsCrm"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/item_stephenJeffsWattsCrm'))

"Step 36: Click on button save2"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_save2'))

"Step 37: Click on button delete"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_delete'))

"Step 38: Click on button delete2"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_delete2'))

"Step 39: Click on button userDropdown"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_userDropdown'))

"Step 40: Click on button logout -> Navigate to page '/landing-page'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_logout_1'))

"Step 41: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC51-Test Comprehensive Account Management in CRM_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}