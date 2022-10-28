@FunctionalTest
Feature: Using of tags in Cucumber

@SmokeTest
Scenario: Scenario1
Given This is Scenario1

@SmokeTest
Scenario: Scenario2
Given This is Scenario2

@SmokeTest and @SanityTest
Scenario: Scenario3
Given This is Scenario3

@SanityTest
Scenario: Scenario4
Given This is Scenario4

@Regression
Scenario: Scenario5
Given This is Scenario5

@Sanity
Scenario: Scenario6
Given This is Scenario6