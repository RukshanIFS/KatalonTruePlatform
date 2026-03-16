import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.ifs26r1samifsloops.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1563, 1092)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /landing-page"

TrueTestScripts.navigate("landing-page")

"Step 2: Click on link ifscloud -> Navigate to page '/auth/realms/*/protocol/openid-connect/auth'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_landing_page/link_ifscloud'))

"Step 3: Login into Application"

TrueTestScripts.login()

"Step 4: Navigate to /main/ifsapplications/web/*"

TrueTestScripts.navigate("main/ifsapplications/web/${web_id}")

"Step 5: Click on input search"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web/input_search'))

"Step 6: Enter input value in input search"

WebUI.setText(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web/input_search'), input_search)

"Step 7: Click on link schedulingOptimizationConfig -> Navigate to page '/main/ifsapplications/web/page/PsoIntegrationConfiguration/*'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web/link_schedulingOptimizationConfig'))

"Step 8: Click on input checkbox"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_PsoIntegrationConfiguration/input_checkbox'))

"Step 9: Click on button globalOverflow"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_PsoIntegrationConfiguration/button_globalOverflow'))

"Step 10: Click on link schedulingOptimizationDatasets -> Navigate to page '/main/ifsapplications/web/page/PsoIntegrationDatasets/*'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_PsoIntegrationConfiguration/link_schedulingOptimizationDatasets'))

"Step 11: Click on input checkbox"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_PsoIntegrationDatasets/input_checkbox'))

"Step 12: Click on input checkbox2"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_PsoIntegrationDatasets/input_checkbox2'))

"Step 13: Click on button enableDataset"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_PsoIntegrationDatasets/button_enableDataset'))

"Step 14: Click on div schedulingOptimizationDatasets"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_PsoIntegrationDatasets/div_schedulingOptimizationDatasets'))

"Step 15: Click on link viewOutputData -> Navigate to page '/main/ifsapplications/web/page/SchedulingOutputData/*'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_PsoIntegrationDatasets/link_viewOutputData'))

"Step 16: Click on button userProfile"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_SchedulingOutputData/button_userProfile'))

"Step 17: Click on button logout -> Navigate to page '/landing-page'"

WebUI.enhancedClick(findTestObject('Archived/Archived_20260316/ifs26r1samifsloops/Page_main_ifsapplications_web_page_SchedulingOutputData/button_logout'))

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC55-Configure Scheduling Optimization Datasets and Logout_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}