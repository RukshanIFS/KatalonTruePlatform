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

"Step 1: Navigate to /landing-page"

TrueTestScripts.navigate("landing-page")

"Step 2: Click on link ifscloud -> Navigate to page '/auth/realms/*/protocol/openid-connect/auth'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_landing_page/link_ifscloud'))

"Step 3: Login into Application"

TrueTestScripts.login()

"Step 4: Navigate to /main/ifsapplications/web/*"

TrueTestScripts.navigate("main/ifsapplications/web/${web_id}")

"Step 5: Click on input search"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web/input_search'))

"Step 6: Enter input value in input search"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web/input_search'), input_search)

"Step 7: Click on link navigateToLeadDetail -> Navigate to page '/main/ifsapplications/web/page/BusinessLead/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web/link_navigateToLeadDetail'))

"Step 8: Click on button new"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_new'))

"Step 9: Click on input description"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_description'))

"Step 10: Enter input value in input description2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_description2'), input_description2)

"Step 11: Click on input leadCompany"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_leadCompany'))

"Step 12: Enter input value in input leadCompany2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_leadCompany2'), input_leadCompany2)

"Step 13: Click on input defaultLanguage"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_defaultLanguage'))

"Step 14: Enter input value in input defaultLanguage2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_defaultLanguage2'), input_defaultLanguage2)

"Step 15: Click on item english"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/item_english'))

"Step 16: Click on button save"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_save'))

"Step 17: Click on button status"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_status'))

"Step 18: Click on button qualified"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_qualified'))

"Step 19: Click on button delete"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_delete'))

"Step 20: Click on button delete2 -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/button_delete2'))

"Step 21: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC21-Create and Manage Business Lead in IFS Applications_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}