package com.example.h_mal.alameera;

/**
 * Created by h_mal on 09/09/2018.
 */

class Booking {

    private String bookingName;
    private String bookingTimes;
    private String bookingService;

    public Booking(String bookingName, String bookingTimes, String bookingService) {
        this.bookingName = bookingName;
        this.bookingTimes = bookingTimes;
        this.bookingService = bookingService;
    }

    public String getBookingName() {
        return bookingName;
    }

    public String getBookingTimes() {
        return bookingTimes;
    }

    public String getBookingService() {
        return bookingService;
    }
}
