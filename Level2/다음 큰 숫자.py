def solution(n):
    answer = 0
    
    next_number = n
    while(True):
        next_number += 1
        cnt_n = list(bin(n))[2:].count('1')
        cnt_next_number = list(bin(next_number))[2:].count('1')
        if cnt_n == cnt_next_number:
            answer = next_number
            break
        
    return answer