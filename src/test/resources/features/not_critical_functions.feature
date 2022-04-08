@P2_NotVeryCriticalTestCases
Feature: P2_not_very_critical_test_cases

  @AddTaskTextBoxExceptsAnyChar
  Scenario Outline: TC01_user_should_be_able_to_create_a_task_with_any_char
    Given user is on the application page
    And user enters a "<task>"
    And user clicks on create button
    And user clicks on To Do button
    Then user verifies "<task>" is displayed

    Examples:
      |task                             |
      |*Go! to @doctor $$ ? > 9:00,11.00|

  @DoneIsEmptyWithoutClickingATask
  Scenario Outline: TC02_without_clicking_a_task_Done_remains_empty
    Given user is on the application page
    And user enters a "<task>"
    And user clicks on create button
    And user clicks on To Do button
    Then user verifies Done has no "<task>"

    Examples:
      |task                   |
      |Go to the doctor       |
      |Meet with school alumni|

  @MakingTaskUnchecked
  Scenario Outline: TC03_user_should_be_able_to_make_a_task_unchecked
    Given user is on the application page
    And user enters a "<task>"
    And user clicks on create button
    And user clicks on To Do button
    And user clicks on checkbox of "<task>"
    And user clicks on Done button
    And user clicks on checkbox of given "<task>"
    And user clicks on To Do button
    Then user verifies "<task>" is unchecked

    Examples:
      |task                   |
      |Go to the doctor       |

  @PageIsToDoPage
  Scenario: TC04_user_should_verify_the_page_as_To_Do_List_page
    Given user is on the application page
    Then user verifies page is "To-Do List" page


