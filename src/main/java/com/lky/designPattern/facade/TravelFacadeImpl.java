package com.lky.designPattern.facade;

/**
 * @author Created by njy on 2023/6/14
 * 3.外观实现类：旅行社
 */
public class TravelFacadeImpl implements TravelFacade{
    private HotelService hotelService;
    private FlightService flightService;
    private TicketService ticketService;

    public TravelFacadeImpl(){
        hotelService=new HotelService();
        flightService=new FlightService();
        ticketService=new TicketService();
    }

    @Override
    public void dePart(){
        hotelService.bookHotel();
        flightService.bookFlight();
        ticketService.bookTicket();
    }
}
