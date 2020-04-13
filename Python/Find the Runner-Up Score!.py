/*Code provided by hakerarenatutorials.wordpress.com*/
if __name__ == '__main__':
    n = int(input())
    tmp=input().split()
    arr=list(map(int,tmp))
    arr.sort()
    g=arr.count(max(arr))
    for i in range(g):
        arr.remove(max(arr))
    print(arr[len(arr)-1])
