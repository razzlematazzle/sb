package sb.roundup.roundup.Client;

import java.util.List;

import org.springframework.stereotype.Component;

import sb.roundup.roundup.Model.Transaction;

/***
 * Class for retreiving transactions from transaction endpoin
 */
@Component
public class TransactionClient {


    /**
     * Returns list of transactions between two dates
     * @return
     */
    public List<Transaction> getTransactionsBetweenDates(){
        // TODO complete method
        return List.of();
    }
}
