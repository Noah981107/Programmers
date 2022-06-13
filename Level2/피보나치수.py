def solution(n):
    answer = 0
    
    arr = [value for value in range(n+1)]
    
    for i in range(2, n+1):
        arr[i] = (arr[i-1] + arr[i-2]) % 1234567 
    
    return arr[-1]