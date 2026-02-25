import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import archived.archived_20260225.truetest.ifs26r1samifsloops.common.inputLeadDetailsAndLanguageSelection
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

"Step 6: Navigate to /main/ifsapplications/web/page/BusinessLead/*"

TrueTestScripts.navigate("main/ifsapplications/web/page/BusinessLead/${BusinessLead_id}")

"Step 7: Click on button new"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_new'))

"Step 8: Input lead description and select language and country."

inputLeadDetailsAndLanguageSelection.execute(input_country2, input_defaultLanguage4, input_description2, input_leadCompany2)

"Step 9: Click on item argentinaOption"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/item_argentinaOption'))

"Step 10: Click on button businessLeadActions (save)"

// Bind values to the variables in the locators of "Archived/Archived_20260225/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_BusinessLead/button_businessLeadActions"
WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_BusinessLead/button_businessLeadActions', ['button_businessLeadActions_ButtonTitle_1': button_businessLeadActions_ButtonTitle, 'button_businessLeadActions_css_value_1': button_businessLeadActions_css_value]))

"Step 11: Click on fndTabHeader involvedParties"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/fndTabHeader_involvedParties'))

"Step 12: Click on button new2"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_new2'))

"Step 13: Click on input name3"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_name3'))

"Step 14: Enter input value in input name4"

WebUI.setText(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_name4'), input_name4)

"Step 15: Click on item mainRepresentative"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/item_mainRepresentative'))

"Step 16: Click on label representatives"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/label_representatives'))

"Step 17: Click on button dynamicObject (save2)"

// Bind values to the variables in the locators of "Archived/Archived_20260225/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_BusinessLead/button_dynamicObject"
WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_BusinessLead/button_dynamicObject', ['button_dynamicObject_ButtonTitle_1': button_dynamicObject_ButtonTitle, 'button_dynamicObject_css_value_1': button_dynamicObject_css_value]))

"Step 18: Click on button dynamicObject (addFromRepGroup)"

// Bind values to the variables in the locators of "Archived/Archived_20260225/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_BusinessLead/button_dynamicObject"
WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_BusinessLead/button_dynamicObject', ['button_dynamicObject_ButtonTitle_1': button_dynamicObject_ButtonTitle_1, 'button_dynamicObject_css_value_1': button_dynamicObject_css_value_1]))

"Step 19: Click on button picker"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_picker'))

"Step 20: Click on input representativeGroup"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_representativeGroup'))

"Step 21: Enter input value in input representativeGroup"

WebUI.setText(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_representativeGroup'), input_representativeGroup)

"Step 22: Click on item representativeGroup"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/item_representativeGroup'))

"Step 23: Click on fndSelectCell selectRow"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/fndSelectCell_selectRow'))

"Step 24: Click on button addRepresentatives"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_addRepresentatives'))

"Step 25: Click on input checkboxGroup (checkbox)"

// Bind values to the variables in the locators of "Archived/Archived_20260225/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_BusinessLead/input_checkboxGroup"
WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_BusinessLead/input_checkboxGroup', ['input_checkboxGroup_css_value_1': input_checkboxGroup_css_value]))

"Step 26: Click on fndSelectCell selectRow"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/fndSelectCell_selectRow'))

"Step 27: Click on input checkboxGroup (checkbox2)"

// Bind values to the variables in the locators of "Archived/Archived_20260225/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_BusinessLead/input_checkboxGroup"
WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_BusinessLead/input_checkboxGroup', ['input_checkboxGroup_css_value_1': input_checkboxGroup_css_value_1]))

"Step 28: Click on input checkboxGroup (checkbox3)"

// Bind values to the variables in the locators of "Archived/Archived_20260225/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_BusinessLead/input_checkboxGroup"
WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_BusinessLead/input_checkboxGroup', ['input_checkboxGroup_css_value_1': input_checkboxGroup_css_value_2]))

"Step 29: Click on button addRepresentatives"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_addRepresentatives'))

"Step 30: Click on fndOverflowContainer close"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/fndOverflowContainer_close'))

"Step 31: Click on fndOverflowContainer close"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/fndOverflowContainer_close'))

"Step 32: Click on button leadCompletion (close)"

// Bind values to the variables in the locators of "Archived/Archived_20260225/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_BusinessLead/button_leadCompletion"
WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_BusinessLead/button_leadCompletion', ['button_leadCompletion_ButtonTitle_1': button_leadCompletion_ButtonTitle, 'button_leadCompletion_css_value_1': button_leadCompletion_css_value]))

"Step 33: Click on button deleteSelected2"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_deleteSelected2'))

"Step 34: Click on button delete"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_delete'))

"Step 35: Click on div businessLeadRepList"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/div_businessLeadRepList'))

"Step 36: Click on button deleteSelected2"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_deleteSelected2'))

"Step 37: Click on button delete"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_delete'))

"Step 38: Click on button deleteSelectedRecords"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_deleteSelectedRecords'))

"Step 39: Click on button delete -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_delete'))

"Step 40: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC14-Add Representatives to Business Leads in IFS Applications_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}