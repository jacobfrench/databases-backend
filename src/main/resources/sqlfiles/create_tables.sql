\c cmps3420;


CREATE TABLE IF NOT EXISTS properties(
    propId INTEGER PRIMARY KEY NOT NULL,
    city VARCHAR(80),
    propType VARCHAR(80),
    serviceFrequency VARCHAR(80),
    state VARCHAR(80),
    streetAddress VARCHAR(100),
    zipCode VARCHAR(5)

);

CREATE TABLE IF NOT EXISTS contracts(
    contractId INTEGER PRIMARY KEY NOT NULL,
    salesPerson VARCHAR(25),
    serviceDate Date not null,
    propId INTEGER REFERENCES properties(propId)
);

CREATE TABLE IF NOT EXISTS customers(
    customerId INTEGER PRIMARY KEY NOT NULL,
    name VARCHAR(80),
    email VARCHAR(100),
    phoneNum VARCHAR(15)
);

CREATE TABLE IF NOT EXISTS chemicals(
    chemId INTEGER PRIMARY KEY NOT NULL,
    name VARCHAR(80),
    signalWord VARCHAR(80)
);

CREATE TABLE IF NOT EXISTS pests(
    pestId INTEGER PRIMARY KEY NOT NULL,
    commonName VARCHAR(100),
    phylum VARCHAR(80),
    class VARCHAR(80)
);

CREATE TABLE IF NOT EXISTS technicians(
    techId INTEGER PRIMARY KEY NOT NULL,
    licenseType VARCHAR(80),
    name VARCHAR(80)
);

CREATE TABLE IF NOT EXISTS invoices(
	invoiceId INTEGER PRIMARY KEY NOT NULL,
    serviceDate DATE NOT NULL
);

CREATE TABLE IF NOT EXISTS routes(
    routeid INTEGER PRIMARY KEY NOT NULL,
    routeName VARCHAR(80) default '',
    techid INTEGER REFERENCES technicians(techid)
);

-- Relationships
CREATE TABLE IF NOT EXISTS routes_properties(
    route_routeid INTEGER NOT NULL,
    properties_propid INTEGER NOT NULL
);

CREATE TABLE IF NOT EXISTS customers_properties(
    customer_customerid INTEGER NOT NULL;
    properties_propid INTEGER NOT NULL;
);

CREATE TABLE IF NOT EXISTS properties_contracts(
    property_propid INTEGER NOT NULL;
    contracts_contractid INTEGER NOT NULL;
);