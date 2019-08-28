Feature: Search in Wikipedia
  As a Wikipedia user
  I want to search a word
  To learn something new

  Scenario: Search a single word
    Given That I am in Wikipedia home page
    When I search "Carne"
    Then I hope to see the title "Carne"
