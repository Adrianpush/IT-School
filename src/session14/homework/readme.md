The code uses a Hashmap with the key represented by a string (product ID) and the value the frequency in of that product
ID in a clients shopping carts. In order the speed-up the process of checking if an productID has already been inserted
the HashMap, a Trie is used. If an item is not in the Trie then it isn't in the HashMap and needs to be inserted
in both.

After all products from all the shopping carts have been inserted in the HashMap, the code loops through the HashMap
entries and creates a Pair object (which has an Integer frequency and a String Product ID). It then pushes the Pair in a
PriorityQueue with a predefined Comparator that compares according to frequency. 

To find the K most frequently bought items all, the code pops K items from the PriorityQueue.  