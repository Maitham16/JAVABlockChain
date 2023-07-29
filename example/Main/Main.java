package example.Main;

import example.classes.Block;

public class Main {
    public static void main(String[] args) {
        String[] genesisTransactions = {"a sent b 10 bitcoin", "b sent c 10 bitcoin"};
        Block genesisBlock = new Block(0, genesisTransactions);

        String[] block2Transactions = {"c sent a 10 bitcoin", "a sent b 10 bitcoin"};
        Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);

        String [] block3Transactions = {"c sent c 10 bitcoin", "b sent a 10 bitcoin"};
        Block block3 = new Block(block2.getBlockHash(), block3Transactions);

        String [] block4Transactions = {"c sent c 10 bitcoin", "a sent b 10 bitcoin"};
        Block block4 = new Block(block3.getBlockHash(), block4Transactions);

        System.out.println("Hash of genesis block:");
        System.out.println(genesisBlock.getBlockHash());

        System.out.println("Hash of block 2:");
        System.out.println(block2.getBlockHash());

        System.out.println("Hash of block 3:");
        System.out.println(block3.getBlockHash());

        System.out.println("Hash of block 4:");
        System.out.println(block4.getBlockHash());
    }
}

// This is an incredibly simplified version of a blockchain, but it helps to illustrate how 
// a blockchain stores transactions in blocks, which are connected to each other by storing 
// the hash of the previous block. In reality, blockchain technology involves much more 
// complex processes such as proof-of-work (a mechanism that prevents double-spending and 
// maintains the integrity of the system).