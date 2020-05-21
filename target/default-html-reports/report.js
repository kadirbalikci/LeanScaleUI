$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/LSAssignment.feature");
formatter.feature({
  "name": "Lean Scale Assignment",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@LeanScaleSmoke"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Lean Scale home page",
  "keyword": "Given "
});
formatter.match({
  "location": "LeanScaleAssignmentStepDefs.the_user_is_on_the_Lean_Scale_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Register with valid data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@LeanScaleSmoke"
    },
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "the user navigates to the register page",
  "keyword": "Given "
});
formatter.match({
  "location": "LeanScaleAssignmentStepDefs.the_user_navigates_to_the_register_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "System generates random name, lastname and email register data",
  "keyword": "When "
});
formatter.match({
  "location": "LeanScaleAssignmentStepDefs.system_generates_random_name_lastname_and_email_register_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should create an account with the generated email successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LeanScaleAssignmentStepDefs.user_should_create_an_account_with_the_generated_email_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});