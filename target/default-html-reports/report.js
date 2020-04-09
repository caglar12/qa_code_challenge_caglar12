$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Register.feature");
formatter.feature({
  "name": "Register",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@register"
    }
  ]
});
formatter.scenario({
  "name": "Register a user",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@register"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user opens registration page",
  "keyword": "Given "
});
formatter.match({
  "location": "RegisterStepDefs.user_opens_registration_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is in registration page",
  "keyword": "When "
});
formatter.match({
  "location": "RegisterStepDefs.user_is_in_registration_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to see the registration form with required fields",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterStepDefs.user_should_be_able_to_see_the_registration_form_with_required_fields()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fills the form",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterStepDefs.user_fills_the_form()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Log in for a registered user",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@register"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user opens login page",
  "keyword": "Given "
});
formatter.match({
  "location": "RegisterStepDefs.user_opens_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter email and password",
  "keyword": "When "
});
formatter.match({
  "location": "RegisterStepDefs.user_enter_email_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be in dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterStepDefs.user_should_be_in_dashboard_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});