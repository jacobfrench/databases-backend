

\c cmps3420;

CREATE TABLE IF NOT EXISTS routes(
    routeid integer primary key not null,
    routeName varchar(80) default ''
);

CREATE TABLE IF NOT EXISTS properties(
    propId integer primary key not null,
    propType varchar(80),
    streetAddress varchar(100),
    city varchar(80),
    state varchar(80),
    zipCode varchar(5),
    serviceFrequency varchar(80)
);

CREATE TABLE IF NOT EXISTS contracts(
    contractId integer primary key not null,
    salesPerson varchar(25),
    serviceDate Date not null
);

CREATE TABLE IF NOT EXISTS customers(
    customerId integer primary key not null,
    name varchar(80),
    email varchar(100),
    phoneNum varchar(15)
);

CREATE TABLE IF NOT EXISTS chemicals(
    chemId integer primary key not null,
    name varchar(80),
    signalWord varchar(80)
);

CREATE TABLE IF NOT EXISTS pests(
    pestId integer primary key not null,
    commonName varchar(100),
    phylum varchar(80),
    class varchar(80)
);

CREATE TABLE IF NOT EXISTS technicians(
    techId integer primary key not null,
    name varchar(80),
    licenseType varchar(80)
);

CREATE TABLE IF NOT EXISTS invoices(
	invoiceId integer primary key not null,
    serviceDate Date not null
);

-- Relationships
CREATE TABLE IF NOT EXISTS routes_properties(
    route_routeid integer not null,
    properties_propid integer not null
);
