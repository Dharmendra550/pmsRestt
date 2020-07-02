package com.rest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.rest.entity.Trade;
import com.rest.model.User;
import com.rest.repository.TradeRepository;

@RestController
public class TradeRestController 
{
@Autowired
TradeRepository repo;

@GetMapping("/trades")
public ResponseEntity<List<Trade>> getAllTrades()
{
	List<Trade>tradeList=repo.findAll();
	
	return new ResponseEntity<List<Trade>>(tradeList,HttpStatus.OK);
}

@GetMapping("/trades/{tradeid}")
public ResponseEntity<Optional<Trade>> getTradeById(@PathVariable("tradeid") Integer  tradeId)
{
	Optional<Trade>  trade = repo.findById(tradeId);
	
	return   new  ResponseEntity<Optional<Trade>>(trade, HttpStatus.OK);
}
@PostMapping("/trades/create")
public String storeTrade(@RequestBody Trade trade) {
	boolean  flag=repo.existsById(trade.getTradeid());
	if(flag == true) {
		return "product already exist";
	}
	else {
		repo.save(trade);
		
		return  "product is added to Database";
	}
}

@DeleteMapping("/trades/erase")
public   String   deleteProduct(@RequestParam("tradeid") Integer   tradeid) {
	
	boolean  flag=repo.existsById(tradeid);
	if(flag==true) {
		repo.deleteById(tradeid);
		return  "The product is  deleted.";
		
	}
	else {
		return  "Sorry, The product doesn't  exist";
	}
}

}

