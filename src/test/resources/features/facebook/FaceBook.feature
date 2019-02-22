@FACEBOOK
Feature: FaceBook

  @TestCase1
  Scenario Outline: Test 1
    Given I load my personal info
     |<nombre>|<usuario>|<contraseña>|
    Then I try to authenticate using my credentials
    Examples:
      |nombre|usuario|contraseña|
      |Diego |3116098314|14785236|

