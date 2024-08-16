package dio.handler;

public class BusinessException extends RuntimeException {
    public  BusinessException(String mensagem){
        super(mensagem);
    }
    public BusinessException(String mensagem, Object ... paramns){
        super(String.format(mensagem, paramns));
    }
}
