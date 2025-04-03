package com.example.hrms.biz.booking.model;

import com.example.hrms.enumation.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Booking {
    private Long bookingId;
    private String username;
    private Long roomId;
    private String startTime;
    private String endTime;
    private BookingStatusEnum status;
    private String title;
    private String attendees;
    private String content;
    private BookingType bookingType;
    private String weekdays;
}