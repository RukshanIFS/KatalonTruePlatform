package truetest.ifs26r1samifsloops.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class setDefaultLanguageAndBusinessDetails {
    
    private static def execute(String input_country2, String input_defaultLanguage2, String item_businessDetails_css_value_1) {
        
        "Step 1: Click on input defaultLanguage"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_defaultLanguage'))
        
        "Step 2: Enter input value in input defaultLanguage2"
        
        WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_defaultLanguage2'), input_defaultLanguage2)
        
        "Step 3: Click on item businessDetails (english)"
        
        // Bind values to the variables in the locators of "AI-Generated/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_CrmCustomer/item_businessDetails"
        WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Dynamic Objects/Page_main_ifsapplications_web_page_CrmCustomer/item_businessDetails', ['item_businessDetails_css_value_1': item_businessDetails_css_value_1]))
        
        "Step 4: Click on input country"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_country'))
        
        "Step 5: Enter input value in input country2"
        
        WebUI.setText(findTestObject('AI-Generated/ifs26r1samifsloops/Page_main_ifsapplications_web_page_CrmCustomer/input_country2'), input_country2)
    }
}

