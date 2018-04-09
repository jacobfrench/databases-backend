with open('ins_properties.sql') as f:
    lines = f.readlines()
    for line in lines:
        s =  line.strip().split(' ')
        print( '%s %s %s %s %s %s' % (s[0], s[1], s[2], s[3], s[4], s[9]) )
        # print s




