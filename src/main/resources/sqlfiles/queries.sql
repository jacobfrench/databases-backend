-- query 1----------------------------------------------------------------
-- SELECT c.name, p.streetaddress
-- FROM customers c, properties p
-- WHERE c.id = p.customer_id
-- AND p.servfreq = 'Monthly';

-- query 2----------------------------------------------------------------
-- insert into contracts values(13, 70.00, 'Tim Meadows', '2018-04-04', 9);
-- insert into contracts values(14, 81.00, 'Will Ferrel', '2018-03-29', 12);
-- insert into contracts values(15, 150.00, 'Tina Fey', '2018-04-04', 99);
-- insert into contracts_pests values(1,1);
-- insert into contracts_pests values(1,2);
-- insert into contracts_pests values(1,3);

-- insert into chemicals_target_pests values(1,1);
-- insert into chemicals_target_pests values(2,1);
-- insert into chemicals_target_pests values(3,1);

-- SELECT c.price, c.salesperson, c.servicedate FROM contracts c 
--     INNER JOIN contracts_pests cp ON(c.id=cp.contract_id) 
--     INNER JOIN pests ON (cp.pests_id=pests.id) 
--     INNER JOIN chemicals_target_pests ctp ON(ctp.target_pests_id=pests.id)
--     INNER JOIN chemicals ch ON(ctp.chemical_id=ch.id)
--     WHERE ch.signalword='Warning';

-- query 3------------------------------------------------------------------
-- SELECT c.name, p.streetaddress, p.proptype
--     FROM customers c, properties p
--     WHERE p.servfreq='Monthly'
--     AND c.id = p.customer_id
--     AND p.proptype != 'RESIDENTIAL';

-- query 4-------------------------------------------------------------------
-- SELECT p.servfreq, p.streetaddress, cm.name, c.price FROM properties p 
-- INNER JOIN contracts c ON(p.id=c.property_id)
-- INNER JOIN customers cm ON(p.customer_id=cm.id)
-- WHERE c.servicedate = '2018-04-04';

-- query 5-------------------------------------------------------------------
-- SELECT r.routename, p.streetaddress, p.servfreq FROM routes r
--     INNER JOIN routes_properties rp ON(r.id=rp.route_id)
--     INNER JOIN properties p ON(rp.properties_id=p.id)
--     WHERE p.servfreq='Monthly';
-- query 6-------------------------------------------------------------------
-- SELECT avg(price) FROM contracts;

-- query 7-------------------------------------------------------------------
-- SELECT id, SUM (price)
--     FROM contracts
--     GROUP BY id;

-- query 8-------------------------------------------------------------------
-- SELECT id, SUM (price)
--     FROM contracts
--     GROUP BY id
--     HAVING SUM (price) > 80;
-- query 9-------------------------------------------------------------------

-- query 10------------------------------------------------------------------
