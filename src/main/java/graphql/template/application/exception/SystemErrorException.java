package graphql.template.application.exception;

import lombok.Getter;

@Getter
public class SystemErrorException extends RuntimeException {

    private String code;
    private String detailMessage;

    public SystemErrorException(String code, String msg) {
        super(msg);
        this.code = code;
    }

    public SystemErrorException(String code, String msg, String detailMessage) {
        super(msg);
        this.code = code;
        this.detailMessage = detailMessage;
    }

    public SystemErrorException(String code, String msg, Throwable e) {
        super(msg, e);
        this.code = code;
    }
}
