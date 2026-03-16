import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.ifs26r1samifsloops.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 945)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /auth/realms/*/protocol/openid-connect/auth with params (client id, nonce, redirect uri, response type, scope, state)"

TrueTestScripts.navigate("auth/realms/${realms_id}/protocol/openid-connect/auth", ["client_id": auth_client_id, "nonce": auth_nonce, "redirect_uri": auth_redirect_uri, "response_type": auth_response_type, "scope": auth_scope, "state": auth_state])

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Navigate to /main/ifsapplications/web/*"

TrueTestScripts.navigate("main/ifsapplications/web/${web_id}")

"Step 4: Click on input search"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web/input_search'))

"Step 5: Enter input value in input search"

WebUI.setText(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web/input_search'), input_search)

"Step 6: Click on link relationshipManagement -> Navigate to page '/main/ifsapplications/web/lobby/*'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web/link_relationshipManagement'))

"Step 7: Click on i blowup"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_lobby/i_blowup'))

"Step 8: Click on i collapse"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_lobby/i_collapse'))

"Step 9: Click on i blowup2"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_lobby/i_blowup2'))

"Step 10: Click on i collapse2"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_lobby/i_collapse2'))

"Step 11: Click on i blowup3"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_lobby/i_blowup3'))

"Step 12: Click on i collapse3"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_lobby/i_collapse3'))

"Step 13: Click on i blowup4"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_lobby/i_blowup4'))

"Step 14: Click on i collapse4"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_lobby/i_collapse4'))

"Step 15: Click on i blowup5"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_lobby/i_blowup5'))

"Step 16: Click on i collapse5"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_lobby/i_collapse5_1'))

"Step 17: Click on i blowup6"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_lobby/i_blowup6'))

"Step 18: Click on i collapse6"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_lobby/i_collapse5'))

"Step 19: Click on i blowup7"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_lobby/i_blowup7'))

"Step 20: Click on i collapse7"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_lobby/i_collapse6'))

"Step 21: Click on i blowup8"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_lobby/i_blowup8'))

"Step 22: Click on i collapse8"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_lobby/i_collapse7'))

"Step 23: Click on div zoomIcon"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_lobby/div_zoomIcon_1'))

"Step 24: Click on i collapse9"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_lobby/i_collapse8'))

"Step 25: Click on i blowup9"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_lobby/i_blowup10'))

"Step 26: Click on i collapse10"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_lobby/i_collapse9'))

"Step 27: Click on i blowup10"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_lobby/i_blowup11'))

"Step 28: Click on i collapse11"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_lobby/i_collapse10'))

"Step 29: Click on i blowup11"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_lobby/i_blowup12'))

"Step 30: Click on i collapse12"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_lobby/i_collapse11'))

"Step 31: Click on i blowup12"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_lobby/i_blowup13'))

"Step 32: Click on i collapse13"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_lobby/i_collapse12'))

"Step 33: Click on i blowup13"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_lobby/i_blowup14'))

"Step 34: Click on i collapse14"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_lobby/i_collapse13'))

"Step 35: Click on button userDropdown"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_lobby/button_userDropdown'))

"Step 36: Click on button logout -> Navigate to page '/landing-page'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_lobby/button_logout'))

"Step 37: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC49-Test Relationship Management Navigation and Collapse Functionality_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}