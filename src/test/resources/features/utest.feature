# Autor: Joan Alexis Gutiérrez
  @stories
  Feature: Utest
    A user wishes to register on the Utest page
  @Scenario1:
  Scenario Outline: Look for the Join Today button
  Given The user clicks and to start the registration
    | strName   | strLastName   | strEmail   | month   | day   | year   | city   | postalCode   | country |
    | <strName> | <strLastName> | <strEmail> | <month> | <day> | <year> | <city> | <postalCode> |  <country>|
    When Start filling in the data
      | yourComputer   | computerVersion   | languaje   | yourMobile   | modelMobile   | operatingSystem   |
      | <yourComputer> | <computerVersion> | <languaje> | <yourMobile> | <modelMobile> | <operatingSystem> |
    Then The user finishes filling in the data and sends the form
      | password   | confirmPassowrd   |
      | <password> | <confirmPassowrd> |
    Examples:
      | strName | strLastName | strEmail                 | month | day | year | city   | postalCode | country  | yourComputer | computerVersion | languaje | yourMobile | modelMobile | operatingSystem | password    | confirmPassowrd |
      | Joan    | Gutierrez   | joan.alexis.10@gmail.com | June  | 12  | 1997 | Cúcuta | 57001      | Colombia | Windows      | 10              | Spanish  | Alcatel    | MD01        | Android 2.0     | Alexis0612* | Alexis0612*     |

