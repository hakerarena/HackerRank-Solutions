/*Code provided by hakerarenatutorials.wordpress.com*/
from itertools import combinations
word,size=input().split()
[print(''.join(j)) for i in range(1, int(size)+1) for j in list(combinations(sorted(word), i))]
