import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

class UserSteps {

	private String name;
	private String email;
	private String gender;
	private String status;

	@Given("user name is (.*)")
	def userNameIs(String name) {
		this.name = name;
	}

	@Given("user email is (.*)")
	def userEmailIs(String email) {
		this.email = email;
	}

	@Given("user gender is (.*)")
	def userGenderIs(String gender) {
		this.gender = gender;
	}

	@Given("user status is (.*)")
	def userStatusIs(String status) {
		this.status = status;
	}

	@Then("perform user successful creation test case")
	def performUserSuccessfulCreationTestCase() {
		WS.callTestCase(findTestCase("Successful user creation"), ['name': this.name, 'email': this.email, 'gender': this.gender, 'status': this.status])
	}

	@Then("perform user unsuccessful creation test case")
	def performUserUnSuccessCreationTestCase() {
		WS.callTestCase(findTestCase("Unsuccessful user creation"), ['name': this.name, 'email': this.email, 'gender': this.gender, 'status': this.status])
	}
}