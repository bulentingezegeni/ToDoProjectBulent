@P0_MostCriticalTestCases
Feature: PO_most_critical_test_cases

  @CreateTask
  Scenario Outline: TC01_user_should_be_able_to_create_a_task
    Given user is on the application page
    And user clicks on Add Task text box
    And user enters a "<task>"
    Then user verifies create button is enabled
    And user clicks on create button
    And user clicks on To Do button
    Then user verifies "<task>" is displayed
    Examples: test data
    |task                   |
    |Go to the doctor       |
    |Meet with school alumni|
    |Pay electricity bill   |
    |Have lunch with Sam    |

  @CreateAndManageTask
  Scenario Outline: TC02_user_should_be_able_to_manage_a_task
    Given user is on the application page
    And user enters a "<task>"
    And user clicks on create button
    And user clicks on To Do button
    And user clicks on checkbox of "<task>"
    And user clicks on Done button
    Then user verifies "<task>" is displayed
    Examples:
      |task                   |
      |Go to the doctor       |
      |Meet with school alumni|
      |Pay electricity bill   |
      |Have lunch with Sam    |

  @DeleteAllTask
  Scenario Outline: TC03_user_should_be_able_to_delete_all_tasks_which_are_done
    Given user is on the application page
    And user enters a "<task>"
    And user clicks on create button
    And user enters a "<new_task>"
    And user clicks on create button
    And user clicks on To Do button
    And user clicks on checkbox of "<task>"
    And user clicks on checkbox of "<new_task>"
    And user clicks on Done button
    And user clicks on Delete button
    And user clicks on Delete All Tasks button
    And user clicks confirm button
    Then user verifies All tasks are deleted
    Examples:
      |task                   |new_task               |
      |Go to the doctor       |Pay electricity bill   |
      |Meet with school alumni|Have lunch with Sam    |


