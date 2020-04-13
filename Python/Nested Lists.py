/*Code provided by hakerarenatutorials.wordpress.com*/
res=[]
for i in range(int(input())):
    res.append([input(),float(input())])
sec=sorted(list(set([m for n,m in res])))[1]
[print(n) for n,m in sorted(res) if m==sec]
