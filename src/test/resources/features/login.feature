Feature: login functionality

#  Background:
#    Given user on the login page

  Scenario: login as a student
    When user enters "www.na.edu"
    Then homepage should be displayed
    Then user click to "365 Portal"
    Then page redirected to the sign in page "office 365"
