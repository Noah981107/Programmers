def solution(arr, divisor):
    answer = []
    
    for value in arr:
        if value%divisor==0:
            answer.append(value)
            
    if len(answer)==0:
        answer.append(-1)
    else:
        answer.sort()
    
    return answer