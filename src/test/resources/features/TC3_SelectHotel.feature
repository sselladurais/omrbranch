Feature: verifying Select Hotel Page

  Scenario Outline: verify if filter listed,same filter are checked in and hotel names end with same selected
    Given User is in OmrBranch hotel page
    When User enter "<username>" and "<password>"
    Then User should verify after login success message "Welcome SELLA"
    When User search by entering all the fields "<state>","<city>","<roomType>","<checkIn>","<checkOut>","<noRooms>","<noAdult>",and "<noChild>"
    Then User should verify after select hotel success message "Select Hotel"
    And User should verify hotel names after selected roomType if hotel names ended with selected "<roomType>" successfully

    Examples: 
      | username            | password      | state      | city       | roomType | checkIn    | checkOut   | noRooms | noAdult | noChild |
      | durai8827@gmail.com | NPTIneyveli@3 | Tamil Nadu | Puducherry | Standard | 2024-03-13 | 2024-03-14 | 1-One   | 1-One   |       2 |

@select
  Scenario Outline: verify if hotel names are sorted in ascending order in explore hotel page
    Given User is in OmrBranch hotel page
    When User enter "<username>" and "<password>"
    Then User should verify after login success message "Welcome SELLA"
    When User search by entering all the fields roomtype "<state>","<city>","<roomType>","<checkIn>","<checkOut>","<noRooms>","<noAdult>",and "<noChild>"
    Then User should verify after select hotel success message "Select Hotel"
    When User click the name ascending button
    Then User should verify hotel names after click the name ascending button if it has sorted in ascending order successfully

    Examples: 
      | username            | password      | state      | city       | roomType                           | checkIn    | checkOut   | noRooms | noAdult | noChild |
      | durai8827@gmail.com | NPTIneyveli@3 | Tamil Nadu | Puducherry | Standard/Deluxe/Suite/Luxury/Studio | 2024-03-23 | 2024-03-24 | 1-One   | 1-One   |       2 |

  
  Scenario Outline: verify if hotel price is sorted in descending order in explore hotel page
    Given User is in OmrBranch hotel page
    When User enter "<username>" and "<password>"
    Then User should verify after login success message "Welcome SELLA"
    When User search by entering all the fields roomtype "<state>","<city>","<roomType>","<checkIn>","<checkOut>","<noRooms>","<noAdult>",and "<noChild>"
    Then User should verify after select hotel success message "Select Hotel"
    When User click the price high-low option button
    Then User should verify hotel price after click the price high-low option button if it is sorted in descending order successfully

    Examples: 
      | username            | password      | state      | city       | roomType                            | checkIn    | checkOut   | noRooms | noAdult | noChild |
      | durai8827@gmail.com | NPTIneyveli@3 | Tamil Nadu | Puducherry | Standard/Deluxe/Suite/Luxury/Studio | 2024-03-23 | 2024-03-24 | 1-One   | 1-One   |       2 |

  Scenario Outline: verifying Select Hotel module by accpeting alert
    Given User is in OmrBranch hotel page
    When User enter "<username>" and "<password>"
    Then User should verify after login success message "Welcome SELLA"
    When User search by entering all the fields "<state>","<city>","<roomType>","<checkIn>","<checkOut>","<noRooms>","<noAdult>",and "<noChild>"
    Then User should verify after select hotel success message "Select Hotel"
    When User select the first hotel name and save the hotel name and hotel price
    And User accpet the alert to select hotel
    Then User should verify "Book Hotel" success message after navigate to Book hotel

    Examples: 
      | username            | password      | state      | city       | roomType                            | checkIn    | checkOut   | noRooms | noAdult | noChild |
      | durai8827@gmail.com | NPTIneyveli@3 | Tamil Nadu | Puducherry | Standard/Deluxe/Suite/Luxury/Studio | 2024-03-23 | 2024-03-24 | 1-One   | 1-One   |       2 |

  Scenario Outline: verifying Select Hotel module by giving cancel to alert
    Given User is in OmrBranch hotel page
    When User enter "<username>" and "<password>"
    Then User should verify after login success message "Welcome SELLA"
    When User search by entering all the fields "<state>","<city>","<roomType>","<checkIn>","<checkOut>","<noRooms>","<noAdult>",and "<noChild>"
    Then User should verify after select hotel success message "Select Hotel"
    When User select the first hotel name and save the hotel name and hotel price
    And User cancel the alert to select hotel
    Then User should verify after select hotel success message "Select Hotel"

    Examples: 
      | username            | password      | state      | city       | roomType                            | checkIn    | checkOut   | noRooms | noAdult | noChild |
      | durai8827@gmail.com | NPTIneyveli@3 | Tamil Nadu | Puducherry | Standard/Deluxe/Suite/Luxury/Studio | 2024-03-23 | 2024-03-24 | 1-One   | 1-One   |       2 |
