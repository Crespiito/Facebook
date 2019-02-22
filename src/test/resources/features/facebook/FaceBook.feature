@FACEBOOK

Feature: FaceBook

  @TestCase1
  Scenario Outline: make a publication in a friend wall
    Given I joined Facebook with my peronsal information
      |<nombre>|<usuario>|<contra>|
    When I make a publication in a friend wall
      |<amigo>|<publicacion>|
    Then i will see the publication
    Examples:
      |nombre|usuario|contra|publicacion|amigo|
      |Diego |valencia_95_@utp.edu.co|Diego123456|Mensaje a Publicar|Diego Valencia|

  @TestCase2
  Scenario Outline: Make a publication on my wall
    Given I joined Facebook with my peronsal information
  |<nombre>|<usuario>|<contra>|
    When I make a publication on my wall
  |<publicacion>|
    Then i will see the publication on my wall
    Examples:
  |nombre|usuario|contra|publicacion|
  |Diego |valencia_95_@utp.edu.co|Diego123456|Mensaje a Publicar|

  @TestCase3
  Scenario Outline: Edit my profile picture
    Given I joined Facebook with my peronsal information
  |<nombre>|<usuario>|<contra>|
    When edit my profile picture
  |<picture>|
    Then i will see the new profile picture
    Examples:
  |nombre|usuario|contra|picture|
  |Diego |valencia_95_@utp.edu.co|Diego123456|picture path|

  @TestCase4
  Scenario Outline: Make a new group
    Given I joined Facebook with my peronsal information
  |<nombre>|<usuario>|<contra>|
    When I make a new group
  |<Gpinfo>|
    Then i will see my new group in muy group list
    Examples:
  |nombre|usuario|contra|Gpinfo|
  |Diego |valencia_95_@utp.edu.co|Diego123456|Gpinfor|

  @TestCase5
  Scenario Outline:  Search for a friend on facebook to start a conversation
    Given I joined Facebook with my peronsal information
  |<nombre>|<usuario>|<contra>|
    When I search for a friend on facebook to start a conversation
  |<firend>|<message>|
    Then i will send a message
    Examples:
  |nombre|usuario|contra|firend|message|
  |Diego |valencia_95_@utp.edu.co|Diego123456|friend          |Mensaje a enviar|

  @TestCase6
  Scenario Outline: Sent a friend request
    Given I joined Facebook with my peronsal information
      | <nombre> | <usuario> | <contra> |
    When I sent a friend request
      | <friend> |
    Then i will see request send menssage
    Examples:
      | nombre | usuario    | contra | friend      |
      | Diego  |valencia_95_@utp.edu.co|Diego123456| friend name |

  @TestCase7
  Scenario Outline: Make a new event in facebook
    Given I joined Facebook with my peronsal information
  |<nombre>|<usuario>|<contra>|
    When I make a new event in facebook
  |<publicacion>|
    Then i will see the new event in my calendar
    Examples:
  |nombre|usuario|contra|publicacion|
  |Diego |valencia_95_@utp.edu.co|Diego123456|Mensaje a Publicar|

  @TestCase8
  Scenario Outline: Share a publication
    Given I joined Facebook with my peronsal information
  |<nombre>|<usuario>|<contra>|
    When I share a publication
  |<publicacion>|
    Then I will see the publication in my wall
    Examples:
  |nombre|usuario|contra|publicacion|
  |Diego |valencia_95_@utp.edu.co|Diego123456|Mensaje a Publicar|

  @TestCase9
  Scenario Outline: Make like in a publication
    Given I joined Facebook with my peronsal information
  |<nombre>|<usuario>|<contra>|
    When I make like in a publication
  |<publicacion>|
    Then I will see the like menssage
    Examples:
  |nombre|usuario|contra|publicacion|
  |Diego |valencia_95_@utp.edu.co|Diego123456|Mensaje de la Publicacion|

  @TestCase10
  Scenario Outline: Search a friend in Facebook
    Given I joined Facebook with my peronsal information
      |<nombre>|<usuario>|<contra>|
    When I Search a friend in Facebook
      |<publicacion>|
    Then i will see an option in the results found
    Examples:
      |nombre|usuario|contra|publicacion|
      |Diego |valencia_95_@utp.edu.co|Diego123456|Mensaje a Publicar|
