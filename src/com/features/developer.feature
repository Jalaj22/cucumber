Feature: About Developers

In order to get a high paid job
As a developer
I want to learn AdvanceJava

Scenario Outline: I am CoreJava developer
Given I am a "<testerType>" developer
When I started development 
Then I created a "<jobType>" java program
And I am "<satisfactionType>" experienced
But My Boss is "<parentsSetisfaction>" satisfied

Examples:
 |  testerType  |  jobType  |  satisfactionType  |  parentsSetisfaction  |
 |  Manual      |  High     |  Average           |  High                 |
 |  Automation  |  High     |  High              |  High                 |