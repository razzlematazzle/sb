package sb.roundup.roundup.Controllers;

import org.springframework.web.bind.annotation.RestController;

import sb.roundup.roundup.Services.RoundUpService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class WeeklyRoundUpController {

    @Autowired
    RoundUpService roundUpService;

    @GetMapping("weeklyroundup")
    public String performWeeklyRoundUp(@RequestParam String customerId,
                                        @RequestParam String accountId, 
                                        @RequestParam String savingPotId,
                                        @RequestParam String startDate, 
                                        @RequestParam String endDate, 
                                        @RequestParam String correlationId) {

        // TODO Receive params: customer id, account, saving pot, correlation id, dates?
        // Is this a secure way of doing it?
        // Pass these on
        String roundUpResponse = roundUpService.performWeeklyRoundUp(customerId,
                                                                        accountId, 
                                                                        savingPotId,
                                                                        startDate, 
                                                                        endDate, 
                                                                        correlationId);
        
        return roundUpResponse;
    }
    
}
