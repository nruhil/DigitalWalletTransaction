class DigitalWallet{
    String walledId;
    String userName;
    String userAccessCode;
    private int walletBalance;

    DigitalWallet(String walledId, String userName)    {
        this.walledId = walledId;
        this.userName = userName;
    }
    DigitalWallet(String walledId, String userName, String userAccessCode)    {
        this.walledId = walledId;
        this.userName = userName;
        this.userAccessCode = userAccessCode;
    }
    public String getWalletId(){
        return this.walledId;
    }
    public String getUsername(){
        return this.userName;
    }
    public String getUserAccessToken(){
        return this.userAccessCode;
    }
    public int getWalletBalance(){
        return this.walletBalance;
    }
    public void setWalletBalance( int walletBalance ){

        this.walletBalance = walletBalance;
    }


}