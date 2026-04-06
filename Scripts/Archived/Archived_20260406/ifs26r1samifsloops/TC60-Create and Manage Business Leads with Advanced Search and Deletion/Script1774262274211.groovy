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

TrueTestScripts.navigate("/auth/realms/${realms_id}/protocol/openid-connect/auth", ["client_id": auth_client_id, "nonce": auth_nonce, "redirect_uri": auth_redirect_uri, "response_type": auth_response_type, "scope": auth_scope, "state": auth_state])

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Navigate to /main/ifsapplications/web/page/BusinessLead/*"

TrueTestScripts.navigate("/main/ifsapplications/web/page/BusinessLead/${BusinessLead_id}")

"Step 4: Click on button new"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_new'))

"Step 5: Click on input description"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_description'))

"Step 6: Enter input value in input description2"

WebUI.setText(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_description2'), input_description2)

"Step 7: Click on input leadCompany"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_leadCompany'))

"Step 8: Enter input value in input leadCompany2"

WebUI.setText(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_leadCompany2'), input_leadCompany2)

"Step 9: Click on input defaultLanguage"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_defaultLanguage'))

"Step 10: Enter input value in input defaultLanguage2"

WebUI.setText(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_defaultLanguage2'), input_defaultLanguage2)

"Step 11: Click on item english"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/item_english'))

"Step 12: Click on input country"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_country'))

"Step 13: Enter input value in input country2"

WebUI.setText(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_country2'), input_country2)

"Step 14: Click on item auStralia"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/item_auStralia'))

"Step 15: Click on input leadContact"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_leadContact'))

"Step 16: Enter input value in input leadContact2"

WebUI.setText(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_leadContact2'), input_leadContact2)

"Step 17: Click on button save -> Navigate to page '/main/ifsapplications/web/page/BusinessLeadContact/*'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_save'))

"Step 18: Click on button new"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLeadContact/button_new'))

"Step 19: Click on input contact"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLeadContact/input_contact'))

"Step 20: Enter input value in input contact2"

WebUI.setText(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLeadContact/input_contact2'), input_contact2)

"Step 21: Click on input lead"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLeadContact/input_lead'))

"Step 22: Enter input value in input lead2"

WebUI.setText(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLeadContact/input_lead2'), input_lead2)

"Step 23: Click on item crmLead"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLeadContact/item_crmLead'))

"Step 24: Click on input title"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLeadContact/input_title'))

"Step 25: Enter input value in input title2"

WebUI.setText(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLeadContact/input_title2'), input_title2)

"Step 26: Click on button save -> Navigate to page '/main/ifsapplications/web/page/MarketingList/*'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLeadContact/button_save'))

"Step 27: Click on button new"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/button_new_1'))

"Step 28: Click on input description"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/input_description_1'))

"Step 29: Enter input value in input description2"

WebUI.setText(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/input_description2'), input_description2_1)

"Step 30: Click on input notes"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/input_notes'))

"Step 31: Enter input value in input notes2"

WebUI.setText(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/input_notes2'), input_notes2)

"Step 32: Click on button save"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/button_save'))

"Step 33: Click on button new2"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/button_new2'))

"Step 34: Enter input value in input targetType"

WebUI.setText(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/input_targetType_1'), input_targetType)

"Step 35: Click on item leadContact"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/item_leadContact'))

"Step 36: Click on input accountLead"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/input_accountLead_1'))

"Step 37: Enter input value in input accountLead2"

WebUI.setText(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/input_accountLead2_1'), input_accountLead2)

"Step 38: Click on item crmLead"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/item_crmLead'))

"Step 39: Click on input leadContact"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/input_leadContact_1'))

"Step 40: Enter input value in input leadContact2"

WebUI.setText(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/input_leadContact2_1'), input_leadContact2_1)

"Step 41: Click on item contactOption"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/item_contactOption'))

"Step 42: Click on button save2 -> Navigate to page '/main/ifsapplications/web/page/BusinessLeadContact/*'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/button_save2'))

"Step 43: Click on div search"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLeadContact/div_search'))

"Step 44: Click on graniteChip advanced"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLeadContact/graniteChip_advanced'))

"Step 45: Click on textarea advancedSearch"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLeadContact/textarea_advancedSearch'))

"Step 46: Enter input value in textarea advancedSearch"

WebUI.setText(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLeadContact/textarea_advancedSearch'), textarea_advancedSearch)

"Step 47: Click on button search"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLeadContact/button_search'))

"Step 48: Click on button addToMarketingList"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLeadContact/button_addToMarketingList'))

"Step 49: Click on button filterPanel"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLeadContact/button_filterPanel'))

"Step 50: Click on div description"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLeadContact/div_description'))

"Step 51: Enter input value in input filter"

WebUI.setText(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLeadContact/input_filter'), input_filter)

"Step 52: Click on button apply"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLeadContact/button_apply'))

"Step 53: Click on div object"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLeadContact/div_object'))

"Step 54: Click on button ok -> Navigate to page '/main/ifsapplications/web/page/MarketingList/*'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLeadContact/button_ok'))

"Step 55: Click on div search"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/div_search'))

"Step 56: Click on graniteChip search"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/graniteChip_search'))

"Step 57: Click on graniteChip advanced"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/graniteChip_advanced'))

"Step 58: Click on textarea search"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/textarea_search'))

"Step 59: Enter input value in textarea search"

WebUI.setText(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/textarea_search'), textarea_search)

"Step 60: Click on button search"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/button_search'))

"Step 61: Click on button delete"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/button_delete_1'))

"Step 62: Click on button delete2 -> Navigate to page '/main/ifsapplications/web/page/BusinessLeadContact/*'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/button_delete2_1'))

"Step 63: Click on graniteChip advanced"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLeadContact/graniteChip_advanced'))

"Step 64: Click on textarea advancedSearch"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLeadContact/textarea_advancedSearch'))

"Step 65: Enter input value in textarea advancedSearch"

WebUI.setText(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLeadContact/textarea_advancedSearch'), textarea_advancedSearch_1)

"Step 66: Click on button search"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLeadContact/button_search'))

"Step 67: Click on button delete"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLeadContact/button_delete'))

"Step 68: Click on button delete2 -> Navigate to page '/main/ifsapplications/web/page/BusinessLead/*'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLeadContact/button_delete2'))

"Step 69: Click on graniteChip advanced"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/graniteChip_advanced_1'))

"Step 70: Click on textarea advancedSearch"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/textarea_advancedSearch'))

"Step 71: Enter input value in textarea advancedSearch"

WebUI.setText(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/textarea_advancedSearch'), textarea_advancedSearch_2)

"Step 72: Click on button search2"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_search2'))

"Step 73: Click on button deleteSelectedRecords"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_deleteSelectedRecords'))

"Step 74: Click on button delete -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_delete'))

"Step 75: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC60-Create and Manage Business Leads with Advanced Search and Deletion_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}