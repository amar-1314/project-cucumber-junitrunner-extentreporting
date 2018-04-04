package com.fp.support;

import com.google.inject.Inject;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class UIActions {

	private final WebDriver driver;

	@Inject
	public UIActions(WebDriver driver) {
		this.driver = driver;
	}

	public void ClearCheckBox(By fieldId) {
		if (driver.findElement(fieldId).isSelected()) {
			driver.findElement(fieldId).click();
		}
	}

	public void ClearCheckBox(WebElement webelement) {
		if (webelement.isSelected()) {
			webelement.click();
		}
	}

	public void ClearFieldValue(By fieldId) {
		driver.findElement(fieldId).clear();
	}

	public void ClearFieldValue(WebElement webelement) {
		webelement.clear();
	}
	
	public void ClickAll(By by){
		List<WebElement> buttons = driver.findElements(by);
		for (WebElement button : buttons){
			button.click();
		}
	}

	public void ClickButton(By fieldId) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(fieldId));
		try {
			driver.findElement(fieldId).click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("overlay-background")));
			driver.findElement(fieldId).click();
		}
	}
	
	public void ClickButton(WebElement webelement) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(webelement));
		try {
			webelement.click();
		} catch (Exception e) {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("overlay-background")));
			webelement.click();
		}
	}

	public void ClickButtonIfPresent(By by) {
		Wait<WebDriver> shortWait = getWait(1);
		try {
			WebElement button = shortWait.until(ExpectedConditions.visibilityOfElementLocated(by));
			button.click();
		} catch (WebDriverException e) {
			return;
		}
	}

	public void FinishLoading() {
		By overlay = By.id("overlay-content");
		Wait<WebDriver> longWait = getWait(60);
		longWait.until(ExpectedConditions.visibilityOfElementLocated(overlay));
		longWait.until(ExpectedConditions.invisibilityOfElementLocated(overlay));
	}

	public String GetSelectedValue(By fieldID) {
		Select dropDown = new Select(driver.findElement(fieldID));
		WebElement option = dropDown.getFirstSelectedOption();
		return option.getText();
	}

	public String GetText(By fieldID) {
		return driver.findElement(fieldID).getText().trim();
	}

	public String GetText(WebElement webelement) {
		return webelement.getText().trim();
	}

	public String GetTextIfPresent(By by) {
		Wait<WebDriver> shortWait = getWait(1);
		try {
			shortWait.until(ExpectedConditions.visibilityOfElementLocated(by));
			return GetText(by);
		} catch (WebDriverException e) {
			return null;
		}
	}

	public String GetValueAttribute(By fieldID) {
		return driver.findElement(fieldID).getAttribute("value").trim();
	}

	public String GetValueAttribute(WebElement webelement) {
		return webelement.getAttribute("value").trim();
	}
	
	public List<WebElement> GetWebElementsList(By fieldID) {
		List<WebElement> elements = driver.findElements(fieldID);
		return elements;
	}
	
	public WebElement GetWebElement(By fieldID) {
		WebElement element = driver.findElement(fieldID);
		return element;
	}

	public boolean IsCheckBoxSelected(By fieldId) {
		if (driver.findElement(fieldId).isSelected()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean IsDisplayed(By fieldID) {
		try {
			return driver.findElement(fieldID).isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	public boolean IsElementExists(By fieldID) {
		boolean isExists = false;
		List<WebElement> elements = driver.findElements(fieldID);
		if (elements.size() != 0) {
			for (WebElement element : elements) {
				if (element.isDisplayed()) {
					isExists = true;
				}
			}
		}
		return isExists;
	}

	public void SelectTopDropdownValue(By by) {
		Select dropDown = new Select(driver.findElement(by));
		dropDown.selectByIndex(1);
	}

	public void SetCheckBox(By fieldId) {
		if (!driver.findElement(fieldId).isSelected()) {
			driver.findElement(fieldId).click();
		}
	}

	public void SetCheckBox(WebElement webelement) {
		if (!webelement.isSelected()) {
			webelement.click();
		}
	}

	public void SetDropdownValue(By fieldId, String fieldValue) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(d -> {
            Select dropDown = new Select(d.findElement(fieldId));
            dropDown.selectByVisibleText(fieldValue);
            return true;
        });
	}

	public void SetDropdownValueAndTab(By fieldId, String fieldValue) {
		Select dropDown = new Select(driver.findElement(fieldId));
		dropDown.selectByVisibleText(fieldValue);
		driver.findElement(fieldId).sendKeys(Keys.TAB);
	}

	public void SetDropdownValueAndTab(WebElement webelement, String fieldValue) {
		Select dropDown = new Select(webelement);
		dropDown.selectByVisibleText(fieldValue);
		webelement.sendKeys(Keys.TAB);
	}

	public void SetEmptyString(By fieldId) {
		driver.findElement(fieldId).sendKeys("");
	}

	public void SetListBoxValue(By fieldId, String fieldValues) {
		String[] values = fieldValues.split(";");
		for (String valueToBeSelected : values) {
			new Select(driver.findElement(fieldId)).selectByVisibleText(valueToBeSelected);
			driver.findElement(fieldId).sendKeys(Keys.CONTROL);
		}
	}

	public void SetRadioGroup(By fieldId) {
		driver.findElement(fieldId).click();
	}

	public void SetTextBox(By fieldId, String fieldValue) {
		WebElement element = driver.findElement(fieldId);
		SetTextBox(element, fieldValue);
	}

	public void SetTextBoxAndTab(By by, String fieldValue) {
		WebElement element = driver.findElement(by);
		SetTextBox(element, fieldValue);
		element.sendKeys(Keys.TAB);
	}
	
	public void SetTextBoxAndTab(WebElement element, String fieldValue) {
		SetTextBox(element, fieldValue);
		element.sendKeys(Keys.TAB);
	}
	
	public void SetTextBoxAndTab(By fieldId, String fieldValue, boolean clearField) {
		if(clearField)
			ClearFieldValue(fieldId);
		WebElement element = driver.findElement(fieldId);
		SetTextBox(element, fieldValue);
		element.sendKeys(Keys.TAB);
	}
	
	public void switchToNewTab() {
		driver.close();
		List<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
	}

	private void SetTextBox(WebElement element, String value) {
		if (element.isEnabled()) {
			if (GetValueAttribute(element).equals(value)) {
				return;
			}
			element.clear();
		}
		
		element.sendKeys(value);
	}
	
	public void SetTextBox(By fieldId, Keys keys) {
		driver.findElement(fieldId).sendKeys(keys);
	}

	private Wait<WebDriver> getWait(int seconds) {
		return new FluentWait<WebDriver>(driver)
				.withTimeout(seconds, TimeUnit.SECONDS)
				.pollingEvery(50, TimeUnit.MILLISECONDS)
				.ignoring(NoSuchElementException.class);
	}

	public void ClickLink(By by) {
		Wait<WebDriver> wait = getWait(1);
		WebElement link = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		link.click();
	}

	public WebElement tryFindElement(By by) {
		List<WebElement> elements = driver.findElements(by);
		if (elements.isEmpty()){
			return null;
		}
		return elements.get(0);
	}
	
	public void Refresh() {
		driver.navigate().refresh();
	}
	
	public List<WebElement> GetAllOptions(By fieldID)
	{
		Select dropDown = new Select(driver.findElement(fieldID));
		List<WebElement> allOptions = dropDown.getOptions();
		return allOptions;
	}
	
	public void PickMonthYear(String mmyy, By fieldID)
	{
		PickMonthYear(mmyy, driver.findElement(fieldID));
	}
	
	public void PickMonthYear(String mmyy, WebElement webElement)
	{
		//Select expiration date using picker.
		int month = Integer.parseInt(mmyy.substring(0, mmyy.indexOf("/")));
		String year = "20"+mmyy.substring(mmyy.indexOf("/")+1, mmyy.length());
		String monthName = new DateFormatSymbols().getMonths()[month-1].substring(0, 3);
		ClickButton(webElement);
		if(GetText(By.cssSelector("div.datepicker-months th.datepicker-switch")).equals(year))
		{
			ClickButton(By.xpath("//span[contains(text(),'"+monthName+"')]"));
		}
		else
		{
			ClickButton(By.cssSelector("div.datepicker-months th.datepicker-switch"));
			String yearRange = GetText(By.cssSelector("div.datepicker-years th.datepicker-switch"));
			int yearRangeStart = Integer.parseInt(yearRange.substring(0, yearRange.indexOf("-")));
			int yearRangeEnd = Integer.parseInt(yearRange.substring(yearRange.indexOf("-")+1, yearRange.length()));
			int yearNumber = Integer.parseInt(year); 
			while (!(yearNumber >= yearRangeStart && yearNumber <= yearRangeEnd))
			{
				ClickButton(By.cssSelector("div.datepicker-years th.next"));
				yearRange = GetText(By.cssSelector("div.datepicker-years th.datepicker-switch"));
				yearRangeStart = Integer.parseInt(yearRange.substring(0, yearRange.indexOf("-")));
				yearRangeEnd = Integer.parseInt(yearRange.substring(yearRange.indexOf("-")+1, yearRange.length()));
				yearNumber = Integer.parseInt(year); 
			}
			ClickButton(By.xpath("//*[@class='table-condensed']//span[contains(text(),'"+year+"')]"));
			ClickButton(By.xpath("//*[@class='table-condensed']//span[contains(text(),'"+monthName+"')]"));
		}
	}

	public void waitUntilClickable(By... fieldIds) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		for (By fieldId : fieldIds) {
			wait.until(ExpectedConditions.elementToBeClickable(fieldId));
		}
	}

	public void waitUntilVisible(By... fieldIds){
		WebDriverWait wait = new WebDriverWait(driver, 60);
		for (By fieldId : fieldIds) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(fieldId));
		}
	}

	public void waitUntilInvisible(By... fieldIds){
		WebDriverWait wait = new WebDriverWait(driver, 60);
		for (By fieldId : fieldIds) {
			wait.until(ExpectedConditions.invisibilityOfElementLocated(fieldId));
		}
	}

}
