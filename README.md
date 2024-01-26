# HashTables

Challenge One (put your answer in your README)

Which is a better hash function:
x % n where n is a large number with several factors
x % n where n is a large prime number

A large prime number is a better in a HashTable because when the keys of a map are randomized, a composite number gives an even distribution in the map, but when the keys are patterned, the indices could collide. Examples below:

10 % 6 = 4
6 % 4 = 2
8 % 4 = 0
10 % 4 = 2
12 % 8 = 4
----------
16 % 11 = 5
14 % 11 = 3
12 % 11 = 1
13 % 11 = 2

2. Is char values summed % 599 a good hash function for strings? Why or why not?
   No because if the same string is passed in twice a collision will occur and both strings will be occupying the same hash code.

3. Take a look at Java's HashMap class and how it produces hashed values, then describe how it works. (You may have to look at other classes to find the actual mathematical function! Follow the trail of breadcrumbs...)

  Formula used by the hashcode() function to output a hash value : s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1]


   



Read me !
This Java program implements a basic hash table data structure. The HashTable class utilizes an ArrayList<String> to store values and provides methods for adding and retrieving elements based on a key. The key's hash code is computed to determine its storage index in the hash table.
