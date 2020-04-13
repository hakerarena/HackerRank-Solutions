/*Code provided by hakerarenatutorials.wordpress.com*/
def count_substring(string, sub_string):
    c=0
    for i in range(len(string)):
        res=string.find(sub_string,i,i+len(sub_string))
        if res!= -1:
            c+=1
    return c

