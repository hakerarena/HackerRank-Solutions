/*Code provided by hakerarenatutorials.wordpress.com*/
size=int(input())
x=set(map(int,input().split()))

for _ in range(int(input())):
    query, *li=input().split()
    tmp=set(map(int,input().split()))
    if(query=='intersection_update'):
        x.intersection_update(tmp)
    elif(query=='update'):
        x.update(tmp)
    elif(query=='symmetric_difference_update'):
        x.symmetric_difference_update(tmp)
    elif(query=='difference_update'):
        x.difference_update(tmp)
print(sum(x))
