$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/TagDemo.feature");
formatter.feature({
  "name": "Using of tags in Cucumber",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@FunctionalTest"
    }
  ]
});
formatter.scenario({
  "name": "Scenario1",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FunctionalTest"
    },
    {
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "name": "This is Scenario1",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepDefination.TagsDemo.this_is_Scenario1()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Scenario3",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FunctionalTest"
    },
    {
      "name": "@SmokeTest"
    },
    {
      "name": "and"
    },
    {
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "name": "This is Scenario3",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepDefination.TagsDemo.this_is_Scenario3()"
});
formatter.result({
  "status": "passed"
});
});