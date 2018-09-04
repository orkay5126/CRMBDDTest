$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Ramesh_1/src/Pracitce/src/main/java/Feature/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login to CRM site",
  "description": "",
  "id": "login-to-crm-site",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login to CRM site",
  "description": "",
  "id": "login-to-crm-site;login-to-crm-site",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User already on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters the username and password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user successfully logged into the CRM site",
  "keyword": "Then "
});
formatter.match({
  "location": "login_stepdefinitions.User_already_on_the_login_page()"
});
formatter.result({
  "duration": 16928793406,
  "status": "passed"
});
formatter.match({
  "location": "login_stepdefinitions.User_enters_the_username_and_password()"
});
formatter.result({
  "duration": 7875636008,
  "status": "passed"
});
formatter.match({
  "location": "login_stepdefinitions.user_successfully_logged_into_the_CRM_site()"
});
formatter.result({
  "duration": 15730133,
  "error_message": "org.junit.ComparisonFailure: expected:\u003cCRMPRO[1]\u003e but was:\u003cCRMPRO[]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat stepDefinitions.login_stepdefinitions.user_successfully_logged_into_the_CRM_site(login_stepdefinitions.java:46)\r\n\tat ✽.Then user successfully logged into the CRM site(C:/Ramesh_1/src/Pracitce/src/main/java/Feature/login.feature:6)\r\n",
  "status": "failed"
});
});