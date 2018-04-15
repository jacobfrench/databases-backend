import psycopg2 as p
import re

#  id |    city     |        proptype         |  servfreq   | state | streetaddress |  zipcode   | customer_id 
# ----+-------------+-------------------------+-------------+-------+---------------+------------+-------------
#   1 | RESIDENTIAL | 12309 Quiet Pasture Dr. | Bakersfield | CA    | 93312         | Bi-Monthly |           1


con = p.connect("dbname='cmps3420' user='postgres' host='localhost' password='password123'")
cur = con.cursor()

cur.execute('SELECT servfreq FROM properties') #get city
cities = cur.fetchall()

cur.execute('SELECT city FROM properties') #get proptype
proptypes = cur.fetchall()

cur.execute('SELECT zipcode FROM properties') #get servfreq
zipcodes = cur.fetchall()

cur.execute('SELECT state FROM properties') #get servfreq
states = cur.fetchall()

cur.execute('SELECT proptype FROM properties') #get streetaddress
streets = cur.fetchall()

cur.execute('SELECT proptype FROM properties') #get streetaddress
streets = cur.fetchall()

cur.execute('SELECT streetaddress FROM properties') #get streetaddress
zips = cur.fetchall()

cur.execute('SELECT customer_id FROM properties') #get streetaddress
custs = cur.fetchall()





for i in range(len(cities)):
    city = str(cities[i]).translate(None, '()')
    proptype = str(proptypes[i]).translate(None, '()')
    servfreq = str(zipcodes[i]).translate(None, '()')
    state = str(states[i]).translate(None, '()')
    street = str(streets[i]).translate(None, '()')
    zip = str(zips[i]).translate(None, '()')
    cust = str(custs[i]).translate(None, '(),')
    print 'INSERT INTO properties VALUES('+str(i+1) + ', ' + city + ' ' + proptype + ' ' + servfreq + ' ' + state + ' ' + street + ' ' + zip + ' ' + cust + ');'

print len(cities)