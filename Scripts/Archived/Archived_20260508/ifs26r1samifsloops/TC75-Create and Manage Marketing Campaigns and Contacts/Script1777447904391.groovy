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

"Step 1: Navigate to https://ifs26r1samifsloops.rnd.ifsdevworld.com/auth/realms/ifs26r1samifsloops/protocol/openid-connect/auth with params (client id, nonce, redirect uri, response type, scope, state)"

TrueTestScripts.navigate("/auth/realms/${realms_id}/protocol/openid-connect/auth", ["client_id": auth_client_id, "nonce": auth_nonce, "redirect_uri": auth_redirect_uri, "response_type": auth_response_type, "scope": auth_scope, "state": auth_state])

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Navigate to https://ifs26r1samifsloops.rnd.ifsdevworld.com/main/ifsapplications/web/start;path=0.1"

TrueTestScripts.navigate("/main/ifsapplications/web/${web_id}")

"Step 4: Click on input findPage"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web/input_findPage'))

"Step 5: Enter input value in input findPage"

WebUI.setText(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web/input_findPage'), input_findPage)

"Step 6: Click on link marketingCampaign -> Navigate to page '/main/ifsapplications/web/page/MarketingCampaign/*'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web/link_marketingCampaign'))

"Step 7: Click on button new5"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_new5'))

"Step 8: Click on input description5"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_description5'))

"Step 9: Enter input value in input description6"

WebUI.setText(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_description6'), input_description6)

"Step 10: Click on label campaignType"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/label_campaignType'))

"Step 11: Enter input value in input campaignType5"

WebUI.setText(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_campaignType5'), input_campaignType5)

"Step 12: Click on label conference"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/label_conference'))

"Step 13: Click on input startDate5"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_startDate5'))

"Step 14: Enter input value in input startDate6"

WebUI.setText(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_startDate6'), input_startDate6)

"Step 15: Click on input mainRepresentative5"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_mainRepresentative5'))

"Step 16: Enter input value in input mainRepresentative6"

WebUI.setText(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_mainRepresentative6'), input_mainRepresentative6)

"Step 17: Click on item selectedRepresentative"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/item_selectedRepresentative'))

"Step 18: Click on button ok -> Navigate to page '/main/ifsapplications/web/page/CrmCustomerContact/CustomerContactPage'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_ok'))

"Step 19: Click on link newContact -> Navigate to page '/main/ifsapplications/web/assistant/NewContact/*'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomerContact/link_newContact'))

"Step 20: Click on label isNewCustomerOrLead"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/label_isNewCustomerOrLead'))

"Step 21: Click on input category5"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/input_category5'))

"Step 22: Enter input value in input category6"

WebUI.setText(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/input_category6'), input_category6)

"Step 23: Click on label prospect"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/label_prospect'))

"Step 24: Click on input name5"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/input_name5'))

"Step 25: Enter input value in input name6"

WebUI.setText(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/input_name6'), input_name6)

"Step 26: Click on input defaultLanguage5"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/input_defaultLanguage5'))

"Step 27: Enter input value in input defaultLanguage6"

WebUI.setText(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/input_defaultLanguage6'), input_defaultLanguage6)

"Step 28: Click on item selectLanguageOption"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/item_selectLanguageOption'))

"Step 29: Click on input country4"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/input_country4'))

"Step 30: Enter input value in input country5"

WebUI.setText(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/input_country5'), input_country5)

"Step 31: Click on item selectCountryOption"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/item_selectCountryOption'))

"Step 32: Click on input contact5"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/input_contact5'))

"Step 33: Enter input value in input contact6"

WebUI.setText(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/input_contact6'), input_contact6)

"Step 34: Click on item selectedPersonId"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/item_selectedPersonId'))

"Step 35: Click on button finish -> Navigate to page '/main/ifsapplications/web/page/CrmCustomerContact/*'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/button_finish'))

"Step 36: Click on input findPage"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomerContact/input_findPage'))

"Step 37: Enter input value in input findPage"

WebUI.setText(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomerContact/input_findPage'), input_findPage_1)

"Step 38: Click on link marketingCampaign -> Navigate to page '/main/ifsapplications/web/page/MarketingCampaign/*'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomerContact/link_marketingCampaign'))

"Step 39: Click on graniteChip search3"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/graniteChip_search3'))

"Step 40: Click on graniteChip advanced"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/graniteChip_advanced'))

"Step 41: Click on textarea advancedSearch"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/textarea_advancedSearch'))

"Step 42: Enter input value in textarea advancedSearch"

WebUI.setText(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/textarea_advancedSearch'), textarea_advancedSearch)

"Step 43: Click on button search"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_search'))

"Step 44: Click on div targets"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/div_targets'))

"Step 45: Click on button new6"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_new6'))

"Step 46: Click on input accountLead6"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_accountLead6'))

"Step 47: Click on input targetType"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_targetType'))

"Step 48: Enter input value in input targetType2"

WebUI.setText(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_targetType2'), input_targetType2)

"Step 49: Click on label leadContact"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/label_leadContact'))

"Step 50: Click on input accountLead7"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_accountLead7'))

"Step 51: Enter input value in input accountLead8"

WebUI.setText(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_accountLead8'), input_accountLead8)

"Step 52: Click on item selected"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/item_selected'))

"Step 53: Click on input leadContact"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_leadContact'))

"Step 54: Click on button picker4"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_picker4'))

"Step 55: Enter input value in input leadContact2"

WebUI.setText(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_leadContact2'), input_leadContact2)

"Step 56: Click on item selectedLeadContact"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/item_selectedLeadContact'))

"Step 57: Click on button save -> Navigate to page '/main/ifsapplications/web/page/BusinessLead/*'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_save'))

"Step 58: Click on button new"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_new'))

"Step 59: Click on input description"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_description'))

"Step 60: Enter input value in input description2"

WebUI.setText(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_description2'), input_description2)

"Step 61: Click on input leadCompany3"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_leadCompany3'))

"Step 62: Enter input value in input leadCompany4"

WebUI.setText(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_leadCompany4'), input_leadCompany4)

"Step 63: Click on input defaultLanguage3"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_defaultLanguage3'))

"Step 64: Enter input value in input defaultLanguage4"

WebUI.setText(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_defaultLanguage4'), input_defaultLanguage4)

"Step 65: Click on item languageOption"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/item_languageOption'))

"Step 66: Click on input country5"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_country5'))

"Step 67: Enter input value in input country6"

WebUI.setText(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_country6'), input_country6)

"Step 68: Click on item selectCountryOption"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/item_selectCountryOption'))

"Step 69: Click on input leadContact3"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_leadContact3'))

"Step 70: Enter input value in input leadContact4"

WebUI.setText(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_leadContact4'), input_leadContact4)

"Step 71: Click on button save -> Navigate to page '/main/ifsapplications/web/page/MarketingCampaign/*'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_save'))

"Step 72: Click on graniteChip search3"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/graniteChip_search3'))

"Step 73: Click on graniteChip advanced2"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/graniteChip_advanced2'))

"Step 74: Click on textarea advancedSearch2"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/textarea_advancedSearch2'))

"Step 75: Enter input value in textarea advancedSearch2"

WebUI.setText(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/textarea_advancedSearch2'), textarea_advancedSearch2)

"Step 76: Click on button search"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_search'))

"Step 77: Click on fndTabHeader targets"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/fndTabHeader_targets'))

"Step 78: Click on input checkbox"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_checkbox'))

"Step 79: Click on button deleteSelected3"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_deleteSelected3'))

"Step 80: Click on button delete"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_delete'))

"Step 81: Click on button deleteSelected4"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_deleteSelected4'))

"Step 82: Click on button delete -> Navigate to page '/main/ifsapplications/web/page/BusinessLead/*'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_delete'))

"Step 83: Click on graniteChip advanced"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/graniteChip_advanced'))

"Step 84: Click on textarea advancedSearch"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/textarea_advancedSearch'))

"Step 85: Enter input value in textarea advancedSearch"

WebUI.setText(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/textarea_advancedSearch'), textarea_advancedSearch_1)

"Step 86: Click on fndSearchActionsPanel search"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/fndSearchActionsPanel_search'))

"Step 87: Click on button search4"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_search4'))

"Step 88: Click on button deleteSelectedRecords"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_deleteSelectedRecords'))

"Step 89: Click on button delete -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_delete'))

"Step 90: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC75-Create and Manage Marketing Campaigns and Contacts_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}