DROP TABLE IF EXISTS tbl_regions;
CREATE TABLE tbl_regions (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(250) NOT NULL
);

DROP TABLE IF EXISTS tbl_customers;
CREATE TABLE tbl_customers(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    number_id VARCHAR(20) NOT NULL,
    first_name VARCHAR(80) NOT NULL,
    last_name VARCHAR(80) NOT NULL,
    email VARCHAR(50) NOT NULL,
    photo_url VARCHAR(500),
    region_id BIGINT,
    state VARCHAR(20) NOT NULL
);