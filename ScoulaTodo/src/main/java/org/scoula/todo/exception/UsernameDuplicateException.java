package org.scoula.todo.exception;

public class UsernameDuplicateException extends Exception {
    public UsernameDuplicateException() {
        super("이미 사용중인 사용자 ID입니다.");
    }
}
