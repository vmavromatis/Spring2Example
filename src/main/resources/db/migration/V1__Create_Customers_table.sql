CREATE TABLE customers
(
  customer_id   BIGSERIAL     PRIMARY KEY NOT NULL,
  name          VARCHAR(50)               NOT NULL,
  surname       VARCHAR(50)               NOT NULL
);