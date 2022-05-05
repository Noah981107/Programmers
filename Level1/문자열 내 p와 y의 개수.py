def solution(s):
    
    text = s.lower()    
    text = list(map(str, text))

    num_p = text.count('p')
    num_y = text.count('y')

    return num_p == num_y