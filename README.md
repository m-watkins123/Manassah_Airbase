# Manassah_Airbase
Airbase system designed for Passenger needs
*/
The application of the Air base is used as such:

Passenger:
Passenger is able to buy a plane ticket as well as change their existing flight. A Passenger would be information would be integrated in the system with their name and a unique id number
Passenger Models:
-Passenger id
- Passenger name
PassengerController:
PassengerController maps each web page link to the HTML pages with a certain function for each web page
PassengerService and ServiceI - displays the list of commands that the Passenger class has to operate e.x Passenger<list> must return all Passenger List within the system
Route:
A Route would be designated towards the passenger based on the passenger name and id number. The route would be able to only show the origin of the route as well as the destination.
Route Models:
-Route id
- Route name
HomeController - marked as a home page for classes as a web request handler example /route would display as a web request page for route
RouteService and ServiceI - used to display the functionalities of the Route class path
Flight:
The flights are separate by their own flight ID as well as their code names for each flight. Their would be no duplicates of the flights nor routes. 
Flight Models:
-Flight id
- FlightName
HomeController - marked as a home page for classes as a web request handler example /flight would display as a web request page for flight
Airplane:
Airplane is able to tell Passengers what airplane model they are boarding as well as the name of the airplane and the year that it was manufactured
Airplane Models:
- Airplane id
- Airplane model
HomeController - marked as a home page for classes as a web request handler example /airplane would display as a web request page for airplane


Additional methods:
I planned on adding another CRUD operation to the  flight pages as I want to update and delete flights in case a flight was delayed or if the route to the flight has inclined weather. In addition I want to develop a Employee class to show the number of Employees working at the air base.
