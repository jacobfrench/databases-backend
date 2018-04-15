-- query 1----------------------------------------------------------------
-- SELECT c.name, p.streetaddress
-- FROM customers c, properties p
-- WHERE c.id = p.customer_id
-- AND p.servfreq = 'Monthly';
-- query 2----------------------------------------------------------------
-- insert into contracts values(1, 50.00, 'Tim Meadows', '2018-04-04', 1);
-- insert into contracts values(2, 50.00, 'Will Ferrel', '2018-03-29', 1);
-- insert into contracts values(3, 50.00, 'Tina Fey', '2018-04-04', 1);
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
SELECT c.name, p.streetaddress, p.proptype
    FROM customers c, properties p
    WHERE p.servfreq='Monthly'
    AND c.id = p.customer_id
    AND p.proptype != 'RESIDENTIAL';
