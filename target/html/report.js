$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("java/FeatruresFiles/Homepage.feature");
formatter.feature({
  "line": 1,
  "name": "HomePage Verification",
  "description": "Verify if user is able to access the URL",
  "id": "homepage-verification",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Samsung landing Screen",
  "description": "",
  "id": "homepage-verification;samsung-landing-screen",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user open SIOT Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "verify current URL",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user navigates to landing Screen and verify screen with below scenerios",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Verify food pillar",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Verify fun pillar",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "verify family pillar",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "verify the Title of the page",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageTest.user_open_SIOT_Application()"
});
formatter.result({
  "duration": 8889498378,
  "status": "passed"
});
formatter.match({
  "location": "HomePageTest.verify_current_URL()"
});
formatter.result({
  "duration": 12381893,
  "status": "passed"
});
formatter.match({
  "location": "HomePageTest.usernavigatestolandingScreen()"
});
formatter.result({
  "duration": 44297245759,
  "status": "passed"
});
formatter.match({
  "location": "HomePageTest.verifyfoodpillar()"
});
formatter.result({
  "duration": 37060382,
  "status": "passed"
});
formatter.match({
  "location": "HomePageTest.verifyfunpillar()"
});
formatter.result({
  "duration": 36350773,
  "status": "passed"
});
formatter.match({
  "location": "HomePageTest.verify_family_pillar()"
});
formatter.result({
  "duration": 40130993,
  "status": "passed"
});
formatter.match({
  "location": "HomePageTest.verify_the_Title_of_the_page()"
});
formatter.result({
  "duration": 9875784,
  "status": "passed"
});
});