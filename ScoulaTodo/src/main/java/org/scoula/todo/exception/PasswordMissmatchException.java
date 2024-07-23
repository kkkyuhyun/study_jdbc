package org.scoula.todo.exception;

public class PasswordMissmatchException extends Exception{
    public PasswordMissmatchException() {
        super("비밀번호가 맞지 않습니다.");
    }
}
