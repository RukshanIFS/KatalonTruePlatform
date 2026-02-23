package truetest.ifs26r1samifsloops.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class deleteCustomerAndSearchGraniteChip {
    
    private static def execute(String textarea_search) {
        
        "Step 1: Click on button delete -> Navigate to page '/main/ifsapplications/web/page/CrmCustomer/*'"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessActivity/button_delete'))
        
        "Step 2: Click on graniteChip search"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/graniteChip_search'))
        
        "Step 3: Click on graniteChip advanced"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/graniteChip_advanced'))
        
        "Step 4: Click on textarea search"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/textarea_search'))
        
        "Step 5: Enter input value in textarea search"
        
        WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/textarea_search'), textarea_search)
    }
}

