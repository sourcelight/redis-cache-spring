## redis-cache-spring
Sample application to configure redis as cache in spring boot REST application.

## KEY POINTS 
I have used mysql datasource to persist the user data. You can make use of H2 databases as well.

## Install redis on windows: https://developer.redis.com/create/windows/

some useful commands:

* sudo service redis-server restart
* redis-cli
    * set user:1 "Jane"
    * get user:1
  
      "Jane"
* sudo service redis-server stop

### DB and User creation scripts for MYSQL:

```sql
CREATE DATABASE DB_NAME;

USE DB_NAME;

CREATE USER 'USER_NAME'@'localhost' IDENTIFIED BY 'PASSWORD';

CREATE USER 'USER_NAME'@'%' IDENTIFIED BY 'PASSWORD';

GRANT ALL PRIVILEGES ON DB_NAME.* TO  'USER_NAME'@'localhost';

GRANT ALL PRIVILEGES ON DB_NAME.* TO  'USER_NAME'@'%';

FLUSH PRIVILEGES;

```



