```mermaid
sequenceDiagram
    participant Client
    participant BookingService
    participant ShowService
    participant PaymentService
    participant NotificationService
    
    Client->>BookingService: 1. Create Booking
    BookingService->>ShowService: 2. Validate & Reserve Seats
    ShowService-->>BookingService: 3. Seats Reserved
    BookingService->>PaymentService: 4. Process Payment
    PaymentService-->>BookingService: 5. Payment Success
    BookingService->>ShowService: 6. Confirm Booking
    BookingService->>NotificationService: 7. Send Notification (Async)
    BookingService-->>Client: 8. Booking Confirmed
```