@tag
Feature: add a module
 

  Background: 
    Given the administrator click on connexion icon
    And entersmouna.makni@talan.comandAdmin09$
    And clicks on identify button

  @Add
  Scenario Outline: add module successfully
    When the administrator click on cursus Icon 
    And click on edit content
    And click on ajouter button
    And complete the form<Titre>and<Référence>and<Description>and<instruction Module>and<Type>and<Durée>
    And click add button
    Then check that the addition is made
    Examples: 
      |Titre     |Référence|Description |instruction Module|Type |Durée      |
      |Java      |java     |java avancé |3                 |code |une semaine|    
      
   