/*Code provided by hakerarenatutorials.wordpress.com*/
x=[]
for _ in range(int(input())):
    query, *li=input().split()
    if(query in 'insert'):
        pos,val=map(int, li)
        x.insert(int(pos), val)
    elif(query in 'print'):
        print(x)
    elif(query in 'remove'):
        tmp=list(map(int, li))
        x.remove(tmp[0])
    elif(query in 'append'):
        tmp=list(map(int, li))
        x.append(tmp[0])
    elif(query in 'sort'):
        x.sort()
    elif(query in 'pop'):
        x.pop()
    elif(query in 'reverse'):
        x.reverse()
