CREATE DATABASE IF NOT EXISTS orderservice;
SELECT user, host FROM mysql.user WHERE user = 'root';

-- To grant privileges from any host:
CREATE USER 'root'@'%' IDENTIFIED BY 'lavi9755';
GRANT ALL PRIVILEGES ON *.* TO 'root'@'%' WITH GRANT OPTION;
FLUSH PRIVILEGES;
