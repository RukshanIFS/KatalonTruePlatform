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

'Genarate Random number to identify records uniquely'
String RN = ((Math.random() * 10000000) as int)
input_accountLead2 = 'crm_servicemanagement' + RN
input_description = 'CRM_ML' + RN
input_description4 = "crm_lead" + RN
input_description8 = "new marketing campaign_" + RN
input_filter = input_description
input_leadCompany6 = input_accountLead2

textarea_advancedSearch = "(startswith(tolower(Description),'crm_ml"+RN+"'))"
textarea_advancedSearch3 = "(startswith(tolower(Description),'new marketing campaign_1"+RN+"'))"
textarea_advancedSearch_1 = "(startswith(tolower(Description),'crm_lead"+RN+"'))"

"Step 1: Navigate to https://ifs26r1samifsloops.rnd.ifsdevworld.com/landing-page"

TrueTestScripts.navigate("/landing-page")

// "Step 2: Click on link ifsiFsccloud -> Navigate to page '/auth/realms/*/protocol/openid-connect/auth'"

// WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_landing_page/link_ifsiFsccloud'))

// "Step 3: Click on body idIfsBody"

// WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_auth_realms_protocol_openid_connect_auth/body_idIfsBody'))

"Step 4: Login into Application"

TrueTestScripts.login()

"Step 5: Click on input search"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/input_search'))

"Step 6: Enter input value in input search"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/input_search'), input_search)

"Step 7: Click on link marketingList"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/link_marketingList'))

"Step 8: Click on button new"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/button_new'))

"Step 9: Enter input value in input description"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/input_description'), input_description)

"Step 10: Click on input notes"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/input_notes'))

"Step 11: Enter input value in input notes2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/input_notes2'), input_notes2)

"Step 12: Click on button save"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/button_save'))

"Step 13: Click on input findPage -> Navigate to page '/main/ifsapplications/web/page/BusinessLead/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/input_search'))

WebUI.navigateToUrl("https://ifs26r1samifsloops.rnd.ifsdevworld.com/main/ifsapplications/web/page/BusinessLead/BusinessLeadDetailPage")

"Step 14: Click on button new"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_new'))

"Step 15: Click on input description3"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_description3'))

"Step 16: Enter input value in input description4"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_description4'), input_description4)

"Step 17: Click on input leadCompany5"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_leadCompany5'))

"Step 18: Enter input value in input leadCompany6"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_leadCompany6'), input_leadCompany6)

"Step 19: Click on input defaultLanguage5"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_defaultLanguage5'))

"Step 20: Enter input value in input defaultLanguage6"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_defaultLanguage6'), input_defaultLanguage6)

"Step 21: Click on label english"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/label_english'))

"Step 22: Click on input country7"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_country7'))

"Step 23: Enter input value in input country8"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_country8'), input_country8)

"Step 24: Click on label australia"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/label_australia'))

"Step 25: Click on input leadContact5"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_leadContact5'))

"Step 26: Enter input value in input leadContact6"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_leadContact6'), input_leadContact6)

"Step 27: Click on button save"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_save'))

"Step 28: Click on input pageSearch"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_pageSearch'))

"Step 29: Enter input value in input pageSearch"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_pageSearch'), input_pageSearch)

"Step 30: Click on link marketingList -> Navigate to page '/main/ifsapplications/web/page/MarketingList/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/link_marketingList'))

"Step 31: Click on graniteChip search"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/graniteChip_search'))

"Step 32: Click on graniteChip selectAdvanced"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/graniteChip_selectAdvanced'))

"Step 33: Click on textarea advancedSearch"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/textarea_advancedSearch'))

"Step 34: Enter input value in textarea advancedSearch"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/textarea_advancedSearch'), textarea_advancedSearch)

"Step 35: Click on fndSearchActionsPanel object"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/fndSearchActionsPanel_object'))

"Step 36: Click on button search"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/button_search'))

"Step 37: Click on button new2"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/button_new2'))

"Step 38: Enter input value in input targetType"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/input_targetType'), input_targetType)

"Step 39: Click on item leadContact"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/item_leadContact'))

"Step 40: Click on input accountLead"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/input_accountLead'))

"Step 41: Enter input value in input accountLead2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/input_accountLead2'), input_accountLead2)

"Step 42: Click on item selectedOption"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/item_selectedOption'))

"Step 43: Click on input leadContact"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/input_leadContact'))

"Step 44: Enter input value in input leadContact2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/input_leadContact2'), input_leadContact2)

"Step 45: Click on item crmLeadContact"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/item_crmLeadContact'))

"Step 46: Click on button save2"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/button_save2'))

"Step 47: Click on input findPage"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/input_search'))

"Step 48: Enter input value in input findPage"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/input_search'), input_findPage)

"Step 49: Click on link marketingCampaign -> Navigate to page '/main/ifsapplications/web/page/MarketingCampaign/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/link_marketingCampaign'))

"Step 50: Click on button new7"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_new7'))

"Step 51: Click on input description7"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_description7'))

"Step 52: Enter input value in input description8"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_description8'), input_description8)

"Step 53: Click on input campaignType6"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_campaignType6'))

"Step 54: Enter input value in input campaignType7"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_campaignType7'), input_campaignType7)

"Step 55: Click on label conference"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/label_conference'))

"Step 56: Click on input startDate7"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_startDate7'))

"Step 57: Enter input value in input startDate8"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_startDate8'), input_startDate8)

"Step 58: Click on input mainRepresentative7"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_mainRepresentative7'))

"Step 59: Enter input value in input mainRepresentative8"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_mainRepresentative8'), input_mainRepresentative8)

"Step 60: Click on item selectedRepresentative"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/item_selectedRepresentative'))

"Step 61: Click on fndOverflowContainer object"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/fndOverflowContainer_object'))

"Step 62: Click on button ok"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_ok'))

"Step 63: Click on button addTargets"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_addTargets'))

"Step 64: Click on button filterPanel"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_filterPanel'))

"Step 65: Click on div description"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/div_description'))

"Step 66: Enter input value in input filter"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_filter'), input_filter)

"Step 67: Click on button applySearch"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_applySearch'))

"Step 68: Click on input checkbox"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_checkbox'))

"Step 69: Click on button ok2"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_ok2'))

"Step 70: Click on div marketingListsTab"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/div_marketingListsTab'))

"Step 71: Click on input checkbox2"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_checkbox2'))

"Step 72: Click on link goToDetails -> Navigate to page '/main/ifsapplications/web/page/MarketingList/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/link_goToDetails'))

"Step 73: Click on button delete"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/button_delete'))

"Step 74: Click on button delete2"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/button_delete2'))

"Step 75: Click on input findPage"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/input_search'))

"Step 76: Enter input value in input findPage"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/input_search'), input_findPage_1)

"Step 77: Click on link lead -> Navigate to page '/main/ifsapplications/web/page/BusinessLead/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingList/link_lead'))

"Step 78: Click on graniteChip searchModeToggle"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/graniteChip_searchModeToggle'))

"Step 79: Click on textarea advancedSearch"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/textarea_advancedSearch'))

"Step 80: Enter input value in textarea advancedSearch"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/textarea_advancedSearch'), textarea_advancedSearch_1)

"Step 81: Click on button search5"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_search5'))

"Step 82: Click on button deleteSelectedRecords"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_deleteSelectedRecords'))

"Step 83: Click on button delete"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_delete'))

"Step 84: Click on input findPage"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_pageSearch'))

"Step 85: Enter input value in input findPage"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_pageSearch'), input_findPage_2)

"Step 86: Click on link marketingCampaign -> Navigate to page '/main/ifsapplications/web/page/MarketingCampaign/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/link_marketingCampaign'))

"Step 87: Click on div overflowContainer"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/div_overflowContainer'))

"Step 88: Click on graniteChip search4"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/graniteChip_search4'))

"Step 89: Click on graniteChip advanced3"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/graniteChip_advanced3'))

"Step 90: Click on textarea advancedSearch3"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/textarea_advancedSearch3'))

"Step 91: Enter input value in textarea advancedSearch3"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/textarea_advancedSearch3'), textarea_advancedSearch3)

"Step 92: Click on button search"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_search'))

"Step 93: Click on button deleteSelected5"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_deleteSelected5'))

"Step 94: Click on button delete -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_delete'))

"Step 95: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC77-Comprehensive Marketing Management Workflow in IFS Applications_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
