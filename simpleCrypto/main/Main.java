package simpleCrypto.main;

import java.util.ArrayList;
import java.util.List;

import simpleCrypto.classes.Block;
import simpleCrypto.classes.Blockchain;
import simpleCrypto.classes.Transaction;

public class Main {
    public static Blockchain coinChain = new Blockchain();

    public static void main(String[] args) {
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction("User1", "User2", 5));
        transactions.add(new Transaction("User2", "User1", 2));
        transactions.add(new Transaction("User1", "User3", 1));
        transactions.add(new Transaction("User3", "User1", 3));
        coinChain.addBlock(new Block(coinChain.latestBlock().hash, transactions));

        System.out.println("Blockchain: ");
        coinChain.chain.forEach(block -> System.out.println(block.hash));
    }
}

