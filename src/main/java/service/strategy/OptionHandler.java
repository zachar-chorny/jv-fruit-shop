package service.strategy;

import model.Transaction;

public interface OptionHandler {
    void apply(Transaction transaction);
}