/*Code provided by hakerarenatutorials.wordpress.com*/
if __name__ == '__main__':
    s = input()
    a=b=c=d=e="False"
    for char in s:
        if char.isalnum():
            a="True"
        if char.isalpha():
            b="True"
        elif char.isdigit():
            c="True"
        if char.islower():
            d="True"
        elif char.isupper():
            e="True"
        #if(a and b and c and d and e):
        #    break
    print(a)
    print(b)
    print(c)
    print(d)
    print(e)
