def solution(x):
    answer = True
    
    if x < 10 :
        return True
    else:
        tmp = list(map(int, str(x)))
        sum_number = sum(tmp)
        
        if x % sum_number == 0:
            return True
        else:
            return False
    return answer