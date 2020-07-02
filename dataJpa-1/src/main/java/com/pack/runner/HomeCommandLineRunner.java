package com.pack.runner;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import java.util.List;
import com.pack.entity.Passenger;
import com.pack.repository.PassengerRepository;




@Component
public class HomeCommandLineRunner implements CommandLineRunner 
{
@Autowired
ApplicationContext ctx;


	@Override
	public void run(String...args) throws Exception
	{
	PassengerRepository repo=(PassengerRepository)ctx.getBean("passengerRepository");
    /* Optional<Passenger> opt=repo.findById(13321);
     Passenger p=opt.get();
     System.out.println(p);*/                                       /*[Approach1]*/
		
		/*List<Passenger> passengerList=repo.findAll();
		passengerList.forEach(p1->System.out.println(p1));*/         /*[Approach2]*/
	
	/*Passenger passenger=repo.findByfirstName("REKHA");
	System.out.println(passenger);*/                                  /*[Approach3]*/
	
	
	/*List<Passenger> passengerList=repo.readPassengersBetweenSeatNumbers(1, 15);
	passengerList.forEach(P2->System.out.println(P2));*/                           /*[Approach4]*/
	
	
	List<Passenger> passengerByfirstNamelist=repo.byFirstName();
	passengerByfirstNamelist.forEach(P3->System.out.println(P3));
	
	 List<Passenger> passengerBetweenList =
			  repo.readPassengersBetweenSeatNumbers(10, 17); 
	 passengerBetweenList.forEach(p5-> System.out.println(p5));

			
			
	}

}
