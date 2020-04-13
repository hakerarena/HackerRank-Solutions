/*Code provided by hakerarenatutorials.wordpress.com*/

hexa=['A','B','C','D','E','F']
def decToOct(n):
    o=''
    if n>7:
        o=decToOct(n//8)
    return o+str(n%8)

def decToHex(n):
    h=''
    if n>15:
        h=decToHex(n//16)
    if(n%16>9):
        return h+hexa[n%16-10]
    else:
        return h+str(n%16)
        
def decToBin(n):
    b=''
    if n>1:
        b=decToBin(n//2)
    return b+str(n%2)

def print_formatted(n):
    w=len(decToBin(n))
    for i in range(1,n+1):
        print(str(i).rjust(w), end=' ')
        
        print(decToOct(i).rjust(w), end=' ')
        
        print(decToHex(i).rjust(w), end=' ')
        
        print(decToBin(i).rjust(w))

