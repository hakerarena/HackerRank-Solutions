/*Code provided by hakerarenatutorials.wordpress.com*/
k=int(input())
rooms=list(map(int,input().split()))
print(((sum(set(rooms))*k)-sum(rooms))//(k-1))
