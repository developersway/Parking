package org.example;

import org.example.Dto.ParkingDto;
import org.example.Enum.VehicleSizeEnum;
import org.example.Repository.Interface.IParkingRepository;
import org.example.Repository.Interface.ITicketRepository;
import org.example.Repository.ParkingRepository;
import org.example.Repository.TicketRepository;
import org.example.Service.Interface.ITicketService;
import org.example.Service.ParkingService;
import org.example.Service.TicketService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IParkingRepository parkingRepository = new ParkingRepository();
        ITicketRepository ticketRepository = TicketRepository.getInstance();
        ITicketService ticketService = new TicketService(ticketRepository);

        ParkingService parkingService = new ParkingService(parkingRepository, ticketService);

        parkingService.bookParking(new ParkingDto(1,1,1, VehicleSizeEnum.LIGHT));


        parkingService.releaseParking(1,1);

        parkingService.releaseParking(34,1);

        parkingService.bookParking(new ParkingDto(2,1,1, VehicleSizeEnum.HEAVY));

        parkingService.releaseParking(2,1);
    }
}