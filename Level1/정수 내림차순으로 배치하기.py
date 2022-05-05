def solution(n):
    
    n = list(map(str, str(n)))
    n.sort(reverse=True)
    answer = ''.join(n)
    
    return int(answer)