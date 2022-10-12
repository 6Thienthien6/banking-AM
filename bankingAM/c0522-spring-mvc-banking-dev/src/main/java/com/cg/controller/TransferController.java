package com.cg.controller;

import com.cg.model.Transfer;
import com.cg.service.customer.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.util.List;

@Controller
@RequestMapping ("/transfers")
public class TransferController {
    @Autowired
    private TransferService transferService;
    @GetMapping
    public ModelAndView showListHistory(){
        ModelAndView view = new ModelAndView();
        view.setViewName("transfer-history/list");
        Iterable<Transfer> transfers = transferService.findAll();
        BigDecimal getAllFeesAmount = transferService.getSumFeesAmount();
        view.addObject("transfers", transfers);
        view.addObject("allFeesAmount", getAllFeesAmount);

        return view;
    }
}
