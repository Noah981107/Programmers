from math import sqrt

def solution(n):
    answer = 0
    
    tmp = sqrt(n)
    if tmp % 1 == 0:
        answer = pow((tmp + 1),2)
    else:
        return -1
    
    return answer