/*Code provided by hakerarenatutorials.wordpress.com*/
for _ in range(int(input())):
    sizeA=int(input())
    A=set(map(int,input().split()))
    sizeB=int(input())
    B=set(map(int,input().split()))    
    print(A.issubset(B))
