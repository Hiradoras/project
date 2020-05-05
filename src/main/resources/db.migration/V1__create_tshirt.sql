create table tshirts
(
    id bigserial primary key,
    sku bigint,
    title varchar,
    description varchar,
    availableSizes varchar,
    style varchar,
    price float,
    installments integer,
    currencyId varchar,
    currencyFormat varchar,
    isFreeShipping bit
);