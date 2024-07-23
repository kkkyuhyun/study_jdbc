DROP TABLE IF EXISTS TODO;

CREATE TABLE TODO (
    ID              INTEGER         AUTO_INCREMENT      NOT NULL    PRIMARY KEY,
    TITLE           VARCHAR(128)    NOT NULL,
    DESCRIPTION     VARCHAR(512)    NOT NULL,
    DONE            BOOLEAN,
    USERID          VARCHAR(12)     NOT NULL,
    FOREIGN KEY (USERID) REFERENCES USERS(ID)
        ON UPDATE CASCADE
        ON DELETE CASCADE
);

INSERT INTO todo(title, description, done, userid)
VALUES ('야구장', '프로야구 경기도 봐야합니다.', false, 'guest'),
       ('놀기', '노는 것도 중요합니다.', false, 'guest'),
       ('Vue 학습', 'Vue 학습을 해야 합니다.', false, 'member'),
       ('ES6 공부', 'ES6공부를 해야 합니다.', true, 'guest');


SELECT * FROM TODO;

select count(*) from todo where userid='guest';

select * from todo where userid='guest';