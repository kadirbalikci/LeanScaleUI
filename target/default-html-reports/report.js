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
  "name": "Add an item to the cart as a guest",
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
  "name": "the user makes a search the product with \"MT07\" stock number",
  "keyword": "Given "
});
formatter.match({
  "location": "LeanScaleAssignmentStepDefs.the_user_makes_a_search_the_product_with_stock_number(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User configures the attributes of the product and add to the cart",
  "keyword": "When "
});
formatter.match({
  "location": "LeanScaleAssignmentStepDefs.user_configures_the_attributes_of_the_product_and_add_to_the_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should the product in the cart section",
  "keyword": "Then "
});
formatter.match({
  "location": "LeanScaleAssignmentStepDefs.user_should_the_product_in_the_cart_section()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
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
  "name": "Add an item to the cart as a registered user",
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
  "name": "User logins with the valid credentials",
  "keyword": "Given "
});
formatter.match({
  "location": "LeanScaleAssignmentStepDefs.user_logins_with_the_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user makes a search the product with \"MT07\" stock number",
  "keyword": "And "
});
formatter.match({
  "location": "LeanScaleAssignmentStepDefs.the_user_makes_a_search_the_product_with_stock_number(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User configures the attributes of the product and add to the cart",
  "keyword": "When "
});
formatter.match({
  "location": "LeanScaleAssignmentStepDefs.user_configures_the_attributes_of_the_product_and_add_to_the_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should the product in the cart section",
  "keyword": "Then "
});
formatter.match({
  "location": "LeanScaleAssignmentStepDefs.user_should_the_product_in_the_cart_section()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Username should be displayed at the right top corner",
  "keyword": "And "
});
formatter.match({
  "location": "LeanScaleAssignmentStepDefs.username_should_be_displayed_at_the_right_top_corner()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});