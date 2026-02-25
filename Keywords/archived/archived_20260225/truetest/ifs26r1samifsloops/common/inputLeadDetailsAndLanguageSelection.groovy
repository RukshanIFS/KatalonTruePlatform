package archived.archived_20260225.truetest.ifs26r1samifsloops.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class inputLeadDetailsAndLanguageSelection {
    
    private static def execute(String input_country2, String input_defaultLanguage4, String input_description2, String input_leadCompany2) {
        
        "Step 1: Click on input description"
        
        WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_description'))
        
        "Step 2: Enter input value in input description2"
        
        WebUI.setText(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_description2'), input_description2)
        
        "Step 3: Click on input leadCompany"
        
        WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_leadCompany'))
        
        "Step 4: Enter input value in input leadCompany2"
        
        WebUI.setText(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_leadCompany2'), input_leadCompany2)
        
        "Step 5: Click on input defaultLanguage3"
        
        WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_defaultLanguage3'))
        
        "Step 6: Enter input value in input defaultLanguage4"
        
        WebUI.setText(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_defaultLanguage4'), input_defaultLanguage4)
        
        "Step 7: Click on item englishOption"
        
        WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/item_englishOption'))
        
        "Step 8: Click on input country"
        
        WebUI.enhancedClick(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_country'))
        
        "Step 9: Enter input value in input country2"
        
        WebUI.setText(findTestObject('Archived/Archived_20260225/ifs26r1samifsloops/Page_main_ifsapplications_web_page_BusinessLead/input_country2'), input_country2)
    }
}

