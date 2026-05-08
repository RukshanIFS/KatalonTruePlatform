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

"Step 1: Navigate to https://ifs26r1samifsloops.rnd.ifsdevworld.com/main/ifsapplications/web/start;path=0.1"

TrueTestScripts.navigate("/main/ifsapplications/web/${web_id}")

"Step 2: Click on button userDropdown"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web/button_userDropdown'))

"Step 3: Click on button logout -> Navigate to page '/landing-page'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web/button_logout'))

"Step 4: Click on link ifsiFsccloud -> Navigate to page '/auth/realms/*/protocol/openid-connect/auth'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_landing_page/link_ifsiFsccloud'))

"Step 5: Login into Application"

TrueTestScripts.login()

"Step 6: Click on button new"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_new'))

"Step 7: Click on input name"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_name'))

"Step 8: Enter input value in input name2"

WebUI.setText(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_name2'), input_name2)

"Step 9: Click on input category"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_category'))

"Step 10: Enter input value in input category2"

WebUI.setText(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_category2'), input_category2)

"Step 11: Click on item customer"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/item_customer'))

"Step 12: Click on input defaultLanguage"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_defaultLanguage'))

"Step 13: Enter input value in input defaultLanguage2"

WebUI.setText(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_defaultLanguage2'), input_defaultLanguage2)

"Step 14: Click on item english"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/item_english'))

"Step 15: Click on input country"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_country'))

"Step 16: Enter input value in input country2"

WebUI.setText(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_country2'), input_country2)

"Step 17: Click on label australia"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/label_australia'))

"Step 18: Click on button save"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_save'))

"Step 19: Click on button newBusinessActivity"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_newBusinessActivity'))

"Step 20: Click on input subject"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_subject'))

"Step 21: Enter input value in input subject2"

WebUI.setText(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_subject2'), input_subject2)

"Step 22: Click on input mainRepresentative"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_mainRepresentative'))

"Step 23: Enter input value in input mainRepresentative2"

WebUI.setText(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_mainRepresentative2'), input_mainRepresentative2)

"Step 24: Click on item selected"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/item_selected'))

"Step 25: Click on button ok"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_ok'))

"Step 26: Click on button no"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_no'))

"Step 27: Click on div references"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/div_references'))

"Step 28: Click on input object"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_object'))

"Step 29: Click on link goToDetails -> Navigate to page '/main/ifsapplications/web/page/BusinessActivity/*'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/link_goToDetails'))

"Step 30: Click on button deleteSelected"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessActivity/button_deleteSelected'))

"Step 31: Click on button delete -> Navigate to page '/main/ifsapplications/web/page/CrmCustomer/*'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessActivity/button_delete'))

"Step 32: Click on graniteChip searchModeToggle"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/graniteChip_searchModeToggle'))

"Step 33: Click on textarea advancedSearchInput"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/textarea_advancedSearchInput'))

"Step 34: Enter input value in textarea advancedSearchInput"

WebUI.setText(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/textarea_advancedSearchInput'), textarea_advancedSearchInput)

"Step 35: Click on button search"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_search'))

"Step 36: Click on textarea advancedSearch"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/textarea_advancedSearch'))

"Step 37: Enter input value in textarea advancedSearch"

WebUI.setText(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/textarea_advancedSearch'), textarea_advancedSearch)

"Step 38: Click on button search"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_search'))

"Step 39: Click on div search"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/div_search'))

"Step 40: Click on textarea advancedSearch"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/textarea_advancedSearch'))

"Step 41: Enter input value in textarea advancedSearch"

WebUI.setText(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/textarea_advancedSearch'), textarea_advancedSearch_1)

"Step 42: Click on button search"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_search'))

"Step 43: Click on textarea advancedSearch"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/textarea_advancedSearch'))

"Step 44: Enter input value in textarea advancedSearch"

WebUI.setText(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/textarea_advancedSearch'), textarea_advancedSearch_2)

"Step 45: Click on button search"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_search'))

"Step 46: Click on button delete"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_delete'))

"Step 47: Click on div deleteRecordDialog"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/div_deleteRecordDialog'))

"Step 48: Click on button delete2 -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260508/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_delete2'))

"Step 49: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC76-Manage Customers and Business Activities in CRM_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}