class TransactionException extends Exception{
    private String code ;
    TransactionException( String errorMeassge, String errorCode){
        super(errorMeassge);
        this.code = errorCode;
    }
    public String getErrorCode(){
        return this.code;
    }
}