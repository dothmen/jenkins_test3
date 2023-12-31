@tag
Feature: displaying evaluations from a past session

  Background: 
    Given the administrator click on connexion icon
    And entersmouna.makni@talan.comandAdmin09$
    And clicks on identify button

  @Display
  Scenario Outline: verify that evaluations from a past session are displayed successfully
    When clicks on the details icon
    And clicks on Evalution icon
    Then check that evalutions are displayed

    Examples: 
      | email                 | password |
      | mouna.makni@talan.com | Admin09$ |
