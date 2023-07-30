package simpleCrypto.classes;

import java.util.ArrayList;
import java.util.List;

public class Blockchain {
    public List<Block> chain;

    public Blockchain() {
        chain = new ArrayList<Block>();
        chain.add(new Block("0", new ArrayList<Transaction>()));
    }

    public Block latestBlock() {
        return chain.get(chain.size() - 1);
    }

    public void addBlock(Block newBlock) {
        newBlock.previousHash = latestBlock().hash;
        newBlock.hash = newBlock.calculateHash();
        chain.add(newBlock);
    }
}

