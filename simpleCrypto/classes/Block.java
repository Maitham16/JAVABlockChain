package simpleCrypto.classes;

import java.util.Date;
import java.util.List;

public class Block {
    public String hash;
    public String previousHash;
    private List<Transaction> transactions; //our data will be a simple message.
    private long timeStamp; //as number of milliseconds since 1/1/1970.

    public Block(String previousHash , List<Transaction> transactions) {
        this.previousHash = previousHash;
        this.transactions = transactions;
        this.timeStamp = new Date().getTime();
        this.hash = calculateHash();
    }

    public String calculateHash() {
        String calculatedhash = StringUtil.applySha256(
                previousHash +
                Long.toString(timeStamp) +
                transactions.toString());
        return calculatedhash;
    }
}
