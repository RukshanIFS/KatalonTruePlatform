import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import archived.archived_20260225.truetest.ifs26r1samifsloops.common.setDefaultLanguageAndBusinessDetails
import truetest.ifs26r1samifsloops.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(2048, 1018)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /main/ifsapplications/web/*"

TrueTestScripts.navigate("main/ifsapplications/web/${web_id}")

"Step 2: Click on button userDropdown"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web/button_userDropdown'))

"Step 3: Click on button logout -> Navigate to page '/landing-page'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web/button_logout'))

"Step 4: Click on link ifsiCloud -> Navigate to page '/auth/realms/*/protocol/openid-connect/auth'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_landing_page/link_ifsiCloud'))

"Step 5: Login into Application"

TrueTestScripts.login()

"Step 6: Navigate to /main/ifsapplications/web/*"

TrueTestScripts.navigate("main/ifsapplications/web/${web_id}")

"Step 7: Click on input findPage"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web/input_findPage'))

"Step 8: Enter input value in input findPage"

WebUI.setText(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web/input_findPage'), input_findPage)

"Step 9: Click on link relationshipManagement -> Navigate to page '/main/ifsapplications/web/page/CrmCustomer/*'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web/link_relationshipManagement'))

"Step 10: Click on button new"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_new'))

"Step 11: Click on input name"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_name'))

"Step 12: Enter input value in input name2"

WebUI.setText(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_name2'), input_name2)

"Step 13: Click on input category"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_category'))

"Step 14: Enter input value in input category2"

WebUI.setText(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_category2'), input_category2)

"Step 15: Click on item customer"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/item_customer'))

"Step 16: Set default language and input business country details."

setDefaultLanguageAndBusinessDetails.execute(input_country2, input_defaultLanguage2, item_businessDetails_css_value)

"Step 17: Click on item argentinaOption"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/item_argentinaOption'))

"Step 18: Click on button crmAction (save)"

// Bind values to the variables in the locators of "Archived/Archived_20260225/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_CrmCustomer/button_crmAction"
WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_CrmCustomer/button_crmAction', ['button_crmAction_ButtonTitle_1': button_crmAction_ButtonTitle, 'button_crmAction_css_value_1': button_crmAction_css_value]))

"Step 19: Click on div commMethodsTab"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/div_commMethodsTab'))

"Step 20: Click on button new2"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_new2'))

"Step 21: Click on input communicationMethod"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_communicationMethod'))

"Step 22: Enter input value in input communicationMethod2"

WebUI.setText(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_communicationMethod2'), input_communicationMethod2)

"Step 23: Click on item phoneOption"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/item_phoneOption'))

"Step 24: Click on input value"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_value'))

"Step 25: Enter input value in input value2"

WebUI.setText(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_value2'), input_value2)

"Step 26: Click on button save2"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_save2'))

"Step 27: Click on button delete"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_delete'))

"Step 28: Click on button delete2"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_delete2'))

"Step 29: Click on button deleteRecord"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_deleteRecord'))

"Step 30: Click on button delete2 -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/button_delete2'))

"Step 31: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC15-Manage Customer Relationships and Communication Methods in IFS Applications_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}