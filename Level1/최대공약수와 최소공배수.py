from math import gcd

def solution(n, m):
    answer = []
    
    num1 = gcd(n,m)
    num2 = num1 * (n//num1) * (m//num1)
    
    answer.append(num1)
    answer.append(num2)
    
    return answer