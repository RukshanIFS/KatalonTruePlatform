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

"Step 3: Navigate to /main/ifsapplications/web/*"

TrueTestScripts.navigate("/main/ifsapplications/web/${web_id}")

"Step 4: Click on input findPage"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web/input_findPage'))

"Step 5: Enter input value in input findPage"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web/input_findPage'), input_findPage)

"Step 6: Click on link relationshipManagement -> Navigate to page '/main/ifsapplications/web/page/MarketingCampaign/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web/link_relationshipManagement'))

"Step 7: Click on button new"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_new'))

"Step 8: Click on input description"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_description'))

"Step 9: Enter input value in input description2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_description2'), input_description2)

"Step 10: Click on input campaignType"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_campaignType'))

"Step 11: Click on input campaignType2"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_campaignType2'))

"Step 12: Click on input campaignType2"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_campaignType2'))

"Step 13: Enter input value in input campaignType2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_campaignType2'), input_campaignType2)

"Step 14: Click on label conference"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/label_conference'))

"Step 15: Click on input startDate"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_startDate'))

"Step 16: Enter input value in input startDate2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_startDate2'), input_startDate2)

"Step 17: Click on input mainRepresentative"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_mainRepresentative'))

"Step 18: Enter input value in input mainRepresentative2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_mainRepresentative2'), input_mainRepresentative2)

"Step 19: Click on item sjStephenJeffsWatts"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/item_sjStephenJeffsWatts'))

"Step 20: Click on button ok -> Navigate to page '/main/ifsapplications/web/page/CrmCustomerContact/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_ok'))

"Step 21: Click on link newContact -> Navigate to page '/main/ifsapplications/web/assistant/NewContact/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomerContact/link_newContact'))

"Step 22: Click on label newCustomerOrLead"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/label_newCustomerOrLead'))

"Step 23: Click on input category"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/input_category'))

"Step 24: Enter input value in input category2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/input_category2'), input_category2)

"Step 25: Click on item prospect2"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/item_prospect2'))

"Step 26: Click on input name"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/input_name'))

"Step 27: Enter input value in input name2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/input_name2'), input_name2)

"Step 28: Click on input defaultLanguage"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/input_defaultLanguage'))

"Step 29: Enter input value in input defaultLanguage2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/input_defaultLanguage2'), input_defaultLanguage2)

"Step 30: Click on item english"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/item_english'))

"Step 31: Click on input country"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/input_country'))

"Step 32: Enter input value in input country2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/input_country2'), input_country2)

"Step 33: Click on item australiaDescription"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/item_australiaDescription'))

"Step 34: Click on input contact"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/input_contact'))

"Step 35: Enter input value in input contact2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/input_contact2'), input_contact2)

"Step 36: Click on item jaJabr"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/item_jaJabr'))

"Step 37: Click on button finish -> Navigate to page '/main/ifsapplications/web/page/MarketingCampaign/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/button_finish'))

"Step 38: Click on graniteChip search"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/graniteChip_search'))

"Step 39: Click on graniteChip advanced"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/graniteChip_advanced'))

"Step 40: Click on textarea search"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/textarea_search'))

"Step 41: Enter input value in textarea search"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/textarea_search'), textarea_search)

"Step 42: Click on button search"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_search'))

"Step 43: Click on div targetsTab"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/div_targetsTab'))

"Step 44: Click on button new2"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_new2'))

"Step 45: Click on input targetType"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_targetType'))

"Step 46: Enter input value in input targetType"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_targetType'), input_targetType)

"Step 47: Click on item leadContact"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/item_leadContact'))

"Step 48: Click on button picker"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_picker'))

"Step 49: Enter input value in input accountLead"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_accountLead'), input_accountLead)

"Step 50: Click on item englishLeadInNyc"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/item_englishLeadInNyc'))

"Step 51: Click on button picker2"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_picker2'))

"Step 52: Click on input accountLead2"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_accountLead2'))

"Step 53: Enter input value in input accountLead3"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_accountLead3'), input_accountLead3)

"Step 54: Click on item overseasAutomobileSales"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/item_overseasAutomobileSales'))

"Step 55: Click on button picker3"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_picker2'))

"Step 56: Click on input leadContact"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_leadContact'))

"Step 57: Enter input value in input leadContact"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_leadContact'), input_leadContact)

"Step 58: Click on item leadContact2"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/item_leadContact2'))

"Step 59: Click on button save -> Navigate to page '/main/ifsapplications/web/page/BusinessLead/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_save'))

"Step 60: Click on button new"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_new'))

"Step 61: Enter input value in input description"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_description'), input_description)

"Step 62: Click on input leadCompany"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_leadCompany'))

"Step 63: Enter input value in input leadCompany2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_leadCompany2'), input_leadCompany2)

"Step 64: Click on input leadContact"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_leadContact'))

"Step 65: Enter input value in input leadContact2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_leadContact2'), input_leadContact2)

"Step 66: Click on input defaultLanguage"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_defaultLanguage'))

"Step 67: Enter input value in input defaultLanguage2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_defaultLanguage2'), input_defaultLanguage2_1)

"Step 68: Click on label english"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/label_english'))

"Step 69: Click on input country"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_country'))

"Step 70: Enter input value in input country2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_country2'), input_country2_1)

"Step 71: Click on item auStralia"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/item_auStralia'))

"Step 72: Click on button save -> Navigate to page '/main/ifsapplications/web/page/MarketingCampaign/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_save'))

"Step 73: Click on graniteChip search"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/graniteChip_search'))

"Step 74: Click on graniteChip advanced"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/graniteChip_advanced'))

"Step 75: Click on textarea search"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/textarea_search'))

"Step 76: Enter input value in textarea search"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/textarea_search'), textarea_search_1)

"Step 77: Click on button search"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_search'))

"Step 78: Click on div targetsTab"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/div_targetsTab'))

"Step 79: Click on input marketingCampaignCheckbox"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_marketingCampaignCheckbox'))

"Step 80: Click on button deleteSelected"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_deleteSelected'))

"Step 81: Click on button delete"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_delete'))

"Step 82: Click on button deleteSelected2"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_deleteSelected2'))

"Step 83: Click on button delete -> Navigate to page '/main/ifsapplications/web/page/BusinessLead/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_delete'))

"Step 84: Click on graniteChip advanced"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/graniteChip_advanced'))

"Step 85: Click on textarea advancedSearch"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/textarea_advancedSearch'))

"Step 86: Enter input value in textarea advancedSearch"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/textarea_advancedSearch'), textarea_advancedSearch)

"Step 87: Click on button search2"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_search2'))

"Step 88: Click on button deleteSelectedRecords"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_deleteSelectedRecords'))

"Step 89: Click on button delete -> Navigate to page '/main/ifsapplications/web/page/CrmCustomerContact/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_delete'))

"Step 90: Click on graniteChip advanced"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomerContact/graniteChip_advanced'))

"Step 91: Click on textarea advancedSearch"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomerContact/textarea_advancedSearch'))

"Step 92: Enter input value in textarea advancedSearch"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomerContact/textarea_advancedSearch'), textarea_advancedSearch_1)

"Step 93: Click on button search"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomerContact/button_search'))

"Step 94: Click on button deleteSelected"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomerContact/button_deleteSelected'))

"Step 95: Click on button delete -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomerContact/button_delete'))

"Step 96: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC70-Manage Marketing Campaigns and Customer Contacts in IFS Applications_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}