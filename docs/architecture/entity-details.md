| Entity       | Table Name     | Description                         | Key Fields                                   |
|--------------|----------------|-------------------------------------|----------------------------------------------|
| User         | users          | Registered users                    | user_id (PK), email, phone                   |
| Role         | roles          | User roles (ADMIN, USER)            | role_id (PK), role_name                      |
| Movie        | movies         | Movie catalog                       | movie_id (PK), title, genre                  |
| Theatre      | theatres       | Theatre information                 | theatre_id (PK), name, location              |
| Screen       | screens        | Screens within theatre              | screen_id (PK), theatre_id (FK)              |
| Seat         | seats          | Individual seats in a screen        | seat_id (PK), screen_id (FK), seat_number    |
| Show         | shows          | Movie showtimes                     | show_id (PK), movie_id (FK), screen_id (FK)  |
| ShowSeat     | show_seats     | Seat availability per show          | show_seat_id (PK), show_id (FK), seat_id (FK)|
| Booking      | bookings       | Booking records                     | booking_id (PK), user_id (FK), show_id (FK)  |
| BookingSeat  | booking_seats  | Seats within a booking              | booking_seat_id (PK), booking_id (FK)        |
| Payment      | payments       | Payment transactions                | payment_id (PK), booking_id (FK)             |