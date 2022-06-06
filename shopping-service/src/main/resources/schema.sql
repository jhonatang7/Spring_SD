DROP TABLE IF EXISTS tlb_invoices;
CREATE TABLE tlb_invoices(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    number_invoice VARCHAR(50) NOT NULL,
    description VARCHAR(100) NOT NULL,
    customer_id BIGINT,
    create_at DATE,
    state VARCHAR(50) NOT NULL
);

DROP TABLE IF EXISTS tbl_invoce_items;
CREATE TABLE tbl_invoce_items(
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    product_id BIGINT,
    quantity BIGINT NOT NULL,
    price DOUBLE NOT NULL
);