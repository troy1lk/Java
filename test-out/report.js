$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/AT.feature");
formatter.feature({
  "line": 1,
  "name": "ATra",
  "description": "Dropdown options",
  "id": "atra",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2988334400,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I navigate to AutoTrader",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter postcode",
  "keyword": "And "
});
formatter.match({
  "location": "ATSteps.iNavigateToAutoTrader()"
});
formatter.result({
  "duration": 9014636800,
  "status": "passed"
});
formatter.match({
  "location": "ATSteps.iEnterPostcode()"
});
formatter.result({
  "duration": 3151148400,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "MIN",
  "description": "",
  "id": "atra;min",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@ATT"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I select the dropdown options min",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I select search min",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I see the results min",
  "keyword": "Then "
});
formatter.match({
  "location": "ATSteps.iSelectTheDropdownOptionsMin()"
});
formatter.result({
  "duration": 29392727900,
  "status": "passed"
});
formatter.match({
  "location": "ATSteps.iSelectSearchMin()"
});
formatter.result({
  "duration": 21000,
  "status": "passed"
});
formatter.match({
  "location": "ATSteps.iSeeTheResultsMin()"
});
formatter.result({
  "duration": 19600,
  "status": "passed"
});
formatter.after({
  "duration": 4143716500,
  "status": "passed"
});
});