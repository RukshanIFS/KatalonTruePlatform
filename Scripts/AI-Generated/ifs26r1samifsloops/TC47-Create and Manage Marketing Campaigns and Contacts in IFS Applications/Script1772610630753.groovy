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

"Step 3: Navigate to /main/ifsapplications/web/page/MarketingCampaign/*"

TrueTestScripts.navigate("main/ifsapplications/web/page/MarketingCampaign/${MarketingCampaign_id}")

"Step 4: Click on button new"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_new'))

"Step 5: Click on fndInputFieldContainer description"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/fndInputFieldContainer_description'))

"Step 6: Click on input description"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_description'))

"Step 7: Enter input value in input description2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_description2'), input_description2)

"Step 8: Click on input campaignType"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_campaignType'))

"Step 9: Enter input value in input campaignType2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_campaignType2'), input_campaignType2)

"Step 10: Click on label conference"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/label_conference'))

"Step 11: Click on input startDate"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_startDate'))

"Step 12: Enter input value in input startDate2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_startDate2'), input_startDate2)

"Step 13: Click on input mainRepresentative"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_mainRepresentative'))

"Step 14: Enter input value in input mainRepresentative2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_mainRepresentative2'), input_mainRepresentative2)

"Step 15: Click on item selected"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/item_selected'))

"Step 16: Click on button ok -> Navigate to page '/main/ifsapplications/web/page/CrmCustomerContact/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_ok'))

"Step 17: Click on link newContact -> Navigate to page '/main/ifsapplications/web/assistant/NewContact/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomerContact/link_newContact'))

"Step 18: Click on label toggleSwitch"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/label_toggleSwitch'))

"Step 19: Click on input category"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/input_category'))

"Step 20: Enter input value in input category2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/input_category2'), input_category2)

"Step 21: Click on item prospect"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/item_prospect'))

"Step 22: Click on input name"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/input_name'))

"Step 23: Enter input value in input name2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/input_name2'), input_name2)

"Step 24: Click on input defaultLanguage"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/input_defaultLanguage'))

"Step 25: Enter input value in input defaultLanguage2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/input_defaultLanguage2'), input_defaultLanguage2)

"Step 26: Click on item english"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/item_english'))

"Step 27: Click on input country"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/input_country'))

"Step 28: Enter input value in input country2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/input_country2'), input_country2)

"Step 29: Click on item australiaDescription"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/item_australiaDescription'))

"Step 30: Click on input contact"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/input_contact'))

"Step 31: Enter input value in input contact2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/input_contact2'), input_contact2)

"Step 32: Click on item selectedOption"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/item_selectedOption'))

"Step 33: Click on button finish -> Navigate to page '/main/ifsapplications/web/page/MarketingCampaign/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/button_finish'))

"Step 34: Click on graniteChip search"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/graniteChip_search'))

"Step 35: Click on graniteChip advanced"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/graniteChip_advanced'))

"Step 36: Click on textarea advancedSearch"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/textarea_advancedSearch'))

"Step 37: Enter input value in textarea advancedSearch"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/textarea_advancedSearch'), textarea_advancedSearch)

"Step 38: Click on button search"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_search'))

"Step 39: Click on div targets"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/div_targets'))

"Step 40: Click on button new2"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_new2'))

"Step 41: Click on button save"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_save'))

"Step 42: Click on input targetType"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_targetType'))

"Step 43: Enter input value in input targetType2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_targetType2'), input_targetType2)

"Step 44: Click on item leadContact"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/item_leadContact'))

"Step 45: Click on input accountLead"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_accountLead'))

"Step 46: Enter input value in input accountLead2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_accountLead2'), input_accountLead2)

"Step 47: Click on item object"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/item_object'))

"Step 48: Click on input leadContact"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_leadContact'))

"Step 49: Enter input value in input leadContact2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_leadContact2'), input_leadContact2)

"Step 50: Click on input accountLead3"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_accountLead3'))

"Step 51: Enter input value in input accountLead4"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_accountLead4'), input_accountLead4)

"Step 52: Click on item swiftcareHealthSolutions"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/item_swiftcareHealthSolutions'))

"Step 53: Click on button picker"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_picker'))

"Step 54: Click on item antonyBourne"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/item_antonyBourne'))

"Step 55: Click on button save2 -> Navigate to page '/main/ifsapplications/web/page/BusinessLead/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_save2'))

"Step 56: Click on button new"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_new'))

"Step 57: Click on input description"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_description'))

"Step 58: Enter input value in input description2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_description2'), input_description2_1)

"Step 59: Click on input leadCompany"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_leadCompany'))

"Step 60: Enter input value in input leadCompany2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_leadCompany2'), input_leadCompany2)

"Step 61: Click on input leadContact"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_leadContact'))

"Step 62: Enter input value in input leadContact2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_leadContact2'), input_leadContact2_1)

"Step 63: Click on input defaultLanguage"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_defaultLanguage'))

"Step 64: Enter input value in input defaultLanguage2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_defaultLanguage2'), input_defaultLanguage2_1)

"Step 65: Click on item english"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/item_english'))

"Step 66: Click on input country"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_country'))

"Step 67: Enter input value in input country2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_country2'), input_country2_1)

"Step 68: Click on item option"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/item_option'))

"Step 69: Click on button save -> Navigate to page '/main/ifsapplications/web/page/MarketingCampaign/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_save'))

"Step 70: Click on graniteChip search"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/graniteChip_search'))

"Step 71: Click on graniteChip advanced"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/graniteChip_advanced'))

"Step 72: Click on textarea advancedSearch"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/textarea_advancedSearch'))

"Step 73: Enter input value in textarea advancedSearch"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/textarea_advancedSearch'), textarea_advancedSearch_1)

"Step 74: Click on button search"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_search'))

"Step 75: Click on div targets"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/div_targets'))

"Step 76: Click on input checkbox"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_checkbox'))

"Step 77: Click on button deleteRecord"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_deleteRecord'))

"Step 78: Click on button delete3"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_delete3'))

"Step 79: Click on button delete"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_delete'))

"Step 80: Click on button delete3 -> Navigate to page '/main/ifsapplications/web/page/BusinessLead/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_delete3'))

"Step 81: Click on graniteChip advanced"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/graniteChip_advanced'))

"Step 82: Click on textarea advancedSearch"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/textarea_advancedSearch'))

"Step 83: Enter input value in textarea advancedSearch"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/textarea_advancedSearch'), textarea_advancedSearch_2)

"Step 84: Click on button search"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_search'))

"Step 85: Click on button delete"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_delete'))

"Step 86: Click on button delete2 -> Navigate to page '/main/ifsapplications/web/page/CrmCustomerContact/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_delete2'))

"Step 87: Click on graniteChip advanced"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomerContact/graniteChip_advanced'))

"Step 88: Click on textarea advancedSearch"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomerContact/textarea_advancedSearch'))

"Step 89: Enter input value in textarea advancedSearch"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomerContact/textarea_advancedSearch'), textarea_advancedSearch_3)

"Step 90: Click on button search"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomerContact/button_search'))

"Step 91: Click on button delete"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomerContact/button_delete'))

"Step 92: Click on button delete2 -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomerContact/button_delete2'))

"Step 93: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC47-Create and Manage Marketing Campaigns and Contacts in IFS Applications_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}