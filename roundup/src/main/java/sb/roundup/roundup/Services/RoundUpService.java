package sb.roundup.roundup.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sb.roundup.roundup.Client.TransactionClient;
import sb.roundup.roundup.Model.Transaction;
import sb.roundup.roundup.Repositories.RequestRepository;

@Service
public class RoundUpService {


    @Autowired
    RequestRepository requestRepository;

    @Autowired
    TransactionClient transactionClient;

    public String performWeeklyRoundUp(String customerId,
                                        String accountId, 
                                        String savingPotId,
                                        String startDate, 
                                        String endDate, 
                                        String correlationId){

        // TODO: Will receive the params passed to the controller customer id, account, saving pot etc

        // TODO Validate dates
        // TODO validate the customer/account/saving pot match?

        // TODO Create/update request in request db with status of processing. Probably better to save this as a payload though.
        requestRepository.createOrUpdateRequest(customerId,
        accountId, 
        savingPotId,
        startDate, 
        endDate, 
        correlationId);

        //TODO Get the account?

        // TODO Get the transactions between the two dates
        List<Transaction> transactions = transactionClient.getTransactionsBetweenDates();

        // TODO Round up the amounts

        // TODO Transfer the rounded up amount to the saving pot

        // TODO Update the request id to be completed



        return "Performed weekly round up";
    }
}
