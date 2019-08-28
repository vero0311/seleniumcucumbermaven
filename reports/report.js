$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/wikipedia_search.feature");
formatter.feature({
  "name": "Search in Wikipedia",
  "description": "  As a Wikipedia user\n  I want to search a word\n  To learn something new",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search a single word",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "That I am in Wikipedia home page",
  "keyword": "Given "
});
formatter.match({
  "location": "WikipediaSearchStepDefinition.java:33"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search \"Carne\"",
  "keyword": "When "
});
formatter.match({
  "location": "WikipediaSearchStepDefinition.java:37"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I hope to see the title \"Carne\"",
  "keyword": "Then "
});
formatter.match({
  "location": "WikipediaSearchStepDefinition.java:41"
});
formatter.result({
  "status": "passed"
});
});