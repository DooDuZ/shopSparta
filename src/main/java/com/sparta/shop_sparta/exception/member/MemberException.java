package com.sparta.shop_sparta.exception.member;

public class MemberException extends IllegalArgumentException{

    public MemberException(String message) {
        super(message);
    }

    public MemberException(String message, Throwable cause) {
        super(message, cause);
    }

    public MemberException(Throwable cause) {
        super(cause);
    }
}
