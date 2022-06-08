class DigitalWalletTransaction{
    void addMoney(DigitalWallet digitalWallet, int amount) throws TransactionException {
        if(digitalWallet.getUserAccessToken() == null){
            throw new TransactionException("User not authorized", "USER_NOT_AUTHORIZED");
        }
        if( amount < 1){
            throw new TransactionException("Amount should be greater than zero", "INVALID_AMOUNT");
        }

        int amt = digitalWallet.getWalletBalance();
        digitalWallet.setWalletBalance(amt + amount);
    }
    void payMoney(DigitalWallet digitalWallet, int amount) throws TransactionException {
        if(digitalWallet.getUserAccessToken() == null){
            throw new TransactionException("User not authorized", "USER_NOT_AUTHORIZED");
        }
        if( amount < 1){
            throw new TransactionException("Amount should be greater than zero", "INVALID_AMOUNT");
        }
        int amt = digitalWallet.getWalletBalance();

        if( amount > amt){
            throw new TransactionException("Insufficient balance", "INSUFFICIENT_BALANCE");
        }
        digitalWallet.setWalletBalance(amt - amount);
    }
}