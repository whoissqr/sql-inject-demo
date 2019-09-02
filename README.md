## This demo vulnerable RestAPI was forked from https://github.com/CC11001100/sql-inject-demo

## Technlogy Stack
   *Java 
   *Spring Boot
   *Spring MVC
   *JdbcTemplate


# sample http GET request

```
http://localhost:8080/user/login?username=foo&passwd=bar
```

# Prequisite:

create the database using mysql Command line:

```
DROP DATABASE IF EXISTS sql_inject_demo;
CREATE DATABASE sql_inject_demo;
USE sql_inject_demo;

DROP TABLE IF EXISTS t_user;
CREATE TABLE t_user(
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(100) COMMENT 'username',
    passwd CHAR(32) COMMENT 'password'
) CHARSET UTF8;

INSERT INTO t_user (username, passwd) VALUES ('admin', MD5('admin'));

```

# notes:
please check application.properties to verify the DB connection string and user credentials are correct.






