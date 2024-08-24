Feature: Verifying Explore Hotel Page

  Scenario Outline: verify select Hotel by entering all fields in explore hotel module
    Given User is in OmrBranch hotel page
    When User enter "<username>" and "<password>"
    Then User should verify after login success message "Welcome SELLA"
    When User search by entering all the fields "<state>","<city>","<roomType>","<checkIn>","<checkOut>","<noRooms>","<noAdult>",and "<noChild>"
    Then User should verify after select hotel success message "Select Hotel"

    Examples: 
      | username            | password      | state      | city       | roomType  | checkIn    | checkOut   | noRooms | noAdult | noChild |
      | durai8827@gmail.com | NPTIneyveli@3 | Tamil Nadu | Puducherry | Strandard | 2024-03-13 | 2024-03-14 | 1-One   | 1-One   |       2 |

  Scenario Outline: verifying Explore Hotel module with mandatory fields
    Given User is in OmrBranch hotel page
    When User enter "<username>" and "<password>"
    Then User should verify after login success message "Welcome SELLA"
    When User search by entering fields "<state>","<city>","<checkIn>","<checkOut>","<noRooms>",and "<noAdult>"
    Then User should verify after select hotel success message "Select Hotel"

    Examples: 
      | username            | password      | state      | city       | checkIn    | checkOut   | noRooms | noAdult |
      | durai8827@gmail.com | NPTIneyveli@3 | Tamil Nadu | Puducherry | 2024-03-23 | 2024-03-24 | 1-One   | 1-One   |

  @search
  Scenario Outline: verifying Explore Hotel module by entering all room type
    Given User is in OmrBranch hotel page
    When User enter "<username>" and "<password>"
    Then User should verify after login success message "Welcome SELLA"
    When User search by entering all the fields roomtype "<state>","<city>","<roomType>","<checkIn>","<checkOut>","<noRooms>","<noAdult>",and "<noChild>"
    Then User should verify after selecting all roomtype success message "<roomType>"

    Examples: 
      | username            | password      | state      | city       | roomType                            | checkIn    | checkOut   | noRooms | noAdult | noChild |
      | durai8827@gmail.com | NPTIneyveli@3 | Tamil Nadu | Puducherry | Standard/Deluxe/Suite/Luxury/Studio | 2024-03-23 | 2024-03-24 | 1-One   | 1-One   |       2 |

  Scenario Outline: verifying Explore Hotel module without entering fields
    Given User is in OmrBranch hotel page
    When User enter "<username>" and "<password>"
    Then User should verify after login success message "Welcome SELLA"
    When User without entering any fields
    Then User should verify without fields success message "Explore Hotels"
    And User should verify error message "Please select state","Please select city","Please select Check-in date","Please select Check-out date","Please select no. of rooms" and "Please select no. of adults"

    Examples: 
      | username            | password      |
      | durai8827@gmail.com | NPTIneyveli@3 |
