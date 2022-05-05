def solution(arr):
    
    if len(arr)>0:
        arr.remove(min(arr))
    else:
        return [-1]
        
    return arr