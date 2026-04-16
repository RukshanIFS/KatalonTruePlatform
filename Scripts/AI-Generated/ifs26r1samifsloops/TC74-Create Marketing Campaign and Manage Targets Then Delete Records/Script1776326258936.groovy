import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.ifs26r1samifsloops.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1804, 804)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /landing-page"

TrueTestScripts.navigate("/landing-page")

"Step 2: Click on link ifsiCloud -> Navigate to page '/auth/realms/*/protocol/openid-connect/auth'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_landing_page/link_ifsiCloud'))

"Step 3: Login into Application"

TrueTestScripts.login()

"Step 4: Click on input findPage"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web/input_findPage_1'))

"Step 5: Enter input value in input findPage"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web/input_findPage_1'), input_findPage)

"Step 6: Click on link relationshipManagement -> Navigate to page '/main/ifsapplications/web/page/MarketingCampaign/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web/link_relationshipManagement_1'))

"Step 7: Click on button new3"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_new3'))

"Step 8: Click on input description3"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_description3'))

"Step 9: Enter input value in input description4"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_description4'), input_description4)

"Step 10: Click on input campaignType3"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_campaignType3'))

"Step 11: Enter input value in input campaignType4"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_campaignType4'), input_campaignType4)

"Step 12: Click on item conferenceOption"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/item_conferenceOption'))

"Step 13: Click on input startDate3"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_startDate3'))

"Step 14: Enter input value in input startDate4"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_startDate4'), input_startDate4)

"Step 15: Click on input mainRepresentative3"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_mainRepresentative3'))

"Step 16: Enter input value in input mainRepresentative4"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_mainRepresentative4'), input_mainRepresentative4)

"Step 17: Click on item selectLovRow"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/item_selectLovRow'))

"Step 18: Click on button okNew -> Navigate to page '/main/ifsapplications/web/page/CrmCustomerContact/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_ok'))

"Step 19: Click on link newContact -> Navigate to page '/main/ifsapplications/web/assistant/NewContact/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomerContact/link_newContact_1'))

"Step 20: Click on label newCustomerOrLead"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/label_newCustomerOrLead_1'))

"Step 21: Click on input category3"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/input_category3'))

"Step 22: Enter input value in input category4"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/input_category4'), input_category4)

"Step 23: Click on item menuOptionProspect"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/item_prospect2'))

"Step 24: Click on input name3"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/input_name3'))

"Step 25: Enter input value in input name4"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/input_name4'), input_name4)

"Step 26: Click on input defaultLanguage3"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/input_defaultLanguage3'))

"Step 27: Enter input value in input defaultLanguage4"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/input_defaultLanguage4'), input_defaultLanguage4)

"Step 28: Click on item selectLanguageOption"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/item_english'))

"Step 29: Click on input country3"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/input_country3'))

"Step 30: Enter input value in input countryRequired"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/input_countryRequired'), input_countryRequired)

"Step 31: Click on item selectCountryOption"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/item_australiaDescription'))

"Step 32: Click on input contact3"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/input_contact3'))

"Step 33: Enter input value in input contact4"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/input_contact4'), input_contact4)

"Step 34: Click on item lovOptionSelected"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/item_lovOptionSelected'))

"Step 35: Click on button finish -> Navigate to page '/main/ifsapplications/web/page/CrmCustomerContact/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_assistant_NewContact/button_finish'))

"Step 36: Click on input findPage"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomerContact/input_findPage'))

"Step 37: Enter input value in input findPage"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomerContact/input_findPage'), input_findPage_1)

"Step 38: Click on link breadcrumbMarketingCampaign -> Navigate to page '/main/ifsapplications/web/page/MarketingCampaign/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomerContact/link_breadcrumbMarketingCampaign'))

"Step 39: Click on graniteChip search"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/graniteChip_search'))

"Step 40: Click on graniteChip search2"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/graniteChip_search2'))

"Step 41: Click on graniteChip searchPanel"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/graniteChip_searchPanel'))

"Step 42: Click on graniteChip selectAdvanced"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/graniteChip_selectAdvanced'))

"Step 43: Click on textarea advancedSearch"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/textarea_advancedSearch'))

"Step 44: Enter input value in textarea advancedSearch"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/textarea_advancedSearch'), textarea_advancedSearch)

"Step 45: Click on button search"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_search'))

"Step 46: Click on div targetsTab"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/div_targetsTab'))

"Step 47: Click on button new4"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_new4'))

"Step 48: Click on input targetType"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_targetType_1'))

"Step 49: Enter input value in input targetType"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_targetType_1'), input_targetType)

