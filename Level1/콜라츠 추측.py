def solution(num):
    answer = 0
    
    isDone = False
    count = 0
    while(not isDone):
        
        if count == 500:
            return -1
        
        if num == 1 :
            break
        
        if num % 2 == 0:
            num //= 2
        else:
            num = (3*num) + 1
        count += 1

    return count