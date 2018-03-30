CREATE TABLE routes(
    routeid     int,        --primary key
    routename   varchar(80) 
);

CREATE TABLE properties(
    propid          int,        --primary key
    proptype        varchar(80),
    streetaddress   varchar(120),
    city            varchar(120),
    state           varchar(2),
    zipcode         varchar(10)
);