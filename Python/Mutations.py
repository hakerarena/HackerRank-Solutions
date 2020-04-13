/*Code provided by hakerarenatutorials.wordpress.com*/
def mutate_string(string, position, character):
    l=list(string)
    for i in range(len(string)):
        if i==position:
            l[i]=character
    return "".join(l)

