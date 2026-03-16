import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.ifs26r1samifsloops.custom.TrueTestScripts


'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1510, 516)
	//WebUI.maximizeWindow()
}

"Step 1: Navigate to /landing-page"

TrueTestScripts.navigate("/landing-page")

"Step 2: Click on link ifsCloud -> Navigate to page '/auth/realms/*/protocol/openid-connect/auth'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_landing_page/link_ifsCloud'))

"Step 3: Login into Application"

TrueTestScripts.login()

"Step 4: Navigate to /main/ifsapplications/web/*"

TrueTestScripts.navigate("/main/ifsapplications/web/${web_id}")

"Step 5: Click on button navigator"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web/button_navigator'))

"Step 6: Click on input findPage2"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web/input_findPage2'))

"Step 7: Enter input value in input findPage2"

WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web/input_findPage2'), input_findPage2)

"Step 8: Click on link solutionManagerAutomationOptimization -> Navigate to page '/main/ifsapplications/web/page/PsoIntegrationConfiguration/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web/link_solutionManagerAutomationOptimization'))

"Step 9: Click on input checkbox"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_PsoIntegrationConfiguration/input_checkbox'))

"Step 10: Click on div menuTrigger"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_PsoIntegrationConfiguration/div_menuTrigger'))

"Step 11: Click on button testConnection"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_PsoIntegrationConfiguration/button_testConnection'))

"Step 12: Click on div menuTrigger2"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_PsoIntegrationConfiguration/div_menuTrigger2'))

"Step 13: Click on link schedulingOptimizationDatasets -> Navigate to page '/main/ifsapplications/web/page/PsoIntegrationDatasets/*'"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_PsoIntegrationConfiguration/link_schedulingOptimizationDatasets'))

"Step 14: Click on input psoIntegrationDatasetsCheckbox"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_PsoIntegrationDatasets/input_psoIntegrationDatasetsCheckbox'))

"Step 15: Click on input checkbox"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_PsoIntegrationDatasets/input_checkbox'))

"Step 16: Click on button disableDataset"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_PsoIntegrationDatasets/button_disableDataset'))

"Step 17: Click on button ok -> Navigate to page ''"

WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_PsoIntegrationDatasets/button_ok'))

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC58-Test Connection and Manage Datasets in Solution Manager_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}