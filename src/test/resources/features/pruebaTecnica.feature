#Janisley Suarez
@stories
Feature: UTest Automatization

  @scenario1
  Scenario Outline: registration un user in the page of utest
    Given Maria wants to learn with Utest courses

    When registration ends
      | strFName  |  strLName  | strEmail  | strMonthBri | strDayBri | strYearBri | strCity | strZip | strCounty | strComputer | strVersion | strLanguage | strMobile | strModel |StrOS|strPassword| strCPassword|
      |<strFName> | <strLName> |<strEmail>|<strMonthBri>|<strDayBri>|<strYearBri>|<strCity>|<strZip>|<strCounty>|<strComputer>|<strVersion>|<strLanguage>|<strMobile>|<strModel>|<StrOS>|<strPassword>|<strCPassword>|
    Then the user logs in
      | strUser |strPassword   |
      | <strUser> | <strPassword>|
    Examples:
      | strFName  |  strLName  | strEmail | strMonthBri | strDayBri | strYearBri | strCity | strZip | strCounty | strComputer | strVersion | strLanguage | strMobile | strModel |StrOS|strPassword| strCPassword|
      |Maria|Perez|maria@hotmail.com      |February     |3          |2000        |Itagui   |055413  |Colombia   |Windows      |XP 64-bit   |English      |Huawei     |p20 PRO   |Android 10|Password21.|Password21.|
