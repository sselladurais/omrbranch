Feature: verifying Boking Hotel Page

  @book
  Scenario Outline: verifying Book Hotel module by entering debit card with Special Request
    Given User is in OmrBranch hotel page
    When User enter "<username>" and "<password>"
    Then User should verify after login success message "Welcome SELLA"
    When User search by entering all the fields roomtype "<state>","<city>","<roomType>","<checkIn>","<checkOut>","<noRooms>","<noAdult>", and "<noChild>"
    Then User should verify after select hotel success message "Select Hotel"
    When User select the first hotel name and save the hotel name and hotel price
    And User accpet the alert to select hotel
    Then User should verify after select hotel success message "Select Hotel"
    When User select the first hotel name and save the hotel name and hotel price
    And User accpet the alert to select hotel
    Then User should verify "Book Hotel" success message after navigate to Book hotel
    When User add the guest details "<salutation>","<firstName>","<lastName>","<mobile>", and "<email>"
    And User add GST details "<regNo>","<companyName>", and "<comapnyAddress>"
    And User add special request "<otherReq>"
    And User add the payment details "<cardType>"
      | card        | cardNumber       | Name on Card | month | year | cvv |
      | visa        | 5555555555552222 | Greens       | May   | 2024 | 123 |
      | Master card | 5666323243232398 | Greens       | May   | 2024 | 123 |
      | Amex        | 5666323243232316 | Greens       | May   | 2024 | 123 |
      | Discover    | 5666323243232332 | Greens       | May   | 2024 | 123 |
    Then User should verify after booking hotel success message "Booking is Confirmed" and save the orderID
    And User should verify after booking selected hotel name is present successfully

    Examples: 
      | username            | password      | state      | city       | roomType                            | checkIn    | checkOut   | noRooms | noAdult | noChild | salutation | firstName | lastName | moible     | email               | regNo      | companyName            | comapnyAddress | otherReq                                                                 | cardType  |
      | durai8827@gmail.com | NPTIneyveli@3 | Tamil Nadu | Puducherry | Standard/Deluxe/Suite/Luxury/Studio | 2024-03-23 | 2024-03-24 | 1-One   | 1-One   |       2 | Mr.        | SELLA     | DURAI    | 8754855932 | durai8827@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam   | Smoking Room/Late Check-in/Early Check-in/Room on a high floor/Large bed | DebitCard |

  Scenario Outline: verifying Book Hotel module by entering credit card with special request
    Given User is in OmrBranch hotel page
    When User enter "<username>" and "<password>"
    Then User should verify after login success message "Welcome SELLA"
    When User search by entering all the fields"<state>","<city>","<roomType>","<checkIn>","<checkOut>","<noRooms>","<noAdult>"and"<noChild>"
    Then User should verify after select hotel success message "Select Hotel"
    When User select the first hotel name and save the hotel name and hotel price
    And User accpet the alert to select hotel
    Then User should verify after select hotel success message"Select Hotel"
    When User select thwe first hotel name and save the hotel name and hotel price
    And User accept the alert to select hotel
    Then User should verify "Book Hotel" success message after navigate to Book hotel
    When User add the guest details "<salutation>","<firstName>","<lastName>","<mobile>"and"<email>"
    And User add GST details "<regNo>","<companyName>"and"<comapnyAddress>"
    And User add special request "<otherReq>"
    And User add the payment details "<cardType>"
      | card        | cardNumber       | Name on Card | month | year | cvv |
      | visa        | 5555555555552223 | Greens       | May   | 2024 | 123 |
      | Master card | 5666323243232398 | Greens       | May   | 2024 | 123 |
      | Amex        | 5666323243232316 | Greens       | May   | 2024 | 123 |
      | Discover    | 5666323243232332 | Greens       | May   | 2024 | 123 |
    Then User should verify after booking hotel success message"Booking is Confirmed" and save the orderID
    And User should verify after booking selected hotel name is present successfully

    Examples: 
      | username            | password      | state     | city       | roomType                            | checkIn    | checkOut   | noRooms | noAdult | noChild | salutation | firstName | lastName | moible     | email               | regNo      | companyName            | comapnyAddress | otherReq                                                                 | cardType   |
      | durai8827@gmail.com | NPTIneyveli@3 | TamilNadu | Puducherry | Standard/Duluxe/Suite/Luxury/Studio | 2024-03-01 | 2024-03-03 | 1-One   | 1-One   |       2 | Mr.        | SELLA     | DURAI    | 8754855932 | durai8827@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam   | Smoking Room/Late Check-in/Early Check-in/Room on a high floor/Large bed | creditCard |

  Scenario Outline: verifying Book Hotel module by entering debit card without Special Request
    Given User is in OmrBranch hotel page
    When User enter "<username>" and "<password>"
    Then User should verify after login success message "Welcome SELLA"
    When User search by entering all the fields"<state>","<city>","<roomType>","<checkIn>","<checkOut>","<noRooms>","<noAdult>"and"<noChild>"
    Then User should verify after select hotel success message "Select Hotel"
    When User select the first hotel name and save the hotel name and hotel price
    And User accpet the alert to select hotel
    Then User should verify after select hotel success message"Select Hotel"
    When User select thwe first hotel name and save the hotel name and hotel price
    And User accept the alert to select hotel
    Then User should verify "Book Hotel" success message after navigate to Book hotel
    When User add the guest details "<salutation>","<firstName>","<lastName>","<mobile>"and"<email>"
    And User add GST details "<regNo>","<companyName>"and"<comapnyAddress>"
    And User click next without entering special request
    And User add special request "<otherReq>"
    And User add the payment details "<cardType>"
      | card        | cardNumber       | Name on Card | month | year | cvv |
      | visa        | 5555555555552222 | Greens       | May   | 2024 | 123 |
      | Master card | 5666323243232398 | Greens       | May   | 2024 | 123 |
      | Amex        | 5666323243232316 | Greens       | May   | 2024 | 123 |
      | Discover    | 5666323243232332 | Greens       | May   | 2024 | 123 |
    Then User should verify after booking hotel success message"Booking is Confirmed" and save the orderID
    And User should verify after booking selected hotel name is present successfully

    Examples: 
      | username            | password      | state     | city       | roomType                            | checkIn    | checkOut   | noRooms | noAdult | noChild | salutation | firstName | lastName | moible     | email               | regNo      | companyName            | comapnyAddress | otherReq                                                                 | cardType  |
      | durai8827@gmail.com | NPTIneyveli@3 | TamilNadu | Puducherry | Standard/Duluxe/Suite/Luxury/Studio | 2024-03-01 | 2024-03-03 | 1-One   | 1-One   |       2 | Mr.        | SELLA     | DURAI    | 8754855932 | durai8827@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam   | Smoking Room/Late Check-in/Early Check-in/Room on a high floor/Large bed | DebitCard |

  Scenario Outline: verifying Book Hotel module by entering credit card without special request
    Given User is in OmrBranch hotel page
    When User enter "<username>" and "<password>"
    Then User should verify after login success message "Welcome SELLA"
    When User search by entering all the fields"<state>","<city>","<roomType>","<checkIn>","<checkOut>","<noRooms>","<noAdult>"and"<noChild>"
    Then User should verify after select hotel success message "Select Hotel"
    When User select the first hotel name and save the hotel name and hotel price
    And User accpet the alert to select hotel
    Then User should verify after select hotel success message"Select Hotel"
    When User select thwe first hotel name and save the hotel name and hotel price
    And User accept the alert to select hotel
    Then User should verify "Book Hotel" success message after navigate to Book hotel
    When User add the guest details "<salutation>","<firstName>","<lastName>","<mobile>"and"<email>"
    And User add GST details "<regNo>","<companyName>"and"<comapnyAddress>"
    And User click next without entering special request
    And User add special request "<otherReq>"
    And User add the payment details "<cardType>"
      | card        | cardNumber       | Name on Card | month | year | cvv |
      | visa        | 5555555555552223 | Greens       | May   | 2024 | 123 |
      | Master card | 5666323243232398 | Greens       | May   | 2024 | 123 |
      | Amex        | 5666323243232316 | Greens       | May   | 2024 | 123 |
      | Discover    | 5666323243232332 | Greens       | May   | 2024 | 123 |
    Then User should verify after booking hotel success message"Booking is Confirmed" and save the orderID
    And User should verify after booking selected hotel name is present successfully

    Examples: 
      | username            | password      | state     | city       | roomType                            | checkIn    | checkOut   | noRooms | noAdult | noChild | salutation | firstName | lastName | moible     | email               | regNo      | companyName            | comapnyAddress | otherReq                                                                 | cardType   |
      | durai8827@gmail.com | NPTIneyveli@3 | TamilNadu | Puducherry | Standard/Duluxe/Suite/Luxury/Studio | 2024-03-01 | 2024-03-03 | 1-One   | 1-One   |       2 | Mr.        | SELLA     | DURAI    | 8754855932 | durai8827@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam   | Smoking Room/Late Check-in/Early Check-in/Room on a high floor/Large bed | creditCard |

  Scenario Outline: verifying Book Hotel module by entering debit card and Special Request without GST
    Given User is in OmrBranch hotel page
    When User enter "<username>" and "<password>"
    Then User should verify after login success message "Welcome SELLA"
    When User search by entering all the fields"<state>","<city>","<roomType>","<checkIn>","<checkOut>","<noRooms>","<noAdult>"and"<noChild>"
    Then User should verify after select hotel success message "Select Hotel"
    When User select the first hotel name and save the hotel name and hotel price
    And User accpet the alert to select hotel
    Then User should verify after select hotel success message"Select Hotel"
    When User select thwe first hotel name and save the hotel name and hotel price
    And User accept the alert to select hotel
    Then User should verify "Book Hotel" success message after navigate to Book hotel
    When User add the guest details "<salutation>","<firstName>","<lastName>","<mobile>"and"<email>"
    And User add GST details "<regNo>","<companyName>"and"<comapnyAddress>"
    And User click next without entering special GST details
    And User add special request "<otherReq>"
    And User add the payment details "<cardType>"
      | card        | cardNumber       | Name on Card | month | year | cvv |
      | visa        | 5555555555552222 | Greens       | May   | 2024 | 123 |
      | Master card | 5666323243232398 | Greens       | May   | 2024 | 123 |
      | Amex        | 5666323243232316 | Greens       | May   | 2024 | 123 |
      | Discover    | 5666323243232332 | Greens       | May   | 2024 | 123 |
    Then User should verify after booking hotel success message"Booking is Confirmed" and save the orderID
    And User should verify after booking selected hotel name is present successfully

    Examples: 
      | username            | password      | state     | city       | roomType                            | checkIn    | checkOut   | noRooms | noAdult | noChild | salutation | firstName | lastName | moible     | email               | regNo      | companyName            | comapnyAddress | otherReq                                                                 | cardType  |
      | durai8827@gmail.com | NPTIneyveli@3 | TamilNadu | Puducherry | Standard/Duluxe/Suite/Luxury/Studio | 2024-03-01 | 2024-03-03 | 1-One   | 1-One   |       2 | Mr.        | SELLA     | DURAI    | 8754855932 | durai8827@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam   | Smoking Room/Late Check-in/Early Check-in/Room on a high floor/Large bed | DebitCard |

  Scenario Outline: verifying Book Hotel module by entering credit without GST and special request
    Given User is in OmrBranch hotel page
    When User enter "<username>" and "<password>"
    Then User should verify after login success message "Welcome SELLA"
    When User search by entering all the fields"<state>","<city>","<roomType>","<checkIn>","<checkOut>","<noRooms>","<noAdult>"and"<noChild>"
    Then User should verify after select hotel success message "Select Hotel"
    When User select the first hotel name and save the hotel name and hotel price
    And User accpet the alert to select hotel
    Then User should verify after select hotel success message"Select Hotel"
    When User select thwe first hotel name and save the hotel name and hotel price
    And User accept the alert to select hotel
    Then User should verify "Book Hotel" success message after navigate to Book hotel
    When User add the guest details "<salutation>","<firstName>","<lastName>","<mobile>"and"<email>"
    And User add GST details "<regNo>","<companyName>"and"<comapnyAddress>"
    And User click next without entering GST details
    And User click next without entering special request
    And User add special request "<otherReq>"
    And User add the payment details "<cardType>"
      | card        | cardNumber       | Name on Card | month | year | cvv |
      | visa        | 5555555555552223 | Greens       | May   | 2024 | 123 |
      | Master card | 5666323243232398 | Greens       | May   | 2024 | 123 |
      | Amex        | 5666323243232316 | Greens       | May   | 2024 | 123 |
      | Discover    | 5666323243232332 | Greens       | May   | 2024 | 123 |
    Then User should verify after booking hotel success message"Booking is Confirmed" and save the orderID
    And User should verify after booking selected hotel name is present successfully

    Examples: 
      | username            | password      | state     | city       | roomType                            | checkIn    | checkOut   | noRooms | noAdult | noChild | salutation | firstName | lastName | moible     | email               | regNo      | companyName            | comapnyAddress | otherReq                                                                 | cardType   |
      | durai8827@gmail.com | NPTIneyveli@3 | TamilNadu | Puducherry | Standard/Duluxe/Suite/Luxury/Studio | 2024-03-01 | 2024-03-03 | 1-One   | 1-One   |       2 | Mr.        | SELLA     | DURAI    | 8754855932 | durai8827@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam   | Smoking Room/Late Check-in/Early Check-in/Room on a high floor/Large bed | creditCard |

  Scenario Outline: verifying Book Hotel module without entering special request,GST details and payment Details
    Given User is in OmrBranch hotel page
    When User enter "<username>" and "<password>"
    Then User should verify after login success message "Welcome SELLA"
    When User search by entering all the fields"<state>","<city>","<roomType>","<checkIn>","<checkOut>","<noRooms>","<noAdult>"and"<noChild>"
    Then User should verify after select hotel success message "Select Hotel"
    When User select the first hotel name and save the hotel name and hotel price
    And User accpet the alert to select hotel
    Then User should verify after select hotel success message"Select Hotel"
    When User select thwe first hotel name and save the hotel name and hotel price
    And User accept the alert to select hotel
    Then User should verify "Book Hotel" success message after navigate to Book hotel
    When User add the guest details "<salutation>","<firstName>","<lastName>","<mobile>"and"<email>"
    And User Click next without entering GST Details
    And User Click next without entering special request
    And User submit without entring payment details
    Then User should verify after booking hotel error message "Please select your card type","please select your card","please your card number","please provide name on your card","please provide your card expiry date"and "please provide your card security's code"
    And User should verify after booking selected hotel name is present successfully

    Examples: 
      | username            | password      | state     | city       | roomType                            | checkIn    | checkOut   | noRooms | noAdult | noChild | salutation | firstName | lastName | moible     | email               | regNo      | companyName            | comapnyAddress | otherReq                                                                 | cardType  |
      | durai8827@gmail.com | NPTIneyveli@3 | TamilNadu | Puducherry | Standard/Duluxe/Suite/Luxury/Studio | 2024-03-01 | 2024-03-03 | 1-One   | 1-One   |       2 | Mr.        | SELLA     | DURAI    | 8754855932 | durai8827@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam   | Smoking Room/Late Check-in/Early Check-in/Room on a high floor/Large bed | DebitCard |
