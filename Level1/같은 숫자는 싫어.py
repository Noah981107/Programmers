def solution(arr):
    answer = []
    
    answer.append(arr[0])
    for value in arr:
        if value != answer[-1]:
            answer.append(value)
            
    return answer