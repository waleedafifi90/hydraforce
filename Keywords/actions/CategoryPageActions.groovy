package actions

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement

import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable



public class CategoryPageActions {
	/***
	 * Select Random option from classification filter
	 * @author Yasmeen
	 */
	public static void selectRandomClassifications() {
		List <WebElement> classificationOptions =
				WebUI.findWebElements(findTestObject("Object Repository/CategoryPageObjects/label_classifcationOption"),
				GlobalVariable.elementVisibilityTimeOut)
				
		int index = (int)(Math.random() *classificationOptions.size());
		WebElement randomClassificationOption = classificationOptions.get(index)
		TestObject selectedClassificationOption = WebUI.convertWebElementToTestObject(randomClassificationOption)
		WebUI.click(selectedClassificationOption)
	}
}
