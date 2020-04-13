/*Code provided by hakerarenatutorials.wordpress.com*/
from itertools import combinations_with_replacement as cwr
word,size=input().split()
[print(''.join(j)) for j in list(cwr(sorted(word), int(size)))]
