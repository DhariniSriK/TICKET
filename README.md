Title: Ticketing System using Core Java Collection Framework
Doc Code: #TASK_CORE_JAVA_02
Date: 13-May-2025
© 2025 MentorBridge. All rights reserved.
🎯 Objective:
Simulate a ticket management system where train tickets can be booked, retrieved, updated,
and canceled using Java Collections.
Data Structure
Each ticket is represented as an object with:
ticketId: Integer (unique ticket number)
passengerName: String
source: String (departure city)
destination: String (arrival city)
travelDate: String (format: YYYY-MM-DD)
Tickets are managed using a map-based structure:
 # Type: Map
Implementation: HashMap with ticketId as the key
Functionalities
🔹 Book Ticket
Create a new ticket record and store it in the map.
Ensures quick retrieval using ticket ID.
🔹 View Ticket by ID
Retrieve ticket details using its unique ID.
Helps in verification or updating later.
🔹 View All Tickets
Show all booked tickets currently in the system.
🔹 Update Ticket Details
Modify ticket information like name, source, or destination.
Based on the ticket ID.
Cancel Ticket
Remove a booked ticket using its ID.
Frees up the slot and maintains accuracy.
Key Concepts Covered
 # Java Maps: Map, HashMap
 # Key-Value Pair Storage
Object References and Mutation
Null Checks and Error Handling
