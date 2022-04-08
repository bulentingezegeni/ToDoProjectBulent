@P1_ImportantTestCases
Feature: P1_important_test_cases

  @ToDoHasNewSize
  Scenario Outline: TC01_the_size_of_To_Do_should_increase_after_creating_a_new_task
    Given user is on the application page
    Then user verifies To do button has "0"
    And user enters a "<task>"
    And user clicks on create button
    Then user verifies To do button has "1"
    Examples:
      |task                   |
      |Go to the doctor       |
      |Meet with school alumni|
      |Pay electricity bill   |
      |Have lunch with Sam    |

  @AllHasCheckedAndUnchecked
  Scenario Outline: TC02_All_button_should_always_show_the_total_size
    Given user is on the application page
    And user enters a "<task>"
    And user clicks on create button
    And user enters a "<new_task>"
    And user clicks on create button
    And user clicks on To Do button
    And user clicks on checkbox of "<task>"
    And user clicks on All button
    Then user verifies All button has "2"
    Examples:
      |task                   |new_task              |
      |Go to the doctor       |Pay electricity bill   |
      |Meet with school alumni|Have lunch with Sam    |

  @DeleteASpecificTask
  Scenario Outline: TC03_user_should_be_able_to_delete_a_specific_task
    Given user is on the application page
    And user enters a "<task>"
    And user clicks on create button
    And user enters a "<new_task>"
    And user clicks on create button
    And user clicks on To Do button
    And user clicks on checkbox of "<task>"
    And user clicks on All button
    And user clicks on Delete button
    And user clicks on first delete icon
    And user clicks on red Delete button
    Then user verifies "<task>" is deleted
    Examples:
      |task                   |new_task               |
      |Go to the doctor       |Pay electricity bill   |
      |Meet with school alumni|Have lunch with Sam    |




