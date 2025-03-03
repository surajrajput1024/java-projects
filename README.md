# Java Projects

## 01. Ticket booking system: 

### Functional requiremenents: 

1. User should be able to signup/login.
2. Fetch/search trains.
3. Show available seats.
4. Book your ticket.

### Non-functional requirements:
1. Fault tolerance
2. Consistent
3. Scalable and performatic. 
4. Security 


### Schema design:

1. User:
   - uuid
   - name 
   - email
   - password (hashed)
   - created_at
   - updated_at

2. Ticket 
    - uuid
    - pnr
    - from
    - to
    - user_id
    - passengers[] Passengers[]
    - train_id uuid
    - status
    - seat_preference
    - diet_preference

3. Train
   - uuid
   - name 
   - from
   - to
   - time_schedule
   - seats[][] 
   - via 
   - created_at
   - updated_at

   

 


