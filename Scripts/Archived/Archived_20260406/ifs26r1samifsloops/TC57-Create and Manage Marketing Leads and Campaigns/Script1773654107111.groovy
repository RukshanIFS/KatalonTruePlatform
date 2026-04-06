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

"Step 3: Navigate to /main/ifsapplications/web/page/MarketingList/*"

TrueTestScripts.navigate("/main/ifsapplications/web/page/MarketingList/${MarketingList_id}")

"Step 4: Click on button new"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/button_new'))

"Step 5: Click on input description"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/input_description'))

"Step 6: Enter input value in input description"

WebUI.setText(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/input_description'), input_description)

"Step 7: Click on input mainRepresentative"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/input_mainRepresentative'))

"Step 8: Enter input value in input mainRepresentative2"

WebUI.setText(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/input_mainRepresentative2'), input_mainRepresentative2)

"Step 9: Click on item sjStephenJeffsWatts"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/item_sjStephenJeffsWatts'))

"Step 10: Click on button save -> Navigate to page '/main/ifsapplications/web/page/BusinessLead/*'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/button_save'))

"Step 11: Click on button new"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_new'))

"Step 12: Click on input description"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_description'))

"Step 13: Enter input value in input description2"

WebUI.setText(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_description2'), input_description2)

"Step 14: Click on input leadCompany"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_leadCompany'))

"Step 15: Enter input value in input leadCompany2"

WebUI.setText(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_leadCompany2'), input_leadCompany2)

"Step 16: Click on input defaultLanguage"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_defaultLanguage'))

"Step 17: Enter input value in input defaultLanguage2"

WebUI.setText(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_defaultLanguage2'), input_defaultLanguage2)

"Step 18: Click on label english"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/label_english'))

"Step 19: Click on input country"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_country'))

"Step 20: Enter input value in input country2"

WebUI.setText(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_country2'), input_country2)

"Step 21: Click on item auStralia"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/item_auStralia'))

"Step 22: Click on input leadContact"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_leadContact'))

"Step 23: Enter input value in input leadContact2"

WebUI.setText(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_leadContact2'), input_leadContact2)

"Step 24: Click on button save -> Navigate to page '/main/ifsapplications/web/page/MarketingList/*'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_save'))

"Step 25: Click on graniteChip search"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/graniteChip_search'))

"Step 26: Click on graniteChip advanced"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/graniteChip_advanced'))

"Step 27: Click on textarea search"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/textarea_search'))

"Step 28: Enter input value in textarea search"

WebUI.setText(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/textarea_search'), textarea_search)

"Step 29: Click on button search"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/button_search'))

"Step 30: Click on button new2"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/button_new2'))

"Step 31: Click on div containerField"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/div_containerField'))

"Step 32: Click on button picker"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/button_picker'))

"Step 33: Click on input targetType"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/input_targetType'))

"Step 34: Enter input value in input targetType2"

WebUI.setText(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/input_targetType2'), input_targetType2)

"Step 35: Click on item leadContact"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/item_leadContact'))

"Step 36: Click on input accountLead"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/input_accountLead'))

"Step 37: Enter input value in input accountLead2"

WebUI.setText(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/input_accountLead2'), input_accountLead2)

"Step 38: Click on item crmCompany123"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/item_crmCompany123'))

"Step 39: Click on input leadContact"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/input_leadContact'))

"Step 40: Enter input value in input leadContact2"

WebUI.setText(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/input_leadContact2'), input_leadContact2_1)

"Step 41: Click on item crmLeadContact"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/item_crmLeadContact'))

"Step 42: Click on button save2"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/button_save2'))

"Step 43: Click on link marketingCampaign -> Navigate to page '/main/ifsapplications/web/page/MarketingCampaign/*'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/link_marketingCampaign'))

"Step 44: Click on div search"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/div_search'))

"Step 45: Click on button new"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_new'))

"Step 46: Click on input description"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_description'))

"Step 47: Enter input value in input description2"

WebUI.setText(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_description2'), input_description2_1)

"Step 48: Click on input campaignType"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_campaignType'))

"Step 49: Enter input value in input campaignType2"

WebUI.setText(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_campaignType2'), input_campaignType2)

"Step 50: Click on label conference"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/label_conference'))

"Step 51: Click on input startDate"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_startDate'))

"Step 52: Enter input value in input startDate2"

WebUI.setText(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_startDate2'), input_startDate2)

"Step 53: Click on input mainRepresentative"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_mainRepresentative'))

"Step 54: Enter input value in input mainRepresentative2"

WebUI.setText(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_mainRepresentative2'), input_mainRepresentative2_1)

"Step 55: Click on item sjStephenJeffsWatts"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/item_sjStephenJeffsWatts'))

"Step 56: Click on button ok"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_ok'))

"Step 57: Click on button addTargetsFromMarketingList"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_addTargetsFromMarketingList'))

"Step 58: Click on input marketingListsCheckbox"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_marketingListsCheckbox'))

"Step 59: Click on button ok2"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_ok2'))

"Step 60: Click on div marketingListsTab"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/div_marketingListsTab'))

"Step 61: Click on input marketingCampaignCheckbox"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_marketingCampaignCheckbox'))

"Step 62: Click on link details -> Navigate to page '/main/ifsapplications/web/page/MarketingList/*'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/link_details'))

"Step 63: Click on button delete"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/button_delete'))

"Step 64: Click on button delete2"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/button_delete2'))

"Step 65: Click on link marketingCampaign -> Navigate to page '/main/ifsapplications/web/page/MarketingCampaign/*'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/link_marketingCampaign'))

"Step 66: Click on graniteChip search"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/graniteChip_search'))

"Step 67: Click on graniteChip advanced"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/graniteChip_advanced'))

"Step 68: Click on textarea search"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/textarea_search'))

"Step 69: Enter input value in textarea search"

WebUI.setText(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/textarea_search'), textarea_search_1)

"Step 70: Click on button search -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260406/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_search'))

"Step 71: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC57-Create and Manage Marketing Leads and Campaigns_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}