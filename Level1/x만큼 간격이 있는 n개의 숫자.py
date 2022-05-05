def solution(x, n):
    
    answer=[]
    count = 0
    tmp = x
    answer.append(x)
    
    while(True):
        
        if count == n-1:
            break
        
        tmp += x
        answer.append(tmp)
        count += 1
    
    return answer