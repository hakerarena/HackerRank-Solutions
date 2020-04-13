/*Code provided by hakerarenatutorials.wordpress.com*/
size1=int(input())
s1=set(map(int,input().split()))
size2=int(input())
s2=set(map(int,input().split()))
for i in sorted(s1.symmetric_difference(s2)):
    print(i)
