package com.weke.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.weke.provider.service.TicketService;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Reference
    TicketService ticketService;

    public String hello() {
        String ticket  = ticketService.getTicket();
        System.out.println("买到票了");
        return ticket;
    }
}
