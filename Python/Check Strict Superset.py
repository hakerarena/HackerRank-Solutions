/*Code provided by hakerarenatutorials.wordpress.com*/
mainset=set(map(int,input().split()))
thumb=True
for _ in range(int(input())):
    subs=set(map(int,input().split()))
    thumbs=(mainset.issuperset(subs))
    if thumbs==False:
        break
print(thumbs)