"Step 50: Click on label leadContact"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/label_leadContact'))

"Step 51: Click on input accountLead4"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_accountLead4'))

"Step 52: Enter input value in input accountLead5"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_accountLead5'), input_accountLead5)

"Step 53: Click on item lovOptionSelected"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/item_lovOptionSelected'))

"Step 54: Click on input leadContact"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_leadContact_1'))

"Step 55: Click on button openLeadContactPicker"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_openLeadContactPicker'))

"Step 56: Click on item lovOptionSelected2"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/item_lovOptionSelected2'))

"Step 57: Click on button save -> Navigate to page '/main/ifsapplications/web/page/BusinessLead/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_save'))

"Step 58: Click on button new"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_new_1'))

"Step 59: Click on input description"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_description_1'))

"Step 60: Enter input value in input description2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_description2'), input_description2)

"Step 61: Click on input leadCompany3"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_leadCompany3'))

"Step 62: Enter input value in input leadCompany4"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_leadCompany4'), input_leadCompany4)

"Step 63: Click on input defaultLanguage3"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_defaultLanguage3'))

"Step 64: Enter input value in input defaultLanguage4"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_defaultLanguage4'), input_defaultLanguage4_1)

"Step 65: Click on item languageOption"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/item_languageOption'))

"Step 66: Click on input country3"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_country3'))

"Step 67: Enter input value in input country4"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_country4'), input_country4)

"Step 68: Click on item selectCountryOption"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/item_auStralia'))

"Step 69: Click on button save"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_save'))

"Step 70: Click on input pageSearch"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_pageSearch'))

"Step 71: Enter input value in input pageSearch"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_pageSearch'), input_pageSearch)

"Step 72: Click on link breadcrumbMarketingCampaign -> Navigate to page '/main/ifsapplications/web/page/MarketingCampaign/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/link_breadcrumbMarketingCampaign'))

"Step 73: Click on graniteChip search"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/graniteChip_search'))

"Step 74: Click on graniteChip search2"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/graniteChip_search2'))

"Step 75: Click on graniteChip searchPanel"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/graniteChip_searchPanel'))

"Step 76: Click on graniteChip searchModeAdvanced"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/graniteChip_searchModeAdvanced'))

"Step 77: Hold CTRL and click on textarea advancedSearchInput"

TrueTestScripts.pressControlAndClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/textarea_advancedSearchInput'))

"Step 78: Enter input value in textarea advancedSearchInput"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/textarea_advancedSearchInput'), textarea_advancedSearchInput)

"Step 79: Click on button search"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_search'))

"Step 80: Click on fndTabHeader targets"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/fndTabHeader_targets'))

"Step 81: Click on input checkbox"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/input_checkbox'))

"Step 82: Click on button deleteSelectedRecords"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_deleteSelectedRecords'))

"Step 83: Click on button delete"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_delete_1'))

"Step 84: Click on button deleteSelectedRecords2"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_deleteSelectedRecords2'))

"Step 85: Click on button delete -> Navigate to page '/main/ifsapplications/web/page/BusinessLead/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_MarketingCampaign/button_delete_1'))

"Step 86: Click on graniteChip searchModeToggleAdvanced"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/graniteChip_advanced'))

"Step 87: Click on textarea advancedSearch"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/textarea_advancedSearch_1'))

"Step 88: Enter input value in textarea advancedSearch"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/textarea_advancedSearch_1'), textarea_advancedSearch_1)

"Step 89: Click on button search3"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_search2'))

"Step 90: Click on button deleteSelectedRecords"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_deleteSelectedRecords_1'))

"Step 91: Click on button delete -> Navigate to page '/main/ifsapplications/web/page/CrmCustomerContact/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_delete_1'))

"Step 92: Click on graniteChip searchModeToggleAdvanced"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomerContact/graniteChip_advanced'))

"Step 93: Click on textarea advancedSearchInput"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomerContact/textarea_advancedSearchInput'))

"Step 94: Enter input value in textarea advancedSearchInput"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomerContact/textarea_advancedSearchInput'), textarea_advancedSearchInput_1)

"Step 95: Click on fndSearchActionsPanel advancedSearchActions"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomerContact/fndSearchActionsPanel_advancedSearchActions'))

"Step 96: Click on button search"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomerContact/button_search'))

"Step 97: Click on button deleteSelectedRecords"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomerContact/button_deleteSelectedRecords'))

"Step 98: Click on button delete -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomerContact/button_delete_1'))

"Step 99: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC74-Create Marketing Campaign and Manage Targets Then Delete Records_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}