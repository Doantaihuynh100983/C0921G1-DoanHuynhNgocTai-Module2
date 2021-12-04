package thi.vallidate;

public class NotFoundBankAccountException  extends  Exception{
    public NotFoundBankAccountException() {
    }

    public NotFoundBankAccountException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
