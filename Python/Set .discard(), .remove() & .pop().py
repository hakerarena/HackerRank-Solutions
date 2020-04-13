/*Code provided by hakerarenatutorials.wordpress.com*/
size=int(input())
x=set(map(int,input().split()))

for _ in range(int(input())):
    query, *li=input().split()
    if(query=='pop'):
        x.pop()
    elif(query=='remove'):
        val=list(map(int,li))
        x.remove(val[0])
    elif(query=='discard'):
        val=list(map(int,li))
        x.discard(val[0])
print(sum(x))
