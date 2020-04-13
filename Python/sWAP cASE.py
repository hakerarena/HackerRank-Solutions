/*Code provided by hakerarenatutorials.wordpress.com*/
def swap_case(s):
    tmp=''
    for letter in s:
        if letter.islower():
           tmp+=letter.upper()
        else:
            tmp+=letter.lower()
    return tmp

