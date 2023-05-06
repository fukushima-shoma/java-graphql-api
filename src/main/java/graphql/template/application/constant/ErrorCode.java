package graphql.template.application.constant;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {
    /**
     * 内部処理のエラー
     */
    INTERNAL_SERVER_ERROR("err-1000", "internal server error");


    private final String code;
    private final String message;
}
