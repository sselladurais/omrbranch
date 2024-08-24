Feature: verifying OMR branch cancel booking

Scenario Outline: verifying cancel Booking module by changing checkInDate for created orderID

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
      | visa        | 5555555555552222 | Greens       | May   | 2024 | 123 |
      | Master card | 5666323243232398 | Greens       | May   | 2024 | 123 |
      | Amex        | 5666323243232316 | Greens       | May   | 2024 | 123 |
      | Discover    | 5666323243232332 | Greens       | May   | 2024 | 123 |
    Then User should verify after booking hotel success message "Booking is Confirmed" and save the orderID
    And User should verify after booking selected hotel name is present successfully
    When User Navigate to My Booking page
    Then User should verify the success message "Bookings" after Navigate to booking page
    When User search the orderID with saved orderID
    Then User should verify the same orderID is present successfully
    And User should verify the same hotel name is present successfully
    And User should verify the same hotel price is present successfully
    When User cancel the booking
    And User accept alert
    Then User should verify after cancelling success message "cancelled"
    
     Examples: 
      | username            | password      | state     | city       | roomType                            | checkIn    | checkOut   | noRooms | noAdult | noChild | salutation | firstName | lastName | moible     | email               | regNo      | companyName            | comapnyAddress | otherReq                                                                 | cardType  | EditCheckin  |
      | durai8827@gmail.com | NPTIneyveli@3 | TamilNadu | Puducherry | Standard/Duluxe/Suite/Luxury/Studio | 2024-03-01 | 2024-03-03 | 1-One   | 1-One   |       2 | Mr.        | SELLA     | DURAI    | 8754855932 | durai8827@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam   | Smoking Room/Late Check-in/Early Check-in/Room on a high floor/Large bed | DebitCard |  2024-03-02  |

Scenario Outline: verifying cancel Booking module by cancelling first order

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
      | visa        | 5555555555552222 | Greens       | May   | 2024 | 123 |
      | Master card | 5666323243232398 | Greens       | May   | 2024 | 123 |
      | Amex        | 5666323243232316 | Greens       | May   | 2024 | 123 |
      | Discover    | 5666323243232332 | Greens       | May   | 2024 | 123 |
    Then User should verify after booking hotel success message "Booking is Confirmed" and save the orderID
    And User should verify after booking selected hotel name is present successfully
    When User Navigate to My Booking page
    Then User should verify the success message "Bookings" after Navigate to booking page
    When User cancel the booking
    And User accpet alert
    Then User should verify after cancelling success message "cancelled"
    
 Examples:
 | username            | password      |
 | durai8827@gmail.com | NPTIneyveli@3 |
 
 Scenario Outline: verifying cancel Booking module by cancelling the order by old orderID
   
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
      | visa        | 5555555555552222 | Greens       | May   | 2024 | 123 |
      | Master card | 5666323243232398 | Greens       | May   | 2024 | 123 |
      | Amex        | 5666323243232316 | Greens       | May   | 2024 | 123 |
      | Discover    | 5666323243232332 | Greens       | May   | 2024 | 123 |
    Then User should verify after booking hotel success message "Booking is Confirmed" and save the orderID
    And User should verify after booking selected hotel name is present successfully
    When User Navigate to My Booking page
    Then User should verify the success message "Bookings" after Navigate to booking page
    When User save the orderID the Existing orderID
    And User search the existing orderID
    And User cancel the booking
    And User accpet alert
    Then User should verify after cancelling success message "cancelled"
     
  Examples:
 | username            | password      |  oldoderID |
 | durai8827@gmail.com | NPTIneyveli@3 | JDZIU14868 |




























