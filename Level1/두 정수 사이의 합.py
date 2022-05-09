def solution(a, b):
    answer = 0
    start=0
    end=0
    
    if a<b:
        start=a
        end=b
    else:
        start=b
        end=a
    
    for i in range(start, end+1):
        answer += i
        
    return answer